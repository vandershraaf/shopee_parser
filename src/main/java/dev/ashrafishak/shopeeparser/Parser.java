package dev.ashrafishak.shopeeparser;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.ashrafishak.shopeeparser.obj.Details;
import dev.ashrafishak.shopeeparser.obj.Item;
import dev.ashrafishak.shopeeparser.obj.OrderListCard;
import dev.ashrafishak.shopeeparser.obj.OrderMain;
import dev.ashrafishak.shopeeparser.output.OrderOutput;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Parser {

    public void parseFolder(File inputFolder, List<OrderOutput> outputs){
        if (inputFolder.isDirectory()){
            for (File input: Objects.requireNonNull(inputFolder.listFiles())){
                this.parseJSON(input, outputs);
            }
        }

    }

    public void parseJSON(File input, List<OrderOutput> outputs){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            OrderMain orderMain = objectMapper.readValue(input, OrderMain.class);
            for (Details details : orderMain.getData().getDetailsList()){
                OrderOutput output = new OrderOutput();
                // Need to multiply by 1000 as we need to convert the epoch time to millisecond-base
                // https://stackoverflow.com/questions/535004/unix-epoch-time-to-java-date-object
                Double ctime = details.getShipping().getTrackingInfo().getCtime() * 1000;
                Calendar calendar = Calendar.getInstance();
                Date date = new Date();
                date.setTime(ctime.longValue());
                calendar.setTime(date);
                // NOTE: There are order shipping info that doesn't set ctime for some reason. We will mark it as N/A
                if (ctime > 0){
                    output.setDate(this.calendarString(calendar));
                    output.setDateCalendar(calendar);
                } else {
                    output.setDate("N/A");
                }
                Double amountStr = details.getInfoCard().getFinalTotal();
                Double amountActual = amountStr / 1000;
                output.setTotalAmount(this.currencyString(amountActual));
                for (OrderListCard orderListCard : details.getInfoCard().getOrderListCards()){
                    for (Item item : orderListCard.getItems()){
                        output.getItems().add(item.getName());
                    }
                }
                outputs.add(output);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String currencyString(Double amount){
        String original = String.valueOf(amount.longValue());
        String cents = original.substring(original.length() - 2);
        String number = original.substring(0,original.length() - 2);
        return number + "." + cents;

    }

    public String calendarString(Calendar calendar){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        return format1.format(calendar.getTime());
    }


}


package dev.ashrafishak.shopeeparser.obj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order_id",
    "order_list_cards",
    "product_count",
    "subtotal",
    "final_total"
})
@Generated("jsonschema2pojo")
public class InfoCard {

    @JsonProperty("order_id")
    private Double orderId;
    @JsonProperty("order_list_cards")
    private List<OrderListCard> orderListCards = null;
    @JsonProperty("product_count")
    private Double productCount;
    @JsonProperty("subtotal")
    private Double subtotal;
    @JsonProperty("final_total")
    private Double finalTotal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("order_id")
    public Double getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(Double orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("order_list_cards")
    public List<OrderListCard> getOrderListCards() {
        return orderListCards;
    }

    @JsonProperty("order_list_cards")
    public void setOrderListCards(List<OrderListCard> orderListCards) {
        this.orderListCards = orderListCards;
    }

    @JsonProperty("product_count")
    public Double getProductCount() {
        return productCount;
    }

    @JsonProperty("product_count")
    public void setProductCount(Double productCount) {
        this.productCount = productCount;
    }

    @JsonProperty("subtotal")
    public Double getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("final_total")
    public Double getFinalTotal() {
        return finalTotal;
    }

    @JsonProperty("final_total")
    public void setFinalTotal(Double finalTotal) {
        this.finalTotal = finalTotal;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

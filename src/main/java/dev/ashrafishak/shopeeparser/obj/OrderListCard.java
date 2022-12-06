
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
    "shop_info",
    "items",
    "order_id",
    "parcel_cards"
})
@Generated("jsonschema2pojo")
public class OrderListCard {

    @JsonProperty("shop_info")
    private ShopInfo shopInfo;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("order_id")
    private Double orderId;
    @JsonProperty("parcel_cards")
    private List<ParcelCard> parcelCards = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shop_info")
    public ShopInfo getShopInfo() {
        return shopInfo;
    }

    @JsonProperty("shop_info")
    public void setShopInfo(ShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("order_id")
    public Double getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(Double orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("parcel_cards")
    public List<ParcelCard> getParcelCards() {
        return parcelCards;
    }

    @JsonProperty("parcel_cards")
    public void setParcelCards(List<ParcelCard> parcelCards) {
        this.parcelCards = parcelCards;
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

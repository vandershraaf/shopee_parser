
package dev.ashrafishak.shopeeparser.obj;

import java.util.HashMap;
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
    "item_id",
    "model_id",
    "shop_id",
    "name",
    "model_name",
    "image",
    "amount",
    "status",
    "item_price",
    "order_price",
    "snapshot_id"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("item_id")
    private Double itemId;
    @JsonProperty("model_id")
    private Double modelId;
    @JsonProperty("shop_id")
    private Double shopId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("model_name")
    private String modelName;
    @JsonProperty("image")
    private String image;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("status")
    private Double status;
    @JsonProperty("item_price")
    private Double itemPrice;
    @JsonProperty("order_price")
    private Double orderPrice;
    @JsonProperty("snapshot_id")
    private Double snapshotId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("item_id")
    public Double getItemId() {
        return itemId;
    }

    @JsonProperty("item_id")
    public void setItemId(Double itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("model_id")
    public Double getModelId() {
        return modelId;
    }

    @JsonProperty("model_id")
    public void setModelId(Double modelId) {
        this.modelId = modelId;
    }

    @JsonProperty("shop_id")
    public Double getShopId() {
        return shopId;
    }

    @JsonProperty("shop_id")
    public void setShopId(Double shopId) {
        this.shopId = shopId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("model_name")
    public String getModelName() {
        return modelName;
    }

    @JsonProperty("model_name")
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("status")
    public Double getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Double status) {
        this.status = status;
    }

    @JsonProperty("item_price")
    public Double getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("item_price")
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("order_price")
    public Double getOrderPrice() {
        return orderPrice;
    }

    @JsonProperty("order_price")
    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @JsonProperty("snapshot_id")
    public Double getSnapshotId() {
        return snapshotId;
    }

    @JsonProperty("snapshot_id")
    public void setSnapshotId(Double snapshotId) {
        this.snapshotId = snapshotId;
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

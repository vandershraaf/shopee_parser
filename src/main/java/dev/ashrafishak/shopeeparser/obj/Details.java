
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
    "status",
    "shipping",
    "info_card",
    "primary_buttons",
    "guarantee",
    "list_type"
})
@Generated("jsonschema2pojo")
public class Details {

    @JsonProperty("status")
    private Status status;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("info_card")
    private InfoCard infoCard;
    @JsonProperty("primary_buttons")
    private List<PrimaryButton> primaryButtons = null;
    @JsonProperty("guarantee")
    private Guarantee guarantee;
    @JsonProperty("list_type")
    private Double listType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("info_card")
    public InfoCard getInfoCard() {
        return infoCard;
    }

    @JsonProperty("info_card")
    public void setInfoCard(InfoCard infoCard) {
        this.infoCard = infoCard;
    }

    @JsonProperty("primary_buttons")
    public List<PrimaryButton> getPrimaryButtons() {
        return primaryButtons;
    }

    @JsonProperty("primary_buttons")
    public void setPrimaryButtons(List<PrimaryButton> primaryButtons) {
        this.primaryButtons = primaryButtons;
    }

    @JsonProperty("guarantee")
    public Guarantee getGuarantee() {
        return guarantee;
    }

    @JsonProperty("guarantee")
    public void setGuarantee(Guarantee guarantee) {
        this.guarantee = guarantee;
    }

    @JsonProperty("list_type")
    public Double getListType() {
        return listType;
    }

    @JsonProperty("list_type")
    public void setListType(Double listType) {
        this.listType = listType;
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

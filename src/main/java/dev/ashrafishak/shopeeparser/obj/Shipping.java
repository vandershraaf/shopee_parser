
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
    "tracking_info",
    "is_multi_parcel",
    "num_parcels",
    "parcel_no"
})
@Generated("jsonschema2pojo")
public class Shipping {

    @JsonProperty("tracking_info")
    private TrackingInfo trackingInfo;
    @JsonProperty("is_multi_parcel")
    private String isMultiParcel;
    @JsonProperty("num_parcels")
    private Double numParcels;
    @JsonProperty("parcel_no")
    private Double parcelNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tracking_info")
    public TrackingInfo getTrackingInfo() {
        return trackingInfo;
    }

    @JsonProperty("tracking_info")
    public void setTrackingInfo(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    @JsonProperty("is_multi_parcel")
    public String getIsMultiParcel() {
        return isMultiParcel;
    }

    @JsonProperty("is_multi_parcel")
    public void setIsMultiParcel(String isMultiParcel) {
        this.isMultiParcel = isMultiParcel;
    }

    @JsonProperty("num_parcels")
    public Double getNumParcels() {
        return numParcels;
    }

    @JsonProperty("num_parcels")
    public void setNumParcels(Double numParcels) {
        this.numParcels = numParcels;
    }

    @JsonProperty("parcel_no")
    public Double getParcelNo() {
        return parcelNo;
    }

    @JsonProperty("parcel_no")
    public void setParcelNo(Double parcelNo) {
        this.parcelNo = parcelNo;
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

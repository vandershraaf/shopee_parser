
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
    "driver_phone",
    "driver_name",
    "ctime",
    "description",
    "type"
})
@Generated("jsonschema2pojo")
public class TrackingInfo {

    @JsonProperty("driver_phone")
    private String driverPhone;
    @JsonProperty("driver_name")
    private String driverName;
    @JsonProperty("ctime")
    private Double ctime;
    @JsonProperty("description")
    private String description;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("driver_phone")
    public String getDriverPhone() {
        return driverPhone;
    }

    @JsonProperty("driver_phone")
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    @JsonProperty("driver_name")
    public String getDriverName() {
        return driverName;
    }

    @JsonProperty("driver_name")
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @JsonProperty("ctime")
    public Double getCtime() {
        return ctime;
    }

    @JsonProperty("ctime")
    public void setCtime(Double ctime) {
        this.ctime = ctime;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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

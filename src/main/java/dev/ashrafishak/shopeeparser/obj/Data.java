
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
    "details_list",
    "next_offset"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("details_list")
    private List<Details> detailsList = null;
    @JsonProperty("next_offset")
    private Double nextOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("details_list")
    public List<Details> getDetailsList() {
        return detailsList;
    }

    @JsonProperty("details_list")
    public void setDetailsList(List<Details> detailsList) {
        this.detailsList = detailsList;
    }

    @JsonProperty("next_offset")
    public Double getNextOffset() {
        return nextOffset;
    }

    @JsonProperty("next_offset")
    public void setNextOffset(Double nextOffset) {
        this.nextOffset = nextOffset;
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

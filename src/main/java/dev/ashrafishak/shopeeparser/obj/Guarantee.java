
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
    "learn_more_url",
    "is_extend_enabled"
})
@Generated("jsonschema2pojo")
public class Guarantee {

    @JsonProperty("learn_more_url")
    private String learnMoreUrl;
    @JsonProperty("is_extend_enabled")
    private Boolean isExtendEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("learn_more_url")
    public String getLearnMoreUrl() {
        return learnMoreUrl;
    }

    @JsonProperty("learn_more_url")
    public void setLearnMoreUrl(String learnMoreUrl) {
        this.learnMoreUrl = learnMoreUrl;
    }

    @JsonProperty("is_extend_enabled")
    public Boolean getIsExtendEnabled() {
        return isExtendEnabled;
    }

    @JsonProperty("is_extend_enabled")
    public void setIsExtendEnabled(Boolean isExtendEnabled) {
        this.isExtendEnabled = isExtendEnabled;
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

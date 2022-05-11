package org.apache.rocketmq.eventbridge.adapter.api.dto.connection;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ApiKeyAuthParameters {

    @SerializedName("ApiKeyName")
    private String apiKeyName;

    @SerializedName("ApiKeyValue")
    private String apiKeyValue;

}

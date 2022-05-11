package org.apache.rocketmq.eventbridge.adapter.api.dto.connection;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthParameters {

    @SerializedName("AuthorizationType")
    private String authorizationType;

    @SerializedName("ApiKeyAuthParameters")
    private ApiKeyAuthParameters apiKeyAuthParameters;

    @SerializedName("BasicAuthParameters")
    private BasicAuthParameters basicAuthParameters;

    @SerializedName("InvocationHttpParameters")
    private InvocationHttpParameters invocationHttpParameters;

    @SerializedName("OAuthParameters")
    private OAuthParameters oAuthParameters;

}

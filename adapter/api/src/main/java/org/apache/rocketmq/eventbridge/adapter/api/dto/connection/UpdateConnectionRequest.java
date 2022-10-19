/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.eventbridge.adapter.api.dto.connection;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.rocketmq.eventbridge.adapter.api.dto.BaseRequest;
import org.apache.rocketmq.eventbridge.domain.model.connection.parameter.AuthParameters;
import org.apache.rocketmq.eventbridge.domain.model.connection.parameter.NetworkParameters;

@Setter
@Getter
@ToString
public class UpdateConnectionRequest extends BaseRequest {

    @NotBlank(message = "ConnectionName is blank")
    @SerializedName("ConnectionName")
    private String connectionName;

    @SerializedName("Description")
    private String description;

    @SerializedName("NetworkParameters")
    private NetworkParameters networkParameters;

    @SerializedName("AuthParameters")
    private AuthParameters authParameters;
}

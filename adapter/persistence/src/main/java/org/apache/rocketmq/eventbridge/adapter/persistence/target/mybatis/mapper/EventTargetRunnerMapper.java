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
package org.apache.rocketmq.eventbridge.adapter.persistence.target.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.rocketmq.eventbridge.adapter.persistence.target.mybatis.dataobject.EventTargetRunnerDO;

public interface EventTargetRunnerMapper {
    int createEventTargetRunner(@Param("accountId") String accountId, @Param("eventBusName") String eventBusName,
        @Param("eventRuleName") String eventRuleName, @Param("eventTargetName") String eventTargetName,
        @Param("className") String className, @Param("config") String config, @Param("runOptions") String runOptions,
        @Param("runContext") String runContext);

    int deleteEventTargetRunner(@Param("accountId") String accountId, @Param("eventBusName") String eventBusName,
        @Param("eventRuleName") String eventRuleName, @Param("eventTargetName") String eventTargetName);

    EventTargetRunnerDO getEventTargetRunner(@Param("accountId") String accountId,
        @Param("eventBusName") String eventBusName, @Param("eventRuleName") String eventRuleName,
        @Param("eventTargetName") String eventTargetName);

    List<EventTargetRunnerDO> listEventTargetRunners(@Param("accountId") String accountId,
        @Param("eventBusName") String eventBusName, @Param("eventRuleName") String eventRuleName);

    int updateEventTargetRunner(@Param("accountId") String accountId, @Param("eventBusName") String eventBusName,
        @Param("eventRuleName") String eventRuleName, @Param("eventTargetName") String eventTargetName,
        @Param("config") String config, @Param("runOptions") String runOptions,
        @Param("runContext") String runContext);
}
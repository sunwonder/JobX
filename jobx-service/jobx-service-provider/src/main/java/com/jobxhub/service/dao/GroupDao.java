/**
 * Copyright (c) 2015 The JobX Project
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.jobxhub.service.dao;

import com.jobxhub.service.entity.AgentGroupEntity;
import com.jobxhub.service.entity.GroupEntity;
import com.jobxhub.service.vo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GroupDao {

    List<GroupEntity> getByPageBean(@Param("pager") PageBean pageBean);

    int getCount(@Param("filter") Map filter);

    int getAgentCount(@Param("groupId") Long groupId);

    List<GroupEntity> getAll();

    List<AgentGroupEntity> getForAgent();

    void save(GroupEntity group);

    void update(GroupEntity group);

    int existsCount(@Param("filter") Map<String, Object> filter);

    GroupEntity getById(@Param("groupId") Long groupId);

    void saveGroup(@Param("groupId") Long groupId,@Param("agentIds")String[] agentIds);

    void deleteGroup(@Param("groupId") Long groupId);

}
package com.springapp.modules.system.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.springapp.mapper.EntityMapper;
import com.springapp.modules.system.domain.Permission;
import com.springapp.modules.system.service.dto.PermissionDTO;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {

}


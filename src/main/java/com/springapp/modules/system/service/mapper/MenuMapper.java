package com.springapp.modules.system.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.springapp.mapper.EntityMapper;
import com.springapp.modules.system.domain.Menu;
import com.springapp.modules.system.service.dto.MenuDTO;

@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}

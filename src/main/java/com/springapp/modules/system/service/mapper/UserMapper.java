package com.springapp.modules.system.service.mapper;

import javax.swing.tree.RowMapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.springapp.mapper.EntityMapper;
import com.springapp.modules.system.domain.User;
import com.springapp.modules.system.service.dto.UserDTO;

@Mapper(componentModel = "spring",uses = {RowMapper.class, DeptMapper.class, JobMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends EntityMapper<UserDTO, User> {

}

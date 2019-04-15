package com.springapp.modules.system.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import lombok.Data;

@Data
public class RoleDTO implements Serializable {

    private Long id;

    private String name;

    private String dataScope;

    private String remark;

    private Set<PermissionDTO> permissions;

    private Set<MenuDTO> menus;

    private Set<DeptDTO> depts;

    private Timestamp createTime;
}

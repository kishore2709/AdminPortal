package com.springapp.modules.security.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springapp.modules.system.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor {

    /**
     * findByName
     * @param name
     * @return
     */
	Optional<Role> findByName(String name);

    Set<Role> findByUsers_Id(Long id);

    Set<Role> findByMenus_Id(Long id);
}

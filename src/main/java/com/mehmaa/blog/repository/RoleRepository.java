package com.mehmaa.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmaa.blog.domain.Role;

/**
 * Account repository
 * 
 * @author maachou
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String roleName);
}

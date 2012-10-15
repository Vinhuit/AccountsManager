package com.mehmaa.blog.helper;

import org.springframework.stereotype.Component;

import com.mehmaa.blog.domain.Role;
import com.mehmaa.blog.support.ValueGenerator;

/**
 * Role Helper 
 * 
 * @author maachou
 *
 */
@Component
public class RoleHelper implements EntityHelper<Role> {

    @Override
    public Role createEntityInstance() {
        return new Role();
    }

    @Override
    public Role createRandomEntity() {
        Role entity = new Role();
        entity.setRoleName(ValueGenerator.getUniqueString(10));
        return entity;
    }

    @Override
    public Role copyFrom(Role entity) {
        Role copy = new Role();
        copy.setId(entity.getId());
        copy.setRoleName(entity.getRoleName());
        return copy;
    }

    @Override
    public Role copyWithoutPkFrom(Role entity) {
        Role copy = new Role();
        copy.setRoleName(entity.getRoleName());
        return copy;
    }

    @Override
    public Role updateFrom(Role fromentity, Role toEntity) {
        toEntity.setRoleName(fromentity.getRoleName());
        return toEntity;
    }
}

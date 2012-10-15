package com.mehmaa.blog.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.mehmaa.blog.domain.Role;
import com.mehmaa.blog.helper.EntityHelper;
import com.mehmaa.blog.helper.RoleHelper;
import com.mehmaa.blog.repository.RoleRepository;

/**
 * Role Service
 * 
 * @author maachou
 *
 */
@Service
public class RoleService extends AbstractCrudService<Role> {

    private RoleRepository repository;

    private RoleHelper helper;

    @Autowired
    public RoleService(RoleRepository repository, RoleHelper helper) {
        this.repository = repository;
        this.helper = helper;
    }

    @Override
    public PagingAndSortingRepository<Role, Long> getRepository() {
        return this.repository;
    }

    @Override
    public EntityHelper<Role> getHelper() {
        return this.helper;
    }

}

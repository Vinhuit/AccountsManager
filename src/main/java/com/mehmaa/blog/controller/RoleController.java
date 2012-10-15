package com.mehmaa.blog.controller;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mehmaa.blog.domain.Role;
import com.mehmaa.blog.helper.EntityHelper;
import com.mehmaa.blog.helper.RoleHelper;
import com.mehmaa.blog.service.crud.AbstractCrudService;
import com.mehmaa.blog.service.crud.RoleService;
import com.mehmaa.blog.support.AbstractCrudController;

/**
 * Role CRUD Controller
 * 
 * @author maachou
 * 
 */

@Controller
@RequestMapping("/domain/roles/")
public class RoleController extends AbstractCrudController<Role> {

    @Autowired
    private RoleService service;

    @Autowired
    private RoleHelper helper;

    @Autowired
    private Validator validator;

    @Override
    protected String getListPageName() {
	return "rolesPage";
    }

    @Override
    protected String getCreatePageName() {
	return "createRolePage";
    }

    @Override
    protected String getUpdatePageName() {
	return "updateRolePage";
    }

    @Override
    protected AbstractCrudService<Role> getService() {
	return this.service;
    }

    @Override
    protected EntityHelper<Role> getHelper() {
	return this.helper;
    }

    @Override
    protected Validator getValidator() {
	return this.validator;
    }
}

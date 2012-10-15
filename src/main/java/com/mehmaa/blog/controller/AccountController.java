package com.mehmaa.blog.controller;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mehmaa.blog.domain.Account;
import com.mehmaa.blog.helper.AccountHelper;
import com.mehmaa.blog.helper.EntityHelper;
import com.mehmaa.blog.service.crud.AbstractCrudService;
import com.mehmaa.blog.service.crud.AccountService;
import com.mehmaa.blog.support.AbstractCrudController;

/**
 * Account CRUD controller
 * 
 * @author maachou
 * 
 */
@Controller
@RequestMapping("/domain/accounts/")
public class AccountController extends AbstractCrudController<Account> {

    @Autowired
    private AccountService service;

    @Autowired
    private AccountHelper helper;

    @Autowired
    private Validator validator;

    @Override
    protected String getListPageName() {
	return "accountsPage";
    }

    @Override
    protected String getCreatePageName() {
	return "createAccountPage";
    }

    @Override
    protected String getUpdatePageName() {
	return "updateAccountPage";
    }

    @Override
    protected AbstractCrudService<Account> getService() {
	return this.service;
    }

    @Override
    protected EntityHelper<Account> getHelper() {
	return this.helper;
    }

    @Override
    protected Validator getValidator() {
	return this.validator;
    }
}

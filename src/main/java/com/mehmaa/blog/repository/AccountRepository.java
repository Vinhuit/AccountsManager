package com.mehmaa.blog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mehmaa.blog.domain.Account;

/**
 * Account repository
 * 
 * @author maachou
 *
 */
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    Account findByEmail(String email);

}

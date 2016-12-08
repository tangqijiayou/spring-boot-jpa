package com.tangqijiayou.service.impl;

import com.tangqijiayou.model.Account;
import com.tangqijiayou.repository.IAccountRepository;
import com.tangqijiayou.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service
public class AccountServiceImpl implements IAccountService {
	
	private @Resource IAccountRepository accountRepository;
	
	
	@Override
	public Account findByPhone(final String phone) {
		
		return accountRepository.findByPhone(phone);
	}

	@Override
	public Account save(final Account account) {
		
		return accountRepository.save(account);
	}

	@Override
	public void delete(Account account) {
		accountRepository.delete(account);
	}
}

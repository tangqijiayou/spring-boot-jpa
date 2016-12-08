package com.tangqijiayou.repository;

import com.tangqijiayou.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author merry
 *
 */
public interface IAccountRepository extends JpaRepository<Account, Long>{
	/**
	 * 根据手机号查询用户表
	 * 
	 * @param phone
	 * @return
	 */
	public Account findByPhone(final String phone);
	
	/**
	 * 新增或更新用户
	 * 
	 * @param account
	 * @return
	 */
	public Account save(final Account account);

	/**
	 * 删除用户
	 *
	 * @param account
	 * @return
	 */
	public void delete(final Account account);
	
}

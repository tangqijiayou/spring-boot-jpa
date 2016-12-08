package com.tangqijiayou.controller;

import com.tangqijiayou.common.ResultJsonMsg;
import com.tangqijiayou.model.Account;
import com.tangqijiayou.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户管理操作Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	private @Resource IAccountService accountService;



	/**
	 * @api {post} /user/logout 用户退出登录
	 * @apiName logout
	 * @apiGroup user
	 * @apiVersion 0.0.1
	 * 
	 * @apiSuccessExample {JSON} Request-Example 
	 * { 
	 *   "statusCode": 200, 
	 *   "message": "昵称修改成功", 
	 *   "data": {} 
	 * }
	 * @apiSuccess {Number} statusCode 昵称修改状态 （200成功，300则出错）
	 * @apiSuccess {String} message 错误消息反馈
	 * 
	 * @apiErrorExample JSON 出错时返回内容 
	 * { 
	 *   "statusCode": 300, 
	 *   "message": "昵称修改失败",
	 *   "data": {} 
	 * }
	 *
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public ResultJsonMsg<Object> logout(HttpServletRequest request) {

		Account account = accountService.save(new Account("2","111"));
		accountService.delete(accountService.findByPhone("1"));
        return null;
    }
}
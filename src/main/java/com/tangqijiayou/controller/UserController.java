package com.tangqijiayou.controller;

import com.tangqijiayou.common.ResultJsonMsg;
import com.tangqijiayou.model.Account;
import com.tangqijiayou.service.IAccountService;
import com.tangqijiayou.vo.AccountVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    private
    @Resource
    IAccountService accountService;


    /**
     * @return
     * @api {post} /user/findAll 账户查找
     * @apiName findAll
     * @apiGroup user
     * @apiVersion 0.0.1
     * @apiSuccessExample {JSON}
     * {
     * "statusCode": 1,
     * "message": "1",
     * "data": [
     * {
     *  "id": 2,
     *  "phone": "2",
     *  "nickName": "",
     *  "password": "111",
     *  "realName": "",
     *  "logoUrl": "",
     *  "email": "",
     *  "accountStatus": 1,
     *  "role": "user",
     *  "sex": 3,
     *  "idCard": "",
     *  "nation": "",
     *  "nativePlace": "",
     *  "marriage": 1,
     *  "auth": 1,
     *  "familyAddress": "",
     *  "createTime": 1481202060000,
     *  "updateTime": 1481202060000,
     *  "del": 1
     * }
     * ]
     * }
     * @apiErrorExample {JSON}
     * {
     * "statusCode": 1001,
     * "message": "出错了",
     * "data": {}
     * }
     * @apiSuccess {Number} statusCode 接口返回状态（200为登录成功， 1001
     * 改状态码为登录失败，失效，踢出时，返回登录界面重新登录）
     * @apiSuccess {String} message 消息返回，可直接返回给用户展示（产品定义文字信息）
     * @apiSuccess (data item) {Number} id
     * @apiSuccess (data item) {String} phone 用户手机账号
     * @apiSuccess (data item) {String} nickName 用户昵称
     * @apiSuccess (data item) {String} realName 用户真实姓名
     * @apiSuccess (data item) {String} logoUrl 用户头像地址
     * @apiSuccess (data item) {String} email 用户email
     * @apiSuccess (data item) {Number} accountStatus 1为正常 2为冻结
     * @apiSuccess (data item) {String} role 用户角色 user为普通用户 admin为管理员
     * @apiSuccess (data item) {String} idCard 用户身份证
     * @apiSuccess (data item) {Number} auth 1为未认证 2为已认证
     * @apiSuccess (data item) {Number} del 1为正常，2为该用户被删除
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public ResultJsonMsg<Object> findAll(HttpServletRequest request) {

        //这里是模拟调用，所以在这里new 出我们需要的参数，比如分页对象和条件查询的vo

        //创建需要的参数
        Pageable pageable = new PageRequest(0, 20);
        AccountVo accountVo = new AccountVo();

        //设置条件,查询出id为2的记录
        accountVo.setId(2L);

        //获取对应的记录
        Page<Account> page = accountService.findAll(pageable, accountVo);

        return new ResultJsonMsg(1, "1", page.getContent());
    }
}
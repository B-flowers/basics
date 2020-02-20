package com.ofs.web.base.bean;

import com.ofs.web.knowledge.IMessageEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author gaoly
 * @version 2019/4/18/10:54
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum SystemCode implements IMessageEnum {
    /**
     *
     */
    OK("1", "操作成功"),
    /**
     *
     */
    SIGN_IN_OK("2", "登录成功"),
    /**
     *
     */
    LOGOUT_OK("3", "注销登录成功"),
    /**
     *
     */
    SIGN_IN_INPUT_FAIL("4", "账号或密码错误"),
    /**
     *
     */
    SIGN_IN_FAIL("5", "登录失败"),
    /**
     *
     */
    FAIL("-1", "操作失败"),
    /**
     *
     */
    LOGOUT_FAIL("-2", "注销登录失败"),
    /**
     *
     */
    SING_IN_INPUT_EMPTY("-5", "账户和密码均不能为空"),
    /**
     *
     */
    NOT_SING_IN("-6", "用户未登录或身份异常");

    public String code;

    public String message;


}

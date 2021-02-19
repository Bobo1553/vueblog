package com.ethanyjxiao.util;

import com.ethanyjxiao.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author Xiao Yijia
 * @create 2021/2/18 16:13
 */

public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPreviousPrincipals();
    }

}

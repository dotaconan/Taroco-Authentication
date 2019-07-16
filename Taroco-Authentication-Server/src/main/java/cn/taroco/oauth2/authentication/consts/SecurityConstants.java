package cn.taroco.oauth2.authentication.consts;

/**
 * Security 权限常量
 *
 * @author liuht
 */
public interface SecurityConstants {

    /**
     * basic
     */
    String BASIC_HEADER = "Basic ";

    /**
     * AUTHORIZATION name
     */
    String AUTHORIZATION = "Authorization";

    /**
     * 用户名信息头
     */
    String USER_NAME_HEADER = "x-user-name";

    /**
     * 用户密码信息头
     */
    String USER_ID_HEADER = "x-user-id";

    /**
     * license key
     */
    String LICENSE_KEY = "license";

    /**
     * 项目的license
     */
    String LICENSE = "made by taroco";

    /**
     * 手机号获取token路径
     */
    String MOBILE_TOKEN_URL = "/oauth/mobile";

    /**
     * 手机号登录路径
     */
    String MOBILE_LOGIN_URL = "/login/mobile";

}

package com.base.framework.core.support;

/**
*  token操作接口(防重复提交token)
*  @since                   ：2018/8/10
*  @author                  ：zc.ding@foxmail.com
*/
public interface TokenHandler {
    /**
    *  刷新token
    *  @since                   ：2018/11/14
    *  @author                  ：zc.ding@foxmail.com
    */
    void refreshSumbToken();
    /**
    *  获取服务端的token值
    *  @param submitTokenKey    token对应的key值
    *  @return java.lang.String
    *  @since                   ：2018/11/14
    *  @author                  ：zc.ding@foxmail.com
    */
    String getSumbTokenFromServer(String submitTokenKey);
    
    /**
    *  删除服务端存储的token
    *  @param submitTokenKey    token对应的key值
    *  @since                   ：2018/11/14
    *  @author                  ：zc.ding@foxmail.com
    */
    void delSumbTokenFromServer(String submitTokenKey);
}

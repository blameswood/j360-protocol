package me.j360.protocol.client.common;

/**
 * Package: me.j360.protocol.client.common
 * User: min_xu
 * Date: 2017/3/7 下午6:06
 * 说明：
 *
 * 详细的设计模式请参考org.apache.shiro.util.ThreadContext
 */
public class RequestConext {

    private static final ThreadLocal<RequestUser> user = new ThreadLocal<RequestUser>();

    public static void setUser(RequestUser requestUser) {
        user.set(requestUser);
    }

    public static RequestUser getUser(){
        return user.get();
    }

    public static void remove(){
        user.remove();
    }
}

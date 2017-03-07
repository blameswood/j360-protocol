package me.j360.protocol.sales.pool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Package: me.j360.protocol.sales.pool
 * User: min_xu
 * Date: 2017/3/7 下午5:43
 * 说明：
 */
public class Executers {


    public static LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(1000);
    public static ThreadPoolExecutor executers = new ThreadPoolExecutor(1,1,1L, TimeUnit.SECONDS,linkedBlockingDeque);

    public void run(Thread thread){
        executers.execute(thread);
    }
}

package me.j360.protocol.modules.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Package: me.j360.protocol.modules.util
 * User: min_xu
 * Date: 2017/3/14 下午6:13
 * 说明：
 */
public class RandomUtil {

    //jdk7+
    public static final ThreadLocalRandom random = ThreadLocalRandom.current();

    ////////////////// nextInt 相关/////////
    /**
     * 返回0到Intger.MAX_VALUE的随机Int, 使用内置全局普通Random.
     */
    public static int nextInt() {
        return nextInt(random);
    }

    /**
     * 返回0到Intger.MAX_VALUE的随机Int, 可传入SecureRandom或ThreadLocalRandom
     */
    public static int nextInt(Random random) {
        int n = random.nextInt();
        if (n == Integer.MIN_VALUE) {
            n = 0; // corner case
        } else {
            n = Math.abs(n);
        }

        return n;
    }

    /**
     * 返回0到max的随机Int, 使用内置全局普通Random.
     */
    public static int nextInt(int max) {
        return nextInt(random, max);
    }

    /**
     * 返回0到max的随机Int, 可传入SecureRandom或ThreadLocalRandom
     */
    public static int nextInt(Random random, int max) {
        return random.nextInt(max);
    }

}

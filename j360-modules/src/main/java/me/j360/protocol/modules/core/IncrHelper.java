package me.j360.protocol.modules.core;

/**
 * Package: me.j360.protocol.modules.core
 * User: min_xu
 * Date: 2017/3/7 下午5:53
 * 说明：
 */
public class IncrHelper {

    private static volatile IncrHelper incrHelper = null;
    private int currentNo;

    private IncrHelper() {

    }

    public IncrHelper getInstance() {
        if (null == incrHelper) {
            synchronized (IncrHelper.class) {
                if (null == incrHelper) {
                    return new IncrHelper();
                }
            }
        }
        return incrHelper;
    }


    public int add() {
        return ++this.currentNo;
    }

}

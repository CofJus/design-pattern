package com.cofjus.singleton.pojo;

/**
 * Double-Checked-Locking 双重校验锁
 * @author Ji Rui
 * @date 2021/6/6 14:43
 */
public class DCLazyMan {

    private String name;

    /**
     * volatile的作用
     * new并不是原子操作，需要禁止指令重排，防止其他线程访问到未被初始化的instance
     */
    private volatile static DCLazyMan instance;

    private DCLazyMan(String name) {
        this.name = name;
    }

    public static DCLazyMan getInstance() {
        // 第一次判空：同步代码块外，提高性能
        if (null == instance) {
            synchronized (DCLazyMan.class) {
                // 第二次判空：同步代码块内，防止多次实例化
                if (null == instance) {
                    instance = new DCLazyMan("DCLazyMan");
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

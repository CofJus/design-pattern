package com.cofjus.singleton.pojo;

/**
 * @author Ji Rui
 * @date 2021/6/6 14:33
 */
public class LazyMan {

    private String name;

    private static LazyMan instance;

    private LazyMan(String name) {
        this.name = name;
    }

    // 线程不安全
    public static LazyMan getInstance() {
        if(null == instance) {
            instance = new LazyMan("LazyMan");
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

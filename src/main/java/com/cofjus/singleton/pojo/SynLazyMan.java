package com.cofjus.singleton.pojo;

/**
 * 同步懒汉
 * @author Ji Rui
 * @date 2021/6/6 14:39
 */
public class SynLazyMan {

    private String name;

    private static SynLazyMan instance;

    private SynLazyMan(String name) {
        this.name = name;
    }

    // 每次都进行同步，并发效率低
    public static synchronized SynLazyMan getInstance() {
        if(null == instance) {
            instance = new SynLazyMan("SynLazyMan");
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

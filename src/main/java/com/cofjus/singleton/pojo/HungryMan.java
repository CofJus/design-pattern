package com.cofjus.singleton.pojo;

/**
 * 饿汉
 * @author Ji Rui
 * @date 2021/6/6 14:41
 */
public class HungryMan {

    private String name;

    /**
     * 在类加载时实例化，避免线程安全问题
     * 可等价替换为在静态代码块中实例化
     */
    private static HungryMan instance = new HungryMan("HungryMan");

    private HungryMan(String name) {
        this.name = name;
    }

    public static HungryMan getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

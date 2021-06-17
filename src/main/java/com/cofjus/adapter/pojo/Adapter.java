package com.cofjus.adapter.pojo;

/**
 * 适配器
 * @author rui.ji
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter.");
        adaptee.originMethod();
    }
}

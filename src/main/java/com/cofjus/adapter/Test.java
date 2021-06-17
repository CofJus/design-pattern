package com.cofjus.adapter;

import com.cofjus.adapter.pojo.Adaptee;
import com.cofjus.adapter.pojo.Adapter;
import com.cofjus.adapter.pojo.Target;

/**
 * @author rui.ji
 */
public class Test {
    public static void main(String... args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}

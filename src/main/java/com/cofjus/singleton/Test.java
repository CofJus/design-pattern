package com.cofjus.singleton;

import com.cofjus.singleton.pojo.DCLazyMan;
import com.cofjus.singleton.pojo.HungryMan;
import com.cofjus.singleton.pojo.LazyMan;
import com.cofjus.singleton.pojo.SynLazyMan;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Ji Rui
 * @date 2021/6/6 14:33
 */
public class Test {
    public static void main(String... args) {

        // 非线程安全懒汉
        LazyMan lazyMan = LazyMan.getInstance();
        System.out.println(lazyMan.getName());

        // 线程安全懒汉
        SynLazyMan synLazyMan = SynLazyMan.getInstance();
        System.out.println(synLazyMan.getName());

        // 饿汉
        HungryMan hungryMan = HungryMan.getInstance();
        System.out.println(hungryMan.getName());

        // 双重校验锁懒汉
        DCLazyMan dcLazyMan = DCLazyMan.getInstance();
        System.out.println(dcLazyMan.getName());

    }
}

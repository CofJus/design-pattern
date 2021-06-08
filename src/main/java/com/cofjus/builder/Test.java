package com.cofjus.builder;

import com.cofjus.builder.pojo.Computer;
import com.cofjus.builder.pojo.LombokComputer;

/**
 * 建造者模式
 * @author Ji Rui
 * @date 2021/6/6 13:46
 */
public class Test {
    public static void main(String... args) {
        Computer computer = new Computer.Builder("Intel Core i9", "SAMSUNG 3200MHZ")
                .setGpu("AMD")
                .setDisk("Western Digital")
                .setKeyBoard("Cherry")
                .build();
        System.out.println(computer.toString());

        LombokComputer lombokComputer = LombokComputer.builder()
                .cpu("Intel Core i9")
                .ram("SAMSUNG 3200MHZ")
                .gpu("AMD")
                .disk("Western Digital")
                .keyBoard("Cherry")
                .build();
        System.out.println(lombokComputer.toString());
    }
}

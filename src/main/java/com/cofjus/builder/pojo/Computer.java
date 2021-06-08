package com.cofjus.builder.pojo;

import lombok.ToString;

/**
 * without lombok
 * @author Ji Rui
 * @date 2021/6/6 13:46
 */

@ToString
public class Computer {

    private String cpu;
    private String ram;
    private String gpu;
    private String disk;
    private String keyBoard;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
        this.disk = builder.disk;
        this.keyBoard = builder.keyBoard;
    }

    public static class Builder {
        private final String cpu;
        private final String ram;
        private String gpu;
        private String disk;
        private String keyBoard;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setDisk(String disk) {
            this.disk = disk;
            return this;
        }

        public Builder setKeyBoard(String keyBoard) {
            this.keyBoard = keyBoard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }
}

package com.cofjus.builder.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author Ji Rui
 * @date 2021/6/6 14:13
 */
@Data
@Builder
@ToString
public class LombokComputer {
    private String cpu;
    private String ram;
    private String gpu;
    private String disk;
    private String keyBoard;
}

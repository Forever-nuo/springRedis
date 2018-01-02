package com.forever.study.redis;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String age;

}

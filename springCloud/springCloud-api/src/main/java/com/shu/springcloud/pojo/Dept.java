package com.shu.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)  //链式写法
//所有的实体类务必实现序列化,通讯需求
public class Dept implements Serializable {//Dept,实体类 orm 类表关系映射
    private static final long serialVersionUID = 708560364349809174L;
    private Long deptNo; //主键
    private String deptName;

    //看下这个数据存在哪个数据库的字段~ 微服务 ，一个服务对应一个数据库
    //同一个信息可能存在不同的数据库
    private String deptSource;

}

package com.zsp.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id  //主键
    @GeneratedValue //指定如何标识属性可以被初始化，例如自动、手动、或从序列表中获得的值。
    private Long id;
    @Column(name = "user_name", nullable = true, length = 20)
    private String name;
    @Column(name = "user_age", nullable = true, length = 20)
    private int age;


}

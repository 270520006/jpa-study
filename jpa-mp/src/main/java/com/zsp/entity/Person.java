package com.zsp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    @Id  //主键
    @GeneratedValue //指定如何标识属性可以被初始化，例如自动、手动、或从序列表中获得的值。
    @TableId(type = IdType.AUTO)
    private Long id;
    @Column(name = "name", nullable = true, length = 20)
    @TableField("name")
    private String name;
    @Column(name = "age", nullable = true, length = 20)
    @TableField("age")
    private int age;

    @Column(name = "gender", nullable = false, length = 20 ,columnDefinition = "COMMENT '这是性别'")
    @TableField("gender")
    private int gender=0;

    @Column(name = "classroom", nullable = false ,columnDefinition = "varchar(200) COMMENT '班级'")
    @TableField("classroom")
    private String classroom="1班";


}

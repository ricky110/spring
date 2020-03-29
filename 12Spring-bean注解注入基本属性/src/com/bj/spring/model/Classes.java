package com.bj.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Ricky
 * @Date: 2019-08-03 23:44
 */
@Component
public class Classes {
    @Value("1")

    private Long id;
    @Value("一班 ")
    private String claName;

    public Classes(Long id, String claName) {
        this.id = id;
        this.claName = claName;
    }

    public Classes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", claName='" + claName + '\'' +
                '}';
    }
}

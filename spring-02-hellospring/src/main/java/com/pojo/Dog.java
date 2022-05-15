package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private void real() {
        System.out.println("汪~");
    }

    public void shout() {
        this.real();
    }
}

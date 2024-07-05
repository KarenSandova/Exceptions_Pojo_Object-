package com.example.interface_2;

public class Clock implements Hour{
    public Clock(){

    }

    public void advance() {
        System.out.println(" the clock is ticking ");

    }

    public void stop() {
        System.out.println(" the time on the clock stops ");

    }
}

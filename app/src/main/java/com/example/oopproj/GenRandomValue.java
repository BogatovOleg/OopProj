package com.example.oopproj;

import java.util.Random;

public class GenRandomValue {
    Random random = new Random();

    public String genValue(){
        int value = random.nextInt(1000000);
        String str = String.valueOf(value);
        return str ;
    }

}

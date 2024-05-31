package com.cc.java;

import java.text.Bidi;

public class App {
    
    public static void main(String[] args) {

        Bird bird = new Bird();
        output(bird.fly());
        output(bird.hasFeathers());
      
     
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


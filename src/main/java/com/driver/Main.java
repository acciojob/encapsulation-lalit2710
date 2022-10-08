package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();
//        obj.name = "Lalit";
        //System.out.println("name has private access in com.driver.RWOnly")
       obj.setName("Lalit");
        System.out.println(obj.getName());
    }
  
}
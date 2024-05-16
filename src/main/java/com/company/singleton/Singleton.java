/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.singleton;

/**
 *
 * @author kamau
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    protected void demoMethod(){
        System.out.println("demo method for singleton");
    }
    
    public static void main(String[] args) {
        Singleton dmt = Singleton.getInstance();
        dmt.demoMethod();
        
    }
}

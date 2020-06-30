package com.xjj.java.singleIton;

/**
 * 懒汉模式的优化
 */
public class Singleton {

    private Singleton() {
    }
    private volatile static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance==null) {
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

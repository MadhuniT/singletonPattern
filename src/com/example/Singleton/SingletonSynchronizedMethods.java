package com.example.Singleton;

class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if(instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}
class SingletonSynchronized {
    private volatile static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if(instance == null) {
            synchronized (SingletonSynchronized.class) {
                if(instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}
public class SingletonSynchronizedMethods {

    public static void main(String[] args) {
        SingletonSynchronizedMethod instance = SingletonSynchronizedMethod.getInstance();

        System.out.println(instance);

        SingletonSynchronizedMethod instance1 = SingletonSynchronizedMethod.getInstance();

        System.out.println(instance1);
    }
}





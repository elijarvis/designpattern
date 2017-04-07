package com.eli.study.designpattern.singleton;

/**
 * @author eli
 * @description 双重检查锁定（Double-Checked Locking）
 *  问题根源在第4步，创建对象，可分解为：
 *  memory = allocate(); // 1：分片对象的内存空间
 *  ctorInstance(memory); / 2：初始化对象
 *  instance = memory; // 3：设置instance指向刚分片的内存地址
 *  上面3行伪代码中的2和3之间可能被重排序（在一些JIT编译器上，这种重排序是真实发生的）
 */
public class DoubleCheckedLocking {
    private static Instance instance;
    public static Instance getInstance(){
        if (instance == null){//1 第一次检查
            synchronized (DoubleCheckedLocking.class){ //2 加锁
                if (instance == null){//3 第二次检查
                    instance = new Instance(); //4 问题根源在这里
                }
            }
        }
        return instance;
    }
}

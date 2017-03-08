package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description: 模型鸭
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
    public static final String A = "ab"; // 常量A
    public static final String B = "cd"; // 常量B
    public static final String C = String.valueOf(Integer.MAX_VALUE);
    public static void main(String[] args) {
        System.out.println(C);
        String s = A + B;  // 将两个常量用+连接对s进行初始化
        String t = "abcd";
        if (s == t) {
            System.out.println("s等于t，它们是同一个对象");
        } else {
            System.out.println("s不等于t，它们不是同一个对象");
        }
    }
}

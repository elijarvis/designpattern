package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description 绿头鸭
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
    public static  void main(String[] args){
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        System.out.println(str3 == str4);//false
        String str5 = "string";
        System.out.println(str3 == str5);//true
        System.out.println(str5==str4);//false
    }
}

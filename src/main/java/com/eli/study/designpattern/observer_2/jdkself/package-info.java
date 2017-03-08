/**
 * @description:
 * @author eli
 */
package com.eli.study.designpattern.observer_2.jdkself;
/**
 *Java内置观察者模式
 * java.util.Observer观察者接口
 *    观察者模式定义了对象之间一对多的关系。
 *    主题（也就是可观察者）用一个共同的接口来更新观察者
 *    观察者和可观察者之间用松耦合方式结合（loosecoupling），可观察者不知道观察者的细节，只知道观察者实现
 *了观察者接口。
 *    使用此模式时，你可从被观察者处推（push）或拉（pull）数据（然而，推的方式被认为更“正确”）。
 *    有多个观察者时，不可以依赖特定的通知次序。
 *    Java有多种观察者模式的实现，包括了通用的java.util.Observable。
 *    要注意java.util.Observable实现上所带来的一些问题。
 *    如果有必要的话，可以实现自己的Observable，这并不难，不要害怕。
 *    Swing大量使用观察者模式，许多GUI框架也是如此。
 *    此模式也被应用在许多地方，例如：JavaBeans、RMI。
 *
 *
 *
 *    一个新的模式，以松耦合方式在一系列对象之间沟通状态。我们目前还没看到观察者模式的代表人物——MVC，以后就会看到了。
 */
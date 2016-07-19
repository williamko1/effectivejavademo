package com.qzc.effective.suggest3.strengthensingleton;


//共有成员的静态工厂方法
/**
 *  对于静态方法SingletonStaticFactory.getInstance的所有调用，都会返回一个对象的引用，所以，永远不会创建其他的实例
 *  AccessibleObject.setAccessible
 *  工厂方法的优势之一在于，他提供了灵活性：在不改变API的情况下，我们可以改变该类是否为singleton的想法
 *  工厂方法返回的是该类的唯一实例，但是，他很容易被修改，
 *  比如改成为每一个线程返回一个唯一的实例。
 *  第二个优势与泛型有关。
 *  为了使利用这其中一种方法实现的singleton类变成是可序列化的（serializable） ，仅仅在声明中加上 implements Serializable
 *  是不够的。为了维护并且保证singleton，必须声明所有的实例都是瞬时的（transient） ，并且提供一个readResolve方法
 *  否则，每次范序列化都会创建一个新的实例，
 *
 */
public class SingletonStaticFactory {
	private static final SingletonStaticFactory INSTANCE = new SingletonStaticFactory();
	private SingletonStaticFactory(){
		
	}
	public static SingletonStaticFactory getInstance(){
		return INSTANCE;
	}
	private Object readResolve(){
		return INSTANCE;
	}
}

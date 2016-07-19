package com.qzc.effective.suggest3.strengthensingleton;


//Singleton with public final field
/**
 *  私有构造器仅被调用一次，用来实例化共有的静态final域SingletonFinalField.INSTANCE.由于缺少共有的或者受保护
 *  的构造器，所遇保证了SingletonFinalFIeld的全局唯一性：一旦被实例化，只会存在一个实例，不多也不少
 *  客户端的任何行为都不会改变这一点。
 *  note：
 *  享有特权的客户端可以借助AccessibleObject.setAccessible方法,通过反射机制调用私有的构造器。
 *  如果需要抵御这种攻击,可以修改构造器，让他在被要求创建第二个实例的时候抛出异常。
 */
public class SingletonFinalField {
	public static final SingletonFinalField INSTANCE = new SingletonFinalField();
	private SingletonFinalField(){
		
	}
}

package com.qzc.effective.suggest3.strengthensingleton;


//编写一个包含单个元素的枚举类型
/**
 *  这种方法在功能上与公有域方法相近，但是它更加简洁，无偿地提供了序列化机制，绝对防止多次序列化，
 *  即使是面对复杂的序列化或者反射攻击的时候。
 *  虽然这种方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 *
 */
public enum SingletonEnum {
	INSTACE;
	public void leaveTheBuilding(){
		System.out.println("sss");
	}
	public static void main(String[] args) {
		SingletonEnum instance = SingletonEnum.INSTACE;
		instance.leaveTheBuilding();
	}
}

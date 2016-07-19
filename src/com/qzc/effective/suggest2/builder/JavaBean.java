package com.qzc.effective.suggest2.builder;


//javabean 模式
//调用一个无参构造器来创建对象，再通过setter方法来设置每个必要的参数，以及每个可选参数
//优点：弥补了重叠构造器的不足，创建实例容易，代码阅读也便利
//缺点：1.构造过程被分到了几个调用中，在构造过程中javaBean可能处在不一致的状态下
//     2.阻止把类做成不可变的可能，这就需要程序员做额外的努力来确保他的线程安全（线程不安全）
//当对象的构造完成，并且不允许在解冻前使用,通过手工“冻结”对象， 可以保证线程安全，
//但是这样写太笨拙,可能出现运行错误，因为编译器无法确保程序员会在使用之前先在对象上调用freeze方法
public class JavaBean {
	private int servingSize = -1;//reuqired ;no default value
	private int servings = -1;//required; no default value
	private int calories = 0 ;
	private int fat = 0 ;
	private int sodium = 0 ;
	private int carbohydrate = 0 ;
	public JavaBean(){
		
	}
	public int getServingSize() {
		return servingSize;
	}
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}
	public int getServings() {
		return servings;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getSodium() {
		return sodium;
	}
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	public int getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
}

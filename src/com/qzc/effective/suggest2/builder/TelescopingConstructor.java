package com.qzc.effective.suggest2.builder;

//重叠构造器
//重叠构造器模式可行，但是当有许多参数时，客户端代码会很难编写，并且仍然较难阅读
public class TelescopingConstructor {
	private final int servingSive;//(ml) required
	private final int servings; //(per container) required
	private final int calories;  //   optional
	private final int fat; // optional
	private final int sodium; // optional
	private final int carbohydrate; //optional
	
	public TelescopingConstructor(int servingSive,int servings){
		this(servingSive,servings,0);
	}
	
	public TelescopingConstructor(int servingSive,int servings,int calories ){
		this(servingSive,servings,calories,0);
	}
	public TelescopingConstructor(int servingSive,int servings,int calories,int fat ){
		this(servingSive,servings,calories,fat,0);
	}
	public TelescopingConstructor(int servingSive,int servings,int calories,int fat,int sodium ){
		this(servingSive,servings,calories,fat,sodium,0);
	}
	public TelescopingConstructor(int servingSive,int servings,int calories,
			int fat,int sodium,int carbohydrate ){
		this.servingSive = servingSive;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
}

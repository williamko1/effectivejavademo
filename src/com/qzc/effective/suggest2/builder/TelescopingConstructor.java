package com.qzc.effective.suggest2.builder;

//�ص�������
//�ص�������ģʽ���У����ǵ���������ʱ���ͻ��˴������ѱ�д��������Ȼ�����Ķ�
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

package com.qzc.effective.suggest2.builder;


//javabean ģʽ
//����һ���޲ι�����������������ͨ��setter����������ÿ����Ҫ�Ĳ������Լ�ÿ����ѡ����
//�ŵ㣺�ֲ����ص��������Ĳ��㣬����ʵ�����ף������Ķ�Ҳ����
//ȱ�㣺1.������̱��ֵ��˼��������У��ڹ��������javaBean���ܴ��ڲ�һ�µ�״̬��
//     2.��ֹ�������ɲ��ɱ�Ŀ��ܣ������Ҫ����Ա�������Ŭ����ȷ�������̰߳�ȫ���̲߳���ȫ��
//������Ĺ�����ɣ����Ҳ������ڽⶳǰʹ��,ͨ���ֹ������ᡱ���� ���Ա�֤�̰߳�ȫ��
//��������д̫��׾,���ܳ������д�����Ϊ�������޷�ȷ������Ա����ʹ��֮ǰ���ڶ����ϵ���freeze����
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

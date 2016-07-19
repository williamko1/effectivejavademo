package com.qzc.effective.suggest3.strengthensingleton;


//���г�Ա�ľ�̬��������
/**
 *  ���ھ�̬����SingletonStaticFactory.getInstance�����е��ã����᷵��һ����������ã����ԣ���Զ���ᴴ��������ʵ��
 *  AccessibleObject.setAccessible
 *  ��������������֮һ���ڣ����ṩ������ԣ��ڲ��ı�API������£����ǿ��Ըı�����Ƿ�Ϊsingleton���뷨
 *  �����������ص��Ǹ����Ψһʵ�������ǣ��������ױ��޸ģ�
 *  ����ĳ�Ϊÿһ���̷߳���һ��Ψһ��ʵ����
 *  �ڶ��������뷺���йء�
 *  Ϊ��ʹ����������һ�ַ���ʵ�ֵ�singleton�����ǿ����л��ģ�serializable�� �������������м��� implements Serializable
 *  �ǲ����ġ�Ϊ��ά�����ұ�֤singleton�������������е�ʵ������˲ʱ�ģ�transient�� �������ṩһ��readResolve����
 *  ����ÿ�η����л����ᴴ��һ���µ�ʵ����
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

package com.qzc.effective.suggest3.strengthensingleton;


//Singleton with public final field
/**
 *  ˽�й�������������һ�Σ�����ʵ�������еľ�̬final��SingletonFinalField.INSTANCE.����ȱ�ٹ��еĻ����ܱ���
 *  �Ĺ�������������֤��SingletonFinalFIeld��ȫ��Ψһ�ԣ�һ����ʵ������ֻ�����һ��ʵ��������Ҳ����
 *  �ͻ��˵��κ���Ϊ������ı���һ�㡣
 *  note��
 *  ������Ȩ�Ŀͻ��˿��Խ���AccessibleObject.setAccessible����,ͨ��������Ƶ���˽�еĹ�������
 *  �����Ҫ�������ֹ���,�����޸Ĺ������������ڱ�Ҫ�󴴽��ڶ���ʵ����ʱ���׳��쳣��
 */
public class SingletonFinalField {
	public static final SingletonFinalField INSTANCE = new SingletonFinalField();
	private SingletonFinalField(){
		
	}
}

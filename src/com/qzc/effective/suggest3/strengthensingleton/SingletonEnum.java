package com.qzc.effective.suggest3.strengthensingleton;


//��дһ����������Ԫ�ص�ö������
/**
 *  ���ַ����ڹ������빫���򷽷���������������Ӽ�࣬�޳����ṩ�����л����ƣ����Է�ֹ������л���
 *  ��ʹ����Ը��ӵ����л����߷��乥����ʱ��
 *  ��Ȼ���ַ�����û�й㷺���ã����ǵ�Ԫ�ص�ö�������Ѿ���Ϊʵ��Singleton����ѷ�����
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

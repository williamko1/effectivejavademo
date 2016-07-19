package com.qzc.effective.suggest1.staticfactory;


//第二章创建和销毁对象
//第一条：考虑用静态工厂方法替代构造器
//优势1：有名称
//优势2：不必每次调用他们的时候都创建一个新的对象
//优势3：他们可以返回原返回类型的任何子类型对象
//优势4：在创建参数化类型实例的时候，他们使代码变得更加简洁
//缺点1：类如果不含有公有的或者受保护的构造器，就不能被子类化
//缺点2：他们与其他静态方法没有任何区别

//Service interface 服务接口
public interface Service {
	//service-specific methods go here 特定服务方法
	
}

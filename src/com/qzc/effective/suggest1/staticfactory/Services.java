package com.qzc.effective.suggest1.staticfactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Noninstantiable class for service registration and access
public class Services {
	private Services(){};//Prevents instantiation 私有构造器强化不可实例化的能力
	
	//Map service names to services 用service name 注册services
	private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();
	
	//默认
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	
	//provider register API 提供者注册API
	public static void registerDefaultProvider (Provider p){
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}
	
	public static void registerProvider(String name , Provider p){
		providers.put(name, p);
	}
	
	//Service access API
	public static Service newInstance(){
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	
	public static Service newInstance(String name){
		Provider p = providers.get(name);
		if(p == null){
			throw new IllegalArgumentException("NO PROVIDER REGISTERED WITH NAME : "+ name);
		}
		return p.newService();
	}
}

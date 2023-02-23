package com.pavan.All.Util;

import java.util.Properties;

public class PropertiesUtil {
	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class","com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/alldata");
		properties.setProperty("hibernate.connection.username","root");
		properties.setProperty("hibernate.connection.password","root");
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");	 //error dialect add 
		properties.setProperty("hibernate.show_sql","true");  
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		
//		properties.setProperty("hibernate.cache.use_secound_level_cache","true");  //today 16-2-
//		properties.setProperty("hibernate.cache.region.factory_class","org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");  //today  16-2
			
		return properties;
	}

}




/**
 * 
 */
package com.ssmlearn.factory;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author fatcat
 * @date 2018年8月10日下午2:56:34
 */
public class FKSqlSessionFactory {
	/** sqlSessionFactory */
	private static SqlSessionFactory sqlSessionFactory = null;
	
	
	static{
		// 初始化创建SqlSessionFactory对象
		try {
			// 读取mybatis-config.xml文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/** 
	 * 获取SqlSession对象的静态方法
	 * @return 
	 */
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}

	/** 
	 * 获取SqlSessionFactory的静态方法
	 * @return 
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}

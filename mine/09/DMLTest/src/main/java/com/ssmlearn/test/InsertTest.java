/**
 * 
 */
package com.ssmlearn.test;

import org.apache.ibatis.session.SqlSession;

import com.ssmlearn.domain.User;
import com.ssmlearn.factory.FKSqlSessionFactory;

/**
 * @author fatcat
 * @date 2018年8月10日下午3:05:01
 */
public class InsertTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		//获得session实例
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		//创建用户
		User user = new User("jack", "男", 22);
		//插入数据
		session.insert("com.ssmlearn.mapper.UserMapper.saveUser", user);
		//提交事务
		session.commit();
		//关闭session
		session.close();
	}

}

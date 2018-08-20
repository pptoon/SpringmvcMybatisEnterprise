package com.ssmlearn.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssmlearn.domain.User;

public class MyBatisTest {
	public static void main(String[] args) {
		// 读取mybatis-config.xml文件
		InputStream inputStream;
		SqlSession session = null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			// 初始化mybatis，创建SqlSessionFactory类的实例
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
			// 创建Session实例
			session = sqlSessionFactory.openSession();
			// 创建User对象
			User user = new User("admin", "男", 26);
			// 插入数据
			session.insert("com.ssmlearn.mapper.UserMapper.save", user);
			// 提交事务
			session.commit();
		} catch (IOException e) {
			System.err.println("mybatis-config.xml文件读取失败。");
		} catch (Exception e) {
			//其他异常情况下，要回滚操作。
			if (session != null) {
				session.rollback();
			}
			e.printStackTrace();
		} finally {
			// 关闭Session
			if (session != null) {
				session.close();
			}
		}

	}
}

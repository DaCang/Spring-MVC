package com.songyl.weixin.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author Administrator
 * 访问数据库类
 */
public class DBAccess {
    public SqlSession getSqlSession() throws IOException {
	//1.通过配置文件获取数据库连接信息
	Reader reader = Resources.getResourceAsReader("com/songyl/weixin/config/Configuration.xml");
	//2.通过配置信息构建一个SqlSessionFactory
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	//3.通过SqlSessionFactory打开一个数据库会话SqlSession
	SqlSession sqlSession = sqlSessionFactory.openSession();
	return sqlSession;

    }
}

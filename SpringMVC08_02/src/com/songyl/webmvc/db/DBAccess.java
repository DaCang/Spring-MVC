package com.songyl.webmvc.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author Administrator
 * �������ݿ���
 */
public class DBAccess {
    public SqlSession getSqlSession() throws IOException {
	//1.ͨ�������ļ���ȡ���ݿ�������Ϣ
	Reader reader = Resources.getResourceAsReader("com/songyl/webmvc/config/Configuration.xml");
	//2.ͨ��������Ϣ����һ��SqlSessionFactory
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	//3.ͨ��SqlSessionFactory��һ�����ݿ�ỰSqlSession
	SqlSession sqlSession = sqlSessionFactory.openSession();
	return sqlSession;

    }
}

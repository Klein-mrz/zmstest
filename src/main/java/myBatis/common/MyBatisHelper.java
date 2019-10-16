package myBatis.common;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisHelper {

    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory=null;
        try {
            InputStream inputStream= Resources.getResourceAsStream("myBatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            if(inputStream!=null){
                inputStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("生成sqlsessionfactory失败");
        }
        return sqlSessionFactory;

    }
    public static SqlSession openSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }

    public static void closeSession(SqlSession session){
        if (session!=null){
            session.close();
        }
    }
}

package com.superwen.app;

import com.superwen.dataobject.PostRO;
import com.superwen.dataobject.UserInfoRO;
import com.superwen.mappers.UserInfoMapper;
import com.superwen.mappers.UserInfoMapper2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * @description:
 * @author: luowen<bigpao.luo@gmail.com>
 * @time: 11/24/2016.
 */
public class MyBatilsTest {
    public static void main(String[] args) throws IOException {

//        InputStream inputStream = ClassLoader.class.getResourceAsStream("/mybatis/yii2advanced-config.xml");
//        properties.load(ClassLoader.class.getResourceAsStream("/jdbc.properties") );

        Properties properties = new Properties();
        properties.load(Resources.getResourceAsStream("jdbc.properties"));
        InputStream inputStream = Resources.getResourceAsStream("mybatis/yii2advanced-config.xml");

        SqlSessionFactory sqlSessionBuilder = new SqlSessionFactoryBuilder().build(inputStream, "development", properties);

        SqlSession session = sqlSessionBuilder.openSession();
        /* UserRO userRO = session.getMapper(UserMapper.class).findById(1);
        System.out.println(userRO.getUsername()); */

        UserInfoRO userInfoRO = session.getMapper(UserInfoMapper.class).findById(1);

        System.out.print(userInfoRO.getPosts() + ":" + userInfoRO.getEmail() + ":" + userInfoRO.getUsername());

        List<PostRO> postROs = userInfoRO.getPosts();

        for (PostRO postRO : postROs) {
            System.out.println(postRO.getTitle() + ":" + postRO.getContents());
        }

        System.out.println("---------------------------------------------------");

        UserInfoRO userInfoRO1 = session.getMapper(UserInfoMapper2.class).findById(1);
        List<PostRO> postROs1 = userInfoRO1.getPosts();
        System.out.println(postROs1);

        for (PostRO postRO1 : postROs1) {
            System.out.println(postRO1.getTitle() + "<-:->" + postRO1.getContents());
        }

        session.close();



    }
}

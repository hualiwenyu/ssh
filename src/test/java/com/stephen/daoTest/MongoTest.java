package com.stephen.daoTest;

import com.stephen.mongo.order.Order;
import com.stephen.mongo.order.OrderDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Stephen(武海昊)
 * @Date: 17/8/10.
 */
//加载需要的配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml", "classpath:spring-hibernate.xml"})
public class MongoTest {


    @Autowired
    private OrderDao orderDao;

    @Test
    public void test() {
        Order order = new Order();

        order.setId("0");
        order.setAge("28");
        order.setName("胖头鱼");
        orderDao.save(order);
    }

    @Test
    public void testCount() {
        long orderCount = orderDao.count();
        System.out.println(orderCount);
    }

}

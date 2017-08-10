package com.stephen.mongo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

/**
 * @author: Stephen(武海昊)
 * @Date: 17/8/10.
 */
@Component
public class OrderDao {


    @Autowired
    private MongoOperations mongo;

    public void save(Order order) {

        mongo.save(order);
    }

    public long count() {
       return mongo.getCollection("order").count();
    }
}

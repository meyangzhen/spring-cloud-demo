package com.luntek.order.mq;

import com.alibaba.fastjson.JSON;
import com.luntek.order.model.RedisDelay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: luntek
 * @Date: 2020/7/6 17:27
 * @Description:
 */
@Component
public class MyRedisDelayedQueueListener implements RedisDelayedQueueListener<RedisDelay> {
    private static Logger logger = LoggerFactory.getLogger(MyRedisDelayedQueueListener.class);


    @Override
    public void invoke(RedisDelay redisDelay) {
        logger.info("执行..." + JSON.toJSONString(redisDelay));
    }
}

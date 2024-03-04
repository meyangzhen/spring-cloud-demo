package com.luntek.order.mq;

/**
 * @author: luntek
 * @Date: 2020/7/6 17:10
 * @Description:
 */
public interface RedisDelayedQueueListener<T> {
    void invoke(T t);
}

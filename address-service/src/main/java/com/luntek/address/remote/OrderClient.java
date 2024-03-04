package com.luntek.address.remote;

import com.luntek.common.vo.BaseReturnVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 类或方法的功能描述 :调用订单服务
 *
 * @author: yangz
 * @date: 2024-02-13 12:04
 */
@FeignClient(value = "order-service", fallback = OrderClientHystrix.class)
public interface OrderClient {
    @GetMapping("/order/getPort")
    String getPort();

    @GetMapping("/order/getOrderById/{id}")
    BaseReturnVO getOrderById(@PathVariable("id") Integer id);
} 


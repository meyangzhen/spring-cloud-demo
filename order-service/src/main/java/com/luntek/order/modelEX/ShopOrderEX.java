package com.luntek.order.modelEX;

import com.luntek.order.model.ShopOrder;
import com.luntek.order.model.ShopOrderItem;
import lombok.Data;

import java.util.List;

/**
 * 类或方法的功能描述 :订单Model扩展类
 *
 * @author: yangz
 * @date: 2024-02-03 11:00
 */
@Data
public class ShopOrderEX extends ShopOrder {

    /**
     * 订单商品
     */
    List<ShopOrderItem> shopOrderItemList;
} 


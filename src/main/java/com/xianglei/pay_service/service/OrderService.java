package com.xianglei.pay_service.service;


import com.xianglei.pay_service.domain.BsOrder;
import com.xianglei.pay_service.domain.PreBsOrder;

import java.util.List;

/**
 * @Auther: Xianglei
 * @Company: xxx
 * @Date: 2020/4/17 13:55
 * com.xianglei.reserve_service.service
 * @Description:订单服务
 */
public interface OrderService {


    List<PreBsOrder>  getMyOrders(String userId, String orderId);

    int updateOrder(BsOrder bsOrder);

    int updateOrder(String flowId) throws RuntimeException;

    int updateParkStatus(String flowId, String userId);

    int insertOrder(BsOrder bsOrder);

    int releaseParkInfo(String flowId,String userId);
}

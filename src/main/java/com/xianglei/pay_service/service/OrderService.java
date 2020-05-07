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


    int updateOrder(String flowId) throws RuntimeException;

    int releaseParkInfo(String flowId,String userId);
}

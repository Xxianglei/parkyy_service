package com.xianglei.pay_service.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.xianglei.pay_service.common.DateEnum;
import com.xianglei.pay_service.common.OrderStatusEnum;
import com.xianglei.pay_service.common.utils.DateUtils;
import com.xianglei.pay_service.common.utils.Tools;
import com.xianglei.pay_service.domain.BsOrder;
import com.xianglei.pay_service.domain.BsPark;
import com.xianglei.pay_service.domain.BsParkInfo;
import com.xianglei.pay_service.domain.PreBsOrder;
import com.xianglei.pay_service.mapper.OrderMapper;
import com.xianglei.pay_service.mapper.ParkInfoMapper;
import com.xianglei.pay_service.mapper.ParkMapper;
import com.xianglei.pay_service.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Xianglei
 * @Company: xxx
 * @Date: 2020/4/17 13:56
 * com.xianglei.reserve_service.service.impl
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    ParkInfoMapper parkInfoMapper;
    @Autowired
    ParkMapper parkMapper;



    @Transactional
    @Override
    public int updateOrder(String flowId) throws RuntimeException {
        // 查到原来的订单信息
        BsOrder myOrder = orderMapper.selectById(flowId);
        if (Tools.isNull(myOrder)) {
            throw new RuntimeException("订单不存在");
        } else {
            if (myOrder.getCharge() == "2") {
                throw new RuntimeException("你的订单已过期");
            }
            if (Tools.isNotNull(myOrder)) {
                myOrder.setCharge("1");
                String userId = myOrder.getUserId();
                // 清楚临时占用
                releaseParkInfo(flowId,userId);
            }
        }
        return orderMapper.updateById(myOrder);
    }

    @Transactional
    @Override
    public int releaseParkInfo(String flowId, String userId) {
        QueryWrapper<BsParkInfo> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("FLOW_ID", flowId);
        BsParkInfo parkInfo = parkInfoMapper.selectOne(objectQueryWrapper);
        // 当前临时拥有者设置为空
        String tempOwner = parkInfo.getTempOwner();
        String replace = tempOwner.replace(userId + "@", "");
        parkInfo.setTempOwner(replace);
        return parkInfoMapper.updateById(parkInfo);
    }

}

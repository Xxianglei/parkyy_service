package com.xianglei.pay_service.controller;


import com.xianglei.pay_service.common.BaseJson;
import com.xianglei.pay_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Xianglei
 * @Description //TODO
 * @Date 2020/4/17
 * @Param 支付PayController
 **/
@RestController
@RequestMapping("/pay")
public class PayController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/payOrder")
    public BaseJson updateOrder(@RequestParam String flowId) {
        BaseJson baseJson = new BaseJson();
        try {
            int result = orderService.updateOrder(flowId);
            if (result != 0) {
                baseJson.setMessage("支付成功");
                baseJson.setStatus(true);
                baseJson.setCode(200);
            } else {
                baseJson.setMessage("支付失败");
                baseJson.setStatus(false);
                baseJson.setCode(500);
            }
        } catch (RuntimeException e) {
            baseJson.setMessage(e.getMessage());
            baseJson.setStatus(false);
            baseJson.setCode(500);
        }

        return baseJson;
    }
}

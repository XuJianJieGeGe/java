package com.xjj.java.designpattern.strategy;

import com.xjj.java.designpattern.strategy.pay.service.Pay;
import com.xjj.java.designpattern.strategy.vo.OrderVO;

/**
 * @description: ֧��������
 * @author: xujianjie
 * @create: 2021-04-24 22:52
 **/
public class PayContext {

    private Pay pay;

    public PayContext(Pay pay) {
        this.pay = pay;
    }
    /**
     * ���þ����֧����ʽ֧��
     * @param order
     * @return
     */
    public boolean pay(OrderVO order) {
        return this.pay.pay(order);
    }


}

package com.xjj.java.designpattern.factory.factorymethod.order;

import com.xjj.java.designpattern.factory.factorymethod.pizza.LDPepeerPizza;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 10:49
 **/
public class PizzaStore {

    public static void main(String[] args) {
        //��������������ζ��pizza
//        new BJOrderPizza();

        //�����׶ظ��ֿ�ζpizza
        new LDOrderPizza();
    }

}

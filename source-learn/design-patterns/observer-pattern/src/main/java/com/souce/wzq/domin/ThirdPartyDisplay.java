package com.souce.wzq.domin;

import com.souce.wzq.interf.DisplayElement;
import com.souce.wzq.interf.Observer;

/**
 * @author wangzhengqing
 * 第三方接口，为其他第三方创建自定义的布告栏
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {
    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }
}

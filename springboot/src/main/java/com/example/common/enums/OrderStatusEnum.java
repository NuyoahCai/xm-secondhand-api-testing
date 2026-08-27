package com.example.common.enums;

public enum OrderStatusEnum {
    CANCEL("已取消"),
    NOTPAY("待支付"),
    NOTSEND("待发货"),
    NOTRECIEVE("待收货"),
    DONE("已完成");

    public String value;

    OrderStatusEnum(String value) {
        this.value = value;
    }
}

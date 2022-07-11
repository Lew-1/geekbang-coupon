package com.geekbang.coupon.template.api.beans.rules;

/**
 * @author luzhonghe
 * @date 2022/7/6 9:44 AM
 */
public class Discount {

    /**
     * 满减券--表示减掉的钱，单位是分
     * 打折券--表示折扣，100表示原价，95就是95折
     * 随机立减券--表示最高的随机立减额度
     * 晚间特别优惠券--表示日间优惠额，晚间翻倍
     */
    private Long quota;

    /**
     * 订单要达到多少钱才能用优惠券，单位为分
     */
    private Long threshold;
    
}

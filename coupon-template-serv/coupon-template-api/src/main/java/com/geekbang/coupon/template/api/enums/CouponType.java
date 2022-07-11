package com.geekbang.coupon.template.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * @author luzhonghe
 * @date 2022/7/5 4:22 PM
 */
@Getter
@AllArgsConstructor
public enum CouponType {
    
    UNKNOWN("unknown", "0"),
    MONEY_OFF("满减券", "1"),
    DISCOUNT("打折", "2"),
    RANDOM_DISCOUNT("随机减", "3"),
    LONELY_NIGHT_MONEY_OFF("晚间双倍优惠券", "4");

    /**
     * 描述
     */
    private String description;
    /**
     * 类别码
     */
    private String code;
    
    public static CouponType convert(String code) {
        return Stream.of(values())
                .filter(bean -> bean.code.equalsIgnoreCase(code))
                .findFirst()
                .orElse(UNKNOWN);
    }
    
}

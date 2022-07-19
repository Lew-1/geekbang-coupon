package com.geekbang.coupon.template.dao.converter;

import com.geekbang.coupon.template.api.enums.CouponType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author luzhonghe
 * @date 2022/7/19 6:10 PM
 */
@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType, String> {

    @Override
    public String convertToDatabaseColumn(CouponType couponCategory) {
        return couponCategory.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String code) {
        return CouponType.convert(code);
    }
}

package com.geekbang.coupon.template.dao.converter;

import com.alibaba.fastjson.JSON;
import com.geekbang.coupon.template.api.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author luzhonghe
 * @date 2022/7/19 5:56 PM
 */
@Converter
public class RuleConverter implements AttributeConverter<TemplateRule, String> {

    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule, TemplateRule.class);
    }
}

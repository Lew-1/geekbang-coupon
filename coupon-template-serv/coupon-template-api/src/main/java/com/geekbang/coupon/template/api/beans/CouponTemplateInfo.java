package com.geekbang.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author luzhonghe
 * @date 2022/7/6 4:51 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponTemplateInfo {
    
    private Long id;
    
    private String name;
    
    private String desc;
    
}

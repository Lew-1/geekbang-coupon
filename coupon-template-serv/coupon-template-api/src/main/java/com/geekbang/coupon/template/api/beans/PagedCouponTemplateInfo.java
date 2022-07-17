package com.geekbang.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author luzhonghe
 * @date 2022/7/17 6:16 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagedCouponTemplateInfo {
    
    public List<CouponTemplateInfo> templates;
    
    public int page;
    
    public long total;
    
}

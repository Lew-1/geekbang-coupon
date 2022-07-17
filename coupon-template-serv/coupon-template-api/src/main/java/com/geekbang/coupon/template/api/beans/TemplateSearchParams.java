package com.geekbang.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author luzhonghe
 * @date 2022/7/17 6:18 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TemplateSearchParams {
    
    private Long id;
    
    private String name;
    
    private String type;
    
    private Long shopId;
    
    private Boolean available;
    
    private int page;
    
    private int pageSize;
    
}

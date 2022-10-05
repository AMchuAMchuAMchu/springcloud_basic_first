package com.itheima.springcloud_basic_first.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud_basic_first
 * BelongsPackage ==> com.itheima.springcloud_basic_first.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-05 17:15:49
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@Component
public class AnimeInfo {

    private String name;

    private String character01;

    private String character02;

    private Integer releaseTime;

    private Integer id;


}

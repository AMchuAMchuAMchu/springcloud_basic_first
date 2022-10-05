package com.itheima.springcloud_basic_first.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.springcloud_basic_first.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud_basic_first
 * BelongsPackage ==> com.itheima.springcloud_basic_first.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-05 18:12:16
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
public interface AnimeInfoBase extends BaseMapper<AnimeInfo> {
}

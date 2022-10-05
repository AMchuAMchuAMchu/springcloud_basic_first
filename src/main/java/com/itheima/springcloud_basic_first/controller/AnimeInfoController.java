package com.itheima.springcloud_basic_first.controller;

import com.itheima.springcloud_basic_first.dao.AnimeInfoBase;
import com.itheima.springcloud_basic_first.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springcloud_basic_first
 * BelongsPackage ==> com.itheima.springcloud_basic_first.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-05 17:17:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Controller
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {


    @Autowired
    private AnimeInfoBase animeInfoBase;


    @GetMapping
    public Object testGetAllAnimeInfo(){
        List<AnimeInfo> animeInfos = animeInfoBase.selectList(null);
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfos.forEach(System.out::println);
        return animeInfos;
    }








}

package com.xjz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoData {
    private int id;
    private Date time;
    private int nanjing;
    private int yangzhou;
    private int taizhou;
    private int suzhou;
    private int wuxi;
    private int changzhou;
    private int zhenjiang;
    private int lianyungang;
    private int nantong;
    private int xuzhou;
    private int yangcheng;
    private int huaian;
    private int suqian;

    public Map<String,Integer> data(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("南京市",nanjing);
        map.put("扬州市",yangzhou);
        map.put("泰州市",taizhou);
        map.put("苏州市",suzhou);
        map.put("无锡市",wuxi);
        map.put("常州市",changzhou);
        map.put("镇江市",zhenjiang);
        map.put("连云港市",lianyungang);
        map.put("南通市",nantong);
        map.put("徐州市",xuzhou);
        map.put("盐城市",yangcheng);
        map.put("淮安市",huaian);
        map.put("宿迁市",suqian);
        return map;
    }
}

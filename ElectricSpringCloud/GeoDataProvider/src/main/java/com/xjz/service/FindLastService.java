package com.xjz.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xjz.entity.GeoData;
import com.xjz.repository.GeoMapper;
import com.xjz.vo.CountryVo;
import com.xjz.vo.GeoDatavo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class FindLastService {

    @Autowired
    private GeoMapper geoMapper;
//    public List<Map<String,String>> findLast(){
//        GeoData last = geoMapper.findLast();
//
//        List<Map<String,String>> arr= new ArrayList<>();
//        Map<String, Integer> data = last.data();
//        //这里占用了很多内存
//        for (String key:
//             data.keySet()) {
//            Map<String, String> coutryMaps = new HashMap<>();
//            coutryMaps.put(name,key);
//            coutryMaps.put(value, String.valueOf(data.get(key)));
//            arr.add(coutryMaps);
//        }
//
//        return arr;
//    }

    public GeoDatavo findLastData(){
        GeoData last = geoMapper.findLast();
        Map<String, Integer> data = last.data();

        GeoDatavo datavo = new GeoDatavo();
        ArrayList<CountryVo> list = new ArrayList<>();

        for (String key: data.keySet()){
            CountryVo countryVo = new CountryVo();
            countryVo.setName(key);
            countryVo.setValue(String.valueOf(data.get(key)));
            list.add(countryVo);
        }
        datavo.setGeoData(list);
        return datavo;
    }


}

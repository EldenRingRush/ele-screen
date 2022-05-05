package com.xjz.service;

import com.xjz.entity.PlayTable;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JsoupService {

    public PlayTable jsoupNews() throws IOException {
        String url = "https://news.bjx.com.cn/list?catid=111";
        Document document = Jsoup.parse(new URL(url), 10000);
        Elements el = document.getElementsByTag("a");

        List<List<String>> arrayList = new ArrayList<>();

        for (int i =80;i<115;i++){
            List<String> arr = new ArrayList<>();
            String text = el.eq(i).text();
            arr.add(text);
            arrayList.add(arr);
        }


        PlayTable playTable = new PlayTable();
        playTable.setData(arrayList);
        playTable.setRowNums(7);
        playTable.setWaitTime(2000);
        playTable.setEvenRoeBGC("transparent");
        playTable.setEvenRoeBGC("transparent");
        return playTable;
    }
}

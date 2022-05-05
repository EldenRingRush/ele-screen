package com.xjz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayTable {
    private List<List<String>> data;
    private int rowNums;
    private int waitTime;
    private String oddRowBGC;
    private String evenRoeBGC;
}

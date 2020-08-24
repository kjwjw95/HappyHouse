package com.ssafy.happyhouse.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.happyhouse.model.dto.HouseDeal;

public class ReadCSVTest {
   
   public Map<String, int[]> ReadCSV() throws FileNotFoundException, IOException {
      //List<List<String>> envAreaList = new ArrayList<>();
      int[] cnt = new int[3];
      Map<String, int[]> map = new HashMap<String, int[]>();
      String csvFileName = "res/서울시 종로구 환경 지도점검 내역 현황.csv";
      
      try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String[] dongs = values[12].split(" ");
            String key;
            if (dongs.length >= 3)
               key = dongs[2];
            else
               continue;
            
            int[] temps;
            if (map.get(key) != null)
               temps = map.get(key);
            else
               temps = new int[3];
            
            
            if (values[3].contains("폐수") || values[3].contains("수질")) {
               temps[0]++;
               map.put(key, temps);
            } else if (values[3].contains("대기")) {
               temps[1]++;
               map.put(key, temps);
            } else if (values[3].contains("유독물")) {
               temps[2]++;
               map.put(key, temps);
            }
            //envAreaList.add(Arrays.asList(values));
         }
      }
      return map;
   }
   public List<CS> ReadCSV2() throws FileNotFoundException, IOException {
      List<CS> list = new ArrayList<>();
      String csvFileName = "res/종로구_상권.csv";
      
      try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            //int num = Integer.parseInt(values[0]);
            list.add(new CS(values[0],values[1],values[4],values[6],values[8],values[18]));
            
         }
      }
      return list;
   }
}
package com.ssafy.happyhouse.util;

public class CS { //상권클래스
   private String num; // 상가업소번호
   private String name; // 상호명 
   private String code1; // 대분류
   private String code2; // 중분류
   private String code3; // 소분류
   
   private String dong; // 동 별로 상권 업소 찾기위한, 

   public CS() {
      super();
   }
   
   public CS(String num, String name, String code1, String code2, String code3, String dong) {
      super();
      this.num = num;
      this.name = name;
      this.code1 = code1;
      this.code2 = code2;
      this.code3 = code3;
      this.dong = dong;
   }

   public String getNum() {
      return num;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCode1() {
      return code1;
   }

   public void setCode1(String code1) {
      this.code1 = code1;
   }

   public String getCode2() {
      return code2;
   }

   public void setCode2(String code2) {
      this.code2 = code2;
   }

   public String getCode3() {
      return code3;
   }

   public void setCode3(String code3) {
      this.code3 = code3;
   }

   public String getDong() {
      return dong;
   }

   public void setDong(String dong) {
      this.dong = dong;
   }

   @Override
   public String toString() {
      return "CS [num=" + num + ", name=" + name + ", code1=" + code1 + ", code2=" + code2 + ", code3=" + code3
            + ", dong=" + dong + "]";
   }
   
   
   
}
package com.demo.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主综合案例
 */

public class Doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> pocker = new ArrayList<>(54);
        pocker.add("大王");
        pocker.add("小王");
        String[] colors= {"♥","♠","♦","♣"};
        String[] nums={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<nums.length;j++){
                pocker.add(colors[i]+nums[j]);
            }
        }
        //2.洗牌
        Collections.shuffle(pocker);

        //3.发牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for(int i=0;i<pocker.size();i++){
            String p = pocker.get(i);
            if(i>=51){
                dipai.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else if(i%3==2){
                player03.add(p);
            }

        }

        //4.看牌
        System.out.println("player01:"+player01);
        System.out.println("player02"+player02);
        System.out.println("player03"+player03);
        System.out.println(dipai);
    }




}

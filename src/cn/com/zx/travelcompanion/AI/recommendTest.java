package cn.com.zx.travelcompanion.AI;

import java.util.Arrays;

/**
 * Created by legotime
 */
public class recommendTest {
    public static void main(String[] args) {
        String[] products = {"dog e","cat dog f f e","cat pie cake pen h i j"};
        String s = "cat catese d e";
        recommend rec = new recommend();
        rec.fit(products);
        double[] doubles = rec.recommendFun(s);
        System.out.println(Arrays.toString(doubles));
        System.out.println(StringUtil.StringArrayDistincted(rec.getProduct()));
        SortAI cccc=new SortAI();
        //对数据进行排序，获取前十的值
        cccc.sort(doubles,(String[])StringUtil.StringArrayDistincted(rec.getProduct()).toArray(new String[0]));
    }

}
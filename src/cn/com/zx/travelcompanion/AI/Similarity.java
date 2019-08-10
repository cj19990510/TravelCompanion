package cn.com.zx.travelcompanion.AI;

import java.io.Serializable;


public interface Similarity extends Serializable{
    double distance(String s1,String s2);
}


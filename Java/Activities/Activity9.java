package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> act=new ArrayList<String>();
        act.add("ZX10R");
        act.add("Z900");
        act.add("Z1000");
        act.add("1000");
        act.add(2,"S1000");
        act.add(3,"Panigale");
        System.out.println("printing objects");
        for(String s:act){
            System.out.println(s);
        }
        System.out.println("4th of the list:" +act.get(3));
        System.out.println("to check contains:" +act.contains("Z1000"));
        System.out.println(act.size());
        act.remove("1000");
        System.out.println("updated size:" +act.size());
    }
}

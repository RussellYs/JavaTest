package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args){
       // System.out.println("hello world") ;
	   // write your code here
        // print(1,5/2);
        // num();
        // domeSet();
        //demoMap();

        try{
            exception();
        }catch (NullPointerException npe){
            print(2,"NullPointerEx");
        }catch (Exception ex){
            print(3,"Exception");
        }finally {
            print(4,"This is finally");
        }
    }

    public static void print(int num, Object obj) {
        System.out.println(String.format("%d  %s",num, obj.toString()));
    }



    public static void num(){

        List<String> strList = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i));
        }

        strList.add("9");
        strList.add("4");

        print(1,strList);

        Collections.sort(strList);

        print(2,strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        print(3,strList);

        Collections.reverse(strList);
        print(4,strList);
    }

    public static void domeSet(){
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 4; i++){
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        for(String value : strSet){
            print(1,value);
        }

        print(2,strSet);
    }


    public static void demoMap(){
        Map<String, String> strMap = new HashMap<String, String>();

        for(int i = 0; i < 4; i++){
            strMap.put(String.valueOf(i), String.valueOf(i*i));
        }

        print(1, strMap);

        for(Map.Entry<String, String> entry : strMap.entrySet() )
            print(2,entry.getKey()+":"+entry.getValue());

       // for(Map.)
    }

    public static void exception() throws Exception {

        int a = 2;
            String b = null;

            b.charAt(a);
            b.compareToIgnoreCase(b);

    }
}

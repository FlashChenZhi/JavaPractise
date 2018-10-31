package com.test;

/**
 *      联系方式
 */
public class TelephoneTest {
    public static  void main(String[] args) {
        int [] arr=new int[]{5,2,1,0,3,8,7,9,4,6};
        int [] index=new int []{2,0,0,3,1,2,5,6,2,7,2};
        int [] str={2,4,2,8,1,1,2,8,8,5,9};
        String tel="";
        String my="";
        for(int i:index){
            tel+=arr[i];
        }
        for(int j:str){
            my+=arr[j];
            if(my.length()==3 || my.length()==8){
                my+="-";
            }
        }
        System.out.println("外卖小哥电话："+tel);
        System.out.println("本人联系方式："+my);
    }

}

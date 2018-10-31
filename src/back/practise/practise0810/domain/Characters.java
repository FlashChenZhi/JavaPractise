package back.practise.practise0810.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *  Character 方法
 *  isLetter()：是否是一个字母
 *  isDigit()：是否是一个数字字符
 *  isWhitespace()：是否是一个空格
 *  isUpperCase()： 是否是大写字母
 * 	isLowerCase()： 是否是小写字母
 * 	toUpperCase()： 指定字母的大写形式
 * 	toLowerCase()： 指定字母的小写形式
 * 	toString()：    返回字符的字符串形式，字符串的长度仅为1
 *
 */
public class Characters {

        public static void main(String[] args) {

            char ch = 'a';
            char num='5';
            char bs=' ';
            char up='N';
            char lw='n';
            String s="abc";
            // Unicode 字符表示形式
            char uniChar = '\u039A';
            // 字符数组
            char[] charArray = {'a', 'b', 'c', 'd', 'e'};
            char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};

//        System.out.println(String.valueOf(charArray));
//        System.out.println(String.valueOf(helloArray));
            System.out.println("是否是一个字母："+Character.isLetter(ch)+"\t\t"+Character.isLetter(num));
            System.out.println("是否是一个数字字符："+Character.isDigit(ch)+"\t\t"+Character.isDigit(num));
            System.out.println("是否属于空格字符："+Character.isWhitespace(ch)+"\t\t"+Character.isWhitespace(bs));
            System.out.println("是否属于大写字母："+Character.isUpperCase(up)+"\t\t"+Character.isUpperCase(lw));
            System.out.println("是否属于小写字母："+Character.isLowerCase(up)+"\t\t"+Character.isLowerCase(lw));
            System.out.println("指定字母的小写形式："+Character.toLowerCase(ch)+"\t\t"+Character.toLowerCase(lw));
            System.out.println("指定字母大写形式："+Character.toUpperCase(ch)+"\t\t"+Character.toUpperCase(lw));

            //获取字符串长度
            String a="My ";
            String name="English name";
            String i="is";
            String str="Flash.Alex.Chen";
            int length=str.length();
//        System.out.println("我的英文名字："+str+"\t长度为："+length);
            System.out.println(a.concat(name)+" ".concat(i)+" ".concat(str));

            String [] arry={"Flash","Alex","Chen"};
            String ChineseName="ChenZhi";
            List list=new ArrayList();
            list.add("Name");
            System.out.println("arry数组长度："+arry.length);
            System.out.println("ChineseName字符串长度："+ChineseName.length());
            System.out.println("list集合长度："+list.size());
            System.out.println("返回字符串中指定字符第一次出现的索引位置："+ChineseName.indexOf("h"));
            System.out.println("返回字符串中指定字符出现的索引位置,从指定的索引开始搜索："+ChineseName.indexOf("h",2));
            String Str ="hello";
            System.out.println("替换后的返回值："+Str.replace("h","H")+"\t\t"+Str.replace("l","D"));

            String we = new String("Welcome-to-Runoob");
            System.out.println("1.设置分隔符返回值：");
            for(String sp:we.split("-")){
                System.out.println(sp);
            }
            System.out.println();
            System.out.println("2.分隔符设置分割份数返回值：" );
            for(String sa:we.split("-",3)){
                System.out.println(sa);
            }

            String address = new String("www.runoob.com");
            System.out.println("3.转义字符返回值：" );
            for(String st:address.split("\\.",3)){
                System.out.println(st);
            }

            String s1 = new String("acount=? and uu =? or n=?");
            System.out.println("4.多个分隔符返回值：" );
            for(String s2:s1.split("and | or")){
                System.out.println(s2);
            }
        }

}

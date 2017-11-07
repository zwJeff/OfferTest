package com.nowcoder;

public class StringDemo {

    public static void main(String[] args){
        StringDemo fd=new StringDemo();
        System.out.println(fd.replaceSpace(new StringBuffer("")));
    }

    public String replaceSpace(StringBuffer str) {
        int spaceNum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaceNum++;
            }
        }
        StringBuffer temp=new StringBuffer(str.capacity()+spaceNum*3);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                temp.append("%20");
            }else{
                temp.append(c);
            }
        }
        return  temp.toString();
    }
}

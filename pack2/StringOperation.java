/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

/**
 *
 * @author DELL
 */public class StringOperation {
    String CatStr,RevStr="";
    public String concatenate(String a,String b){
        CatStr = a+" "+b;
        return CatStr;
    }
    public String reverse(String str){
        char ch[] = str.toCharArray();
        int strlen = str.length();
        for(int i=strlen-1;i>=0;i--){
            RevStr=RevStr+ch[i];
        }
        return RevStr;
    }
}

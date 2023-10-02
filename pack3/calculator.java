/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack3;

/**
 *
 * @author DELL
 */

class UDException extends Exception{
    public UDException(String message){
        super(message);
    }
}
public class calculator {
    double div;
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(double a,double b){
        try{
            if(b==0){
            throw new Exception("Do not enter 0 as denominator.");    
            }
            else{
            div=a/b;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return div;
    }
}

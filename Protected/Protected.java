/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Protected;
import property.ParentClass;

/**
 *
 * @author DELL
 */
public class Protected {

  
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.accessproperties();
    }
    
}
 class ChildClass extends ParentClass{
    
    public void accessproperties(){
            System.out.println(protectedproperty);
            //System.out.println(defaultproperty); This will show a compile time error because defaultproperty is neither public nor protected
    }
}
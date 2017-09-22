/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Ryan Reynolds
 */
public class HelloWorld {
    
    String firstName = null;
    String lastName = null;
    
    public HelloWorld(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void sayHello(){
        System.out.println("Hello: " + firstName + " " + lastName + "!");
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld("Ryan", "Reynolds");
        hello.sayHello();
    }
    
}

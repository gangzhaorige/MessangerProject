/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Me
 */
public class Student {
    
    private String name;
    private String id;
    private String number;
    
    public Student(String name, String id, String number){
        this.name = name;
        this.id = id;
        this.number = number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
   
    
}

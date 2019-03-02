import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Me
 */
public class Class {
   
    private List<Student> listOfStudent;
    private String className;
    
    public Class(String className){
        listOfStudent = new ArrayList<>();
        this.className = className;
    }
    
    public String getClassName(){
        return className;
    }
    
    public void setClassName(String className){
        this.className = className;
    }
    
    public void addStudent(Student student){
        listOfStudent.add(student);
    }
   
    public void removeStudent(Student student){
        for(int i = 0; i < listOfStudent.size(); i++){
            if(listOfStudent.get(i).equals(student)){
                listOfStudent.remove(i);
            }
        }
    }
    public boolean isEnrolled(String id){
        for(int i = 0; i < listOfStudent.size(); i++){
            if(listOfStudent.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    
    public String getNumberByName(String name){
        for(int i = 0; i < listOfStudent.size(); i++){
            if(listOfStudent.get(i).getName().equals(name)){
                return listOfStudent.get(i).getNumber();
            }
        }
        return "";
    }
    
    @Override
    public String toString(){
        String temp = "";
        for(int i = 0; i < listOfStudent.size(); i++){
            temp = temp + "Name: " + listOfStudent.get(i).getName() + "\n";
        }
        return temp;
    }
    
}

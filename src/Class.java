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
    
    public Class(List<Student> listOfStudent,String className){
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
    
}

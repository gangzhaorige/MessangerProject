
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Me
 */
public class Messanger {

//    public static final String INDIVIDUAL = "indivitual";
//    public static final String GROUP = "group";
    private List<Class> listOfClasses;
    
    public Messanger(){
        listOfClasses = new ArrayList<>();
    }
    
    public void printAllClasses(String id){
        for(int i = 0; i < listOfClasses.size(); i++){
            if(listOfClasses.get(i).isEnrolled(id)){
                System.out.println(listOfClasses.get(i).getClassName() + " Enrolled");
            } else {
                System.out.println(listOfClasses.get(i).getClassName() +  " Not Enrolled");
            }
            
        }
    }
    
    public void addClass(Class a){
        listOfClasses.add(a);
    }
    
    
    public static void main(String[] args) {
        Class myClass = new Class("CSC340");
        Student one = new Student("Ganaa","1","+16504362846","ACa09562a3ad5afc3bde263cb646aec6f7","065c7e9feb9afa7670f9708ca0feb13e");
        Student two = new Student("Jack","2","+14153002199","ACa09562a3ad5afc3bde263cb646aec6f7","065c7e9feb9afa7670f9708ca0feb13e");
        Student three = new Student("Tom","3","99999","ACa09562a3ad5afc3bde263cb646aec6f7","065c7e9feb9afa7670f9708ca0feb13e");
        myClass.addStudent(one);
        myClass.addStudent(two);
        myClass.addStudent(three);
        Class myClass2 = new Class("CSC412");
        myClass2.addStudent(one);
        
        Messanger messanger1 = new Messanger();
        messanger1.addClass(myClass);
        messanger1.addClass(myClass2);
        
        Scanner scan = new Scanner(System.in);
        boolean isTrue = true;
        String id;
        do{
            System.out.println("Please Enter your student id: ");
            id = scan.nextLine();
            if(myClass.isEnrolled(id)){
                isTrue = false;
            }
        } while(isTrue);
        messanger1.printAllClasses(id);
        if(myClass.isEnrolled(id)){
            System.out.println(myClass.toString());
            System.out.println("Individual or Group");
            String inOrGroup = scan.nextLine();
            if(inOrGroup.equals("Individual")){
                System.out.println("Enter the name of a person:");
                String name = scan.nextLine();
                System.out.println("Enter Message");
                String messages = scan.nextLine();
                two.sendMessage(messages,one.getNumber());
                //call function
            } else {
                String message = scan.nextLine();
                //use getNumberByName + looping the arrayList of Student;
                //call function
            }
        }
        

        
    }

    
}

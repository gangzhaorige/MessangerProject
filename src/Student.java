/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Me
 */
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class Student {
    
    private String name;
    private String id;
    private String number;
    public static String accountSid; // "ACa09562a3ad5afc3bde263cb646aec6f7";
    public static String authToken;  // "065c7e9feb9afa7670f9708ca0feb13e";
    
    public Student(String name, String id, String number, String accountSid, String authToken){
        this.name = name;
        this.id = id;
        this.number = number;
        this.accountSid = accountSid;
        this.authToken = authToken;
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
    
    public void sendMessage(String messageToSend, String number){
        Twilio.init(Student.accountSid, Student.authToken);
        Message message = Message
                .creator(new PhoneNumber(number), // to
                        new PhoneNumber(this.number), // from
                        messageToSend)
                .create();
    }

        
    
    
}

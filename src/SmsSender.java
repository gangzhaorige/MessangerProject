// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACa09562a3ad5afc3bde263cb646aec6f7";
    public static final String AUTH_TOKEN =
            "065c7e9feb9afa7670f9708ca0feb13e";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+16504362846"), // to
                        new PhoneNumber("+14153002199"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
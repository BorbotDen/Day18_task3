import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 -	Отправить 2 сообщения от пользователя 1 пользователю 2
 -	Отправить 3 сообщения от пользователя 2 пользователю 1
 -	Отправить 3 сообщения от пользователя 3 пользователю 1
 -	Отправить 3 сообщения от пользователя 1 пользователю 3
 -	Отправить 1 сообщение от пользователя 3 пользователю 1

 */
public class Main {
    public static void main(String[] args) {
        User u1=new User("Tom");
        User u2=new User("Sergy");
        User u3=new User("Eva");

        u1.sendMassage(u2,"Hi ser!");
        u1.sendMassage(u2,"Whats wrong?!");

        u2.sendMassage(u1,"hi?!");
        u2.sendMassage(u1,"i sont wont see you");
        u2.sendMassage(u1,"You bad !");

        u3.sendMassage(u1,"Tom");
        u3.sendMassage(u1,"are youy?!");
        u3.sendMassage(u1,"its'i am Eva!");

        u1.sendMassage(u3,"NOOOOO one");
        u1.sendMassage(u3,"NOOOOO two");
        u1.sendMassage(u3,"NOOOOO three");

        u3.sendMassage(u1,"Why?????");

        MassageBase.showDialog(u2,u1);
        System.out.println(MassageBase.getMessages());

        u1.subscribe(u2);
        u2.subscribe(u1);
        System.out.println(u1.isFriend(u2));
        System.out.println(u2.isFriend(u1));
        u3.subscribe(u1);
        u1.subscribe(u3);
        System.out.println(u1.isFriend(u3));

    }
}
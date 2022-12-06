
import java.util.Date;

public class Message {
   /** Поля:
    -	Поле типа User “отправитель” (англ. sender) - отправитель сообщения
    -	Поле типа User “получатель” (англ. receiver) - получатель сообщения
    -	Строковое поле “текст” (англ. text) - текст сообщения
    -	Поле типа Date “дата” (англ. date) - дата отправки сообщения

    Конструктор:
    -	Конструктор должен принимать 3 аргумента - отправителя,
    получателя и текст сообщения. Также, конструктор должен назначать
    полю date текущее время (то есть время создания объекта Message).

    Методы:
    -	Геттеры на все поля
    -	Метод toString(), который возвращает строковое представление сообщения в таком формате:

    FROM: 'Имя отправителя'
    TO: 'Имя получателя'
    ON: Sun Aug 30 19:07:34 MSK 2020
    'Текст сообщения'

            *в поле ON должна быть дата создания объекта класса Message
    **/

    private String UserOut;
    private String UserIn;
    private String text;
    private Date data;

    public Message (String UserOut,String UserIn, String text){
        this.UserOut=UserOut;
        this.UserIn=UserIn;
        this.text=text;
        this.data=new Date();

    }

    public String getUserOut() {
        return UserOut;
    }

    public String getUserIn() {
        return UserIn;
    }

    public String getText() {
        return text;
    }

    public Date getData() {
        return data;
    }
    @Override
    public String toString (){

        return "\nОт: "+UserOut+"\n"+
                "Кому: "+UserIn+"\n"+
                data+"\n"+
                ""+text+"'";

    }
}

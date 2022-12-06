import java.util.ArrayList;
import java.util.List;

/**Конструктор:
 Должен принимать в качестве аргумента только имя пользователя.
 Также, должен инициализировать поле “подписки” пустым списком.

 Методы:
 -	Геттеры на все поля

 -	public void subscribe(User user) - подписывает пользователя на пользователя user

 -	public boolean isSubscribed(User user) - возвращает True, если пользователь подписан
 на пользователя user и False, если не подписан.

 -	public boolean isFriend(User user) - возвращает True, если пользователь user является
 другом и False, если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.

 -	public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user.
 Здесь должен использоваться статический метод из MessageDatabase.

 -	public String toString() - возвращает строковое представление пользователя (имя пользователя).
 */

public class User {
   private String name;
    private  List<String> folower;

    public User(String name){
        this.name = name;
        folower=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getFolower() {
        return folower;
    }

    public void subscribe(User user){
        this.folower.add(user.getName());

    }
    public boolean isFriend(User user){

        return  user.folower.contains(name)&&folower.contains(user.getName());

    }

    public void sendMassage(User user,String text){
        Message message=new Message(this.name,user.getName(),text);
        MassageBase.addNewMessage(message);

    }

    @Override
    public String toString() {
        return " Полбьзователь: "+name;
    }
}

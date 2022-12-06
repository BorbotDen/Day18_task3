
/**      1.	Воин атакует Паладина
        2.	Паладин атакует Мага
        3.	Шаман лечит Мага
        4.	Маг атакует Паладина, тип атаки М
        5.	Шаман атакует Воина, тип атаки Ф
        6.	Паладин лечит себя
        7.	Воин атакует Мага 5 раз
 */


public class Main {
    public static void main(String[] args) {

        Warrior warrior= new Warrior();
        Paladin paladin=new Paladin();
        Magician magician=new Magician();
        Shaman shaman=new Shaman();

        warrior.PhisAttack(paladin);
        System.out.println(paladin);

        paladin.PhisAttack(magician);
        System.out.println(magician);

        shaman.HealTeammate(magician);
        System.out.println(magician);

        magician.MagicAttack(paladin);
        System.out.println(paladin);

        shaman.PhisAttack(warrior);
        System.out.println(warrior);

        paladin.HealHimself();
        System.out.println(paladin);

        for (int i = 0; i < 5; i++) {
            warrior.PhisAttack(magician);
            System.out.println(magician);
        }


    }
}
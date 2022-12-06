public class Player {
    private  static final int MAX_STAMINA = 10, MIN_STANIMA = 0;

    private int stamina;
    private static int countPlayers ;

    public  Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers<6)
             countPlayers++;
    }

    public int getStamina() {

        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        if (countPlayers == 6){
            System.out.println("На поле нет свободных мест");
        }else{
            System.out.println("На поле свободных мест - "+(6-countPlayers));
        }

    }

    public void run() {
        if (stamina == MIN_STANIMA) {
            System.out.println("Игрок не в игре, он устал ранее");
        } else {
            stamina--;
            if (stamina==0) {
                System.out.println("Игрок устал и вышел из игры");
                countPlayers--;

            }
        }
    }
}
public class Paladin extends Hero implements Healer {
    public static final int HIMSELF=25;
    public static final int TEAM=10;
    public Paladin() {
    phisDef=0.5;
    phisAtt=15;
    magicDef=0.2;
    }

    @Override
    public void HealHimself() {
        if (health + HIMSELF > LIVE) {
            health = LIVE;
        } else {
        health+=HIMSELF;
        }
    }

    @Override
    public void HealTeammate(Hero hero) {
        if (hero.health + TEAM >LIVE) {
            hero.health = LIVE;
        } else {
            health+=TEAM;
        }

    }
    @Override
    public String toString(){
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}

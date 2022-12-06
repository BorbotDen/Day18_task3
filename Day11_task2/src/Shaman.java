public class Shaman extends Hero implements MagicAttack,Healer{
    public static final int HIMSELF=50;
    public static final int TEAM=30;
    int magicAtt=15;
    public Shaman(){
        phisDef=0.2;
        magicDef=0.2;
        phisAtt=10;
    }
    @Override
    public void MagicAttack(Hero hero) {
        double ultimateAttack = magicAtt * (1 - hero.magicDef);
        if (hero.health - ultimateAttack < DIE) {
            hero.health = DIE;
        } else {
            hero.health -= ultimateAttack;
        }
    }
    @Override
    public void HealHimself() {
        if (health + HIMSELF > LIVE) {
            health += LIVE;
        } else {
            health+=HIMSELF;
        }
    }

    @Override
    public void HealTeammate(Hero hero) {
        if (hero.health + TEAM > LIVE) {
            hero.health = LIVE;
        } else {
            health+=TEAM;
        }

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}

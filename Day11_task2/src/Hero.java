public abstract class Hero implements PhisAttack {
    public static final int LIVE = 100;
    public static final int DIE = 0;
    int health = LIVE;
    int phisAtt;
    double magicDef;
    double phisDef;

    public Hero() {
    }

    @Override
    public void PhisAttack(Hero hero) {
        double ultimateAttack = phisAtt * (1 - hero.phisDef);
        if (hero.health - ultimateAttack < DIE) {
            hero.health = DIE;
        } else {
            hero.health -= ultimateAttack;
        }


    }
}
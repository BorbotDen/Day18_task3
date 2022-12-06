public class Magician extends Hero implements MagicAttack {
int magicAtt;
    public Magician(){
        phisDef=0;
        magicDef=0.8;
        phisAtt=5;
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
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}

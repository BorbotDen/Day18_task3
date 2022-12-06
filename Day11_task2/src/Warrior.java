public class Warrior extends Hero {

    public Warrior() {
        phisDef=0.8;
        phisAtt=30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}

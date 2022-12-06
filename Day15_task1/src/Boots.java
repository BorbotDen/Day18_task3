public class Boots {
    private String name;
    private String size;
    private int amount;

    public Boots(String name, String size, int amount) {
        this.name = name;
        this.size = size;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return  " size=" + size + " amount=" + amount+" "+name + '\'';
    }
}

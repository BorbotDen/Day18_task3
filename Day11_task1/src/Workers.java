public abstract class Workers {
    private String name;
    private Warehouse warehouse;
    private int salary;
    private static boolean bonus;

    public Workers(String name,Warehouse warehouse) {
        this.name = name;
        this.warehouse=warehouse;
        this.salary = 0;

    }

    public String getName() {
        return name;
    }

    public void setWarehouseDelivery(int newTotalDelivery) {
        this.warehouse.setCountDeliveredOrders(newTotalDelivery);
    }
    public void setWarehousePicked(int newTotalPicked) {
        this.warehouse.setCountPickedOrders(newTotalPicked);
    }

        public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int newSalary){
        this.salary=newSalary;
    }

    public static boolean Bonus() {
        return bonus;
    }

    public static void setBonus(boolean bonus) {
        Workers.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "Имя ='" + name + '\'' +
                ", зарплата=" + salary +
                ", bonus=" + (bonus ? "Есть" : "Нет")+
                '}';
    }
}


public class Courier implements Job {
    public final static  int TAX_SALARY=100;
    private  Warehouse warehouse;
    private int salary=0;
    private  boolean bonus=false;
    public Courier(Warehouse warehouse) {
        this.warehouse=warehouse;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public int getSalary(){
        return salary;
    }
    public Warehouse getWarehouse(){
        return warehouse;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void goJob() {
        salary+=TAX_SALARY;
        warehouse.TotalDelivery();
    }

    @Override
    public void bonus() {
        if (bonus) {
            System.out.println("Бонус уже выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() >= 10_000) {
            salary += 50_000;
            bonus = true;
            return;
        } else {
            System.out.println("Нужно больше доставок");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "warehouse=" + warehouse +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}


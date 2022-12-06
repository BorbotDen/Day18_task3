public class Picker implements Job{
    public final static int TAX_SALARY=80;
    private  Warehouse warehouse;
    private int salary=0;
    private  boolean bonus=false;
    public Picker(Warehouse warehouse) {
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
        int x=getSalary()+TAX_SALARY;
        setSalary(x);
        warehouse.TotalPicked();
    }

    @Override
    public String toString() {
        return "Picker{" +
                "warehouse=" + warehouse +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public void bonus() {
        if (bonus){
            System.out.println("Бонус уже выплачен");
            return;
        }else{
            if (warehouse.getCountPickedOrders()>=10000){
                setSalary(getSalary()+70000);
                setBonus(true);
                return;
            }else{
                System.out.println("Нужно больше доставок");
            }
        }

    }
}
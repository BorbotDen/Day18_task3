public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse(){

    }
    public  int getCountPickedOrders(){
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }
    public void TotalDelivery(){
        countDeliveredOrders++;
    }
    public void TotalPicked(){
        countPickedOrders++;
    }

    @Override
    public String toString() {
        return "Warehouse{ " +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}

public class Parent {
    int Znachenie;
    private Node Up;
    private Node Down;

    public Parent(int Znachenie){
        this.Znachenie=Znachenie;
    }

    public void addNew(Node node){
        if (node.getZnach() >= Znachenie){
            Up=node;
        }else {
            Down=node;
        }

    }
}

public class Node {
    private Integer znach;
    private Node Up;
    private Node Down;

    public Node(Integer znach){
        this.znach=znach;
        Up=null;
        Down=null;
    }

    public int getZnach() {
        return znach;
    }

    public void addNode(Integer x) {

        if (znach == null) {
            znach = x;
        } else {
            if (x >= znach) {
                if (this.Up==null) {
                    this.Up = new Node(x);// Если x Больше или равен
                }else {
                    Up.addNode(x);
                }
            } else {
                if (this.Down==null) {
                    this.Down = new Node(x);// Если x меньше
                }else {
                    Down.addNode(x);
                }// Если x Менье
            }

        }
    }

    public  void printNode(Node node){
        if (node.Down!=null)
            printNode(node.Down);

        System.out.println(node.znach);
        if (node.Up!=null)
            printNode(node.Up);
    }


}


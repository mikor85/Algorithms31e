package MyPractice.GrokkingAlgorithms_Recursion4;

public class MaxListNumber {

    public static void main(String[] args) {

        Node n5 = new Node(5, null);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(10, n3);
        Node n1 = new Node(1, n2);

        System.out.println("Max List Number Value = " + maxListNumber(n1));
    }

    private static int maxListNumber(Node node) {

        if (node == null){
            return 0;
        }

        return Math.max(node.getValue(), maxListNumber(node.getNext()));
    }
}
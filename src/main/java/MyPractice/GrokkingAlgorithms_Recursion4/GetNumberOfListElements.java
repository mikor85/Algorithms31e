package MyPractice.GrokkingAlgorithms_Recursion4;

public class GetNumberOfListElements {

    public static void main(String[] args) {

        Node n5 = new Node(5, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        System.out.println("Number Of List Elements = " + getNumberOfListElements(n1));
    }

    private static int getNumberOfListElements(Node node){

        if (node == null){
            return 0;
        }

        return 1 + getNumberOfListElements(node.getNext());
    }
}
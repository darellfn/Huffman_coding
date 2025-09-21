public class Node implements Comparable<Node> {
    Character s;
    int f;
    Node v1;
    Node v2;

    public Node(Character s, int f, Node v1, Node v2) {
        this.s = s;
        this.f = f;
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public int compareTo(Node other) {
        return this.f - other.f;
    }
}
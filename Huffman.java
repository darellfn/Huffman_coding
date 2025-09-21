import java.util.PriorityQueue;
import java.util.HashMap;

public class Huffman {

    public void huffman(HashMap<Character, Integer> C) {
        PriorityQueue<Node> Q = new PriorityQueue<Node>();

        for (Character s : C.keySet()) {
            Node node = new Node(s, C.get(s), null, null);
                    System.out.println(s);

            Q.offer(node);
        }

        while (Q.size() > 1) {
            Node v1 = Q.poll();
            Node v2 = Q.poll();
            int f = v1.f + v2.f;
            Node node = new Node(null, f, v1, v2);
            Q.offer(node);
        }

       
        System.out.println(Q);
        
    }
}
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Huffman huffman = new Huffman();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        hm.put('B', 6);
        hm.put('A', 2);
        hm.put('C', 1);
        hm.put('D', 7);
        hm.put('E',4);
        hm.put('F', 3);
      
        huffman.huffman(hm);
    }
}
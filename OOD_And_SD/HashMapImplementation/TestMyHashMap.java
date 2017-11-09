package HashMapImplementation;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        System.out.println("(1) " + map.size());

        map.put("A", 1);
        System.out.println("(2.1) " + map.size());
        System.out.println("(2.2) " + map.containsKey("A"));
        System.out.println("(2.3) " + map.containsKey("B"));
        System.out.println("(2.2) " + map.get("A"));
        System.out.println("(2.3) " + map.get("B"));
        System.out.println("------------------------");

        map.put("B", 2);
        System.out.println("(3.1) " + map.size());
        System.out.println("(3.2) " + map.containsKey("A"));
        System.out.println("(3.3) " + map.containsKey("B"));
        System.out.println("(3.2) " + map.get("A"));
        System.out.println("(3.3) " + map.get("B"));
        System.out.println("------------------------");

        map.remove("A");
        System.out.println("(4.1) " + map.size());
        System.out.println("(4.2) " + map.containsKey("A"));
        System.out.println("(4.3) " + map.containsKey("B"));
        System.out.println("(4.2) " + map.get("A"));
        System.out.println("(4.3) " + map.get("B"));
        System.out.println("------------------------");

        map.put("B", 3);
        System.out.println("(3.1) " + map.size());
        System.out.println("(3.2) " + map.containsKey("A"));
        System.out.println("(3.3) " + map.containsKey("B"));
        System.out.println("(3.2) " + map.get("A"));
        System.out.println("(3.3) " + map.get("B"));
        System.out.println("------------------------");

        map.put("C", 9); map.put("D", 9); map.put("E", 9); map.put("F", 9);
        map.put("H", 9); map.put("I", 9); map.put("J", 9); map.put("K", 9);
        map.put("L", 9); map.put("M", 9); map.put("X", 9); map.put("N", 9);
        map.put("O", 9); map.put("P", 9); map.put("Q", 9); map.put("R", 9);

        System.out.println("(3.1) " + map.size());
        System.out.println("(3.2) " + map.containsKey("A"));
        System.out.println("(3.3) " + map.containsKey("B"));
        System.out.println("(3.2) " + map.get("A"));
        System.out.println("(3.3) " + map.get("B"));
    }
}

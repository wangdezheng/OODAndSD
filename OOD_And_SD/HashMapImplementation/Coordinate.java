package HashMapImplementation;

import java.util.HashMap;

/**
 * key.hashCode() determine the entry for the key in HashMap
 * key.equals() to determine whether two keys are the same key
 *
 * Contract between equals() and hashCode():
 * If one.equals(two), it is a must that one.hashCode() == two.hashCode()
 * If one.hashCode() == two.hashCode(), it is not necessary one.equals(two)
 */

public class Coordinate {
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override equals, not override hashcode()
    // two objects which are equals may have different keys in HashMap if we don't follow the contract
    // Result it that two objects which are equals can appear in the HashMap
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate another = (Coordinate) obj;
        return this.x == another.x && this.y == another.y;
    }

    //Override hashCode() to follow the contract
    //Result is that two objects which are equals can't appear together in the HashMap
    @Override
    public int hashCode() {
        return x * 101 + y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String [] args) {
        HashMap<Coordinate,Integer> map = new HashMap<>();
        map.put(new Coordinate(1,2),5);
        map.put(new Coordinate(1,2),6);
        System.out.println(map);
    }
}

package generics;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V Value) {
        this.key = key;
        this.value = Value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

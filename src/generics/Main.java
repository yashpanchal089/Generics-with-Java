public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        Integer i = box.getValue();
        System.out.println(i);
    }
}
package generics;

public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World", "Generics"};
        test3.printArray(intArray);
        test3.printArray(strArray);
        test3.display(12.1);
        test3.display(12);
    }

    public <T> void display(T element){
        System.out.println("Generic display : " + element);
    }

    public void display(Integer element){
        System.out.println("Integer display : " + element);
    }

    public <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}

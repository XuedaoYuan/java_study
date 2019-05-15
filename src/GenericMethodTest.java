public class GenericMethodTest {
    public static  <E> void printArray(E[] arr){
        for(E ele : arr){
            System.out.printf("%s", ele);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3};
        Double[] doubs = {1.1, 2.3, 4.5};
        printArray(ints);
        printArray(doubs);
    }
}

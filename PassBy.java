public class PassBy {

    public static void main(String[] args) {
//        int original1 = 1;
//        int original2 = 2;
//        swap(original1 , original2);
//        System.out.println(original1); //1
//        System.out.println(original2); //2

        //Pass the variables as array since this is an object (can be passed as reference)
        int[] originals = { 1, 2 };
        swap(originals);
        System.out.println(originals[0]); // 2
        System.out.println(originals[1]); // 1
    }

//    public static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}

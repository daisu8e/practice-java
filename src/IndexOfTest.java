public class IndexOfTest {
    public static void main(String[] args) {
        String strOriginal = "Hello readers";
        int search = strOriginal.indexOf("Hello");
        if (search == - 1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index " + search);
        }
    }
}

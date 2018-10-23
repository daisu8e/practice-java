public class CompareToTest1 {
    public static void main(String args[]) {
        String str1 = "New York";
        String str2 = new String("New York");
        String str3 = new String("Boston");
        int result = str1.compareTo(str2);
        System.out.println(result);
        result = str2.compareTo(str3);
        System.out.println(result);
    }
}

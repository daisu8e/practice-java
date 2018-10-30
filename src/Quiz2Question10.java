public class Quiz2Question10 {
  public static void main(String... args) {
    String line = "Some more silly stuff on strings!";
    int x = line.indexOf("m");
    String str = line.substring(10, 15) + line.substring(25, 25 + x);
    System.out.println(line.substring(1, 3));
  }
}

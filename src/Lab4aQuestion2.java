import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Lab4aQuestion2 {
  public static void main(String... args) {
    HashMap<Integer, String> students = new HashMap<>();

    students.put(98762, "Steve Jackson");
    students.put(96754, "Miles Murden");
    students.put(92345, "Daren Deland");
    students.put(99998, "Stephen Stander");
    students.put(91235, "Mitchell Major");
    students.put(98745, "Nestor Nicely");
    students.put(96534, "Autumn Fall");
    students.put(90987, "Lazaro Layden");

    System.out.println("Initial Key and value sets are:");
    Set<Entry<Integer, String>> values1 = students.entrySet();
    for(Entry<Integer, String> student : values1){
      System.out.println(student.getKey() + " : " + student.getValue());
    }
    System.out.println();

    students.put(90666, "Larry King");

    System.out.println("New Set of Keys:");
    Set<Entry<Integer, String>> values2 = students.entrySet();
    for(Entry<Integer, String> student : values2){
      System.out.println(student.getKey() + " : " + student.getValue());
    }
  }
}

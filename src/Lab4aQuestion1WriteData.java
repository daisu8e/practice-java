import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Lab4aQuestion1WriteData {
  public static void main(String[] args) throws IOException {

    File file = new File("test.txt");

    if (file.exists()) {
      System.out.println("The file already exists.");
    } else {
      PrintWriter output = new PrintWriter(file);
      output.println("John\t89.3\t78.9\t80.6");
      output.println("Eric\t89.9\t78.7\t90.2");
      output.println("Steve\t95.6\t90.3\t92.4");
      output.close();
    }

    Lab4aQuestion1StudentRecord studentRecord = new Lab4aQuestion1StudentRecord();
    studentRecord.print();
  }
}

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Lab4aQuestion1StudentRecord {
  public void print() throws IOException {

    File test = new File("test.txt");
    File testavg = new File("testavg.txt");

    if (!test.exists()) return;

    FileReader fileReader = new FileReader(test);
    Scanner input = new Scanner(fileReader);
    PrintWriter output = new PrintWriter(testavg);

    while (input.hasNextLine()) {
      String[] line = input.nextLine().split("\t");

      String studentName = line[0];
      double score1 = Double.parseDouble(line[1]);
      double score2 = Double.parseDouble(line[2]);
      double score3 = Double.parseDouble(line[3]);
      double average = (score1 + score2 + score3) / 3;

      output.printf("Student Name: " + studentName + "\n");
      output.printf("Test scores: %.2f %.2f %.2f\n", score1, score2, score3);
      output.printf("Average test scores: %.2f\n", average);
      output.printf("\n");
    }

    output.close();
  }
}

import java.util.Arrays;
import java.util.ArrayList;

class Marathon {
  public static void main (String[] arguments) {

    String[] names = {
      "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
      "Matt", "Alex", "Emma", "John", "James",
      "Jane", "Emily", "Daniel", "Neda", "Aaron",
      "Kate"
    };

    int[] times = {
      341, 273, 278, 329, 445,
      402, 388, 275, 243, 334,
      412, 393, 299, 343, 317,
      265
    };

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + ": " + times[i]);
    }

    System.out.println("The 1st runner is " + names[findIndexOfFirst(times)]);
    System.out.println("The 2nd runner is " + names[findIndexOfSecond(times)]);

  }

  public static int findIndexOfFirst(int[] times) {
    int first = times[0];
    for (int i = 1; i < times.length; i++) {
      if (times[i] < first) {
        first = times[i];
      }
    }
    for (int i = 0; i < times.length; i++) {
      if (times[i] == first) {
        return i;
      }
    }
    return 0;
  }

  public static int findIndexOfSecond(int[] times) {
    int firstIndex = findIndexOfFirst(times);
    int second = times[0];
    for (int i = 1; i < times.length; i++) {
      if (i == firstIndex) {
        continue;
      }
      if (times[i] < second) {
        second = times[i];
      }
    }
    for (int i = 0; i < times.length; i++) {
      if (times[i] == second) {
        return i;
      }
    }
    return 0;
  }
}
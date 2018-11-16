package main.java.kat2n.practice_java.lab5b;

import main.java.kat2n.practice_java.lab5b.question4.IntelliChat;
import main.java.kat2n.practice_java.lab5b.question4.User;

public class Question4 {
  public static void main(String[] args) {

    IntelliChat chat = new IntelliChat();
    User user = new User();

    chat.start(user);

  }
}

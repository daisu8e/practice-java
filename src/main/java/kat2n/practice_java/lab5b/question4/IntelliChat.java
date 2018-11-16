package main.java.kat2n.practice_java.lab5b.question4;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class IntelliChat {

  private static final String INITIAL_COMMENT = "Hello, let's talk.";
  private static final String FINAL_COMMENT = "Bye";
  private static final String REQUEST_COMMENT = "Say something, please";

  private static final Map<String, String> REGULAR_COMMENTS;
  static {
    REGULAR_COMMENTS = new HashMap<>();
    REGULAR_COMMENTS.put("no", "Why so negative?");
    REGULAR_COMMENTS.put("mother", "Tell me about your family.");
    REGULAR_COMMENTS.put("father", "Tell me about your family.");
    REGULAR_COMMENTS.put("sister", "Tell me about your family.");
    REGULAR_COMMENTS.put("brother", "Tell me about your family.");
    REGULAR_COMMENTS.put("sun", "The sun is very hot.");
    REGULAR_COMMENTS.put("dog", "Tell me about your pets.");
    REGULAR_COMMENTS.put("steve", "He is the best instructor.");
    REGULAR_COMMENTS.put("vancouver", "I love Vancouver, too.");
    REGULAR_COMMENTS.put("canada", "I have been there as well.");
  }

  private static final Set<String> KEYWORDS = REGULAR_COMMENTS.keySet();

  private static final List<String> RANDOM_COMMENTS;
  static {
    RANDOM_COMMENTS = new ArrayList<>();
    RANDOM_COMMENTS.add("Interesting, tell me more");
    RANDOM_COMMENTS.add("Do you really think so?");
    RANDOM_COMMENTS.add("Hmmm.");
    RANDOM_COMMENTS.add("Don’t day that!");
    RANDOM_COMMENTS.add("I am not interested.");
    RANDOM_COMMENTS.add("I love you.");
  }

  public void start(User user) {
    this.talk(INITIAL_COMMENT);

    while (true) {
      String comment = user.talk();

      if (hasNothing(comment)) {
        this.talk(REQUEST_COMMENT);
        continue;
      }

      if (hasBye(comment)) {
        this.finish();
        continue;
      }

      String keyword = findKeyword(comment);
      if (!hasNothing(keyword)) {
        this.reply(keyword);
        continue;
      }

      this.replyRandomly();
    }
  }

  private void talk(String comment) {
    System.out.print("Bot : ");
    System.out.println(comment);
  }

  private void reply(String keyword) {
    this.talk(REGULAR_COMMENTS.get(keyword));
  }

  private void replyRandomly() {
    this.talk(RANDOM_COMMENTS.get((int)(Math.random() * RANDOM_COMMENTS.size())));
  }

  private void finish() {
    this.talk(FINAL_COMMENT);
    System.exit(0);
  }

  private static boolean hasNothing(String comment) {
   return comment.equals("");
  }

  private static boolean hasBye(String comment) {
    return comment.toLowerCase().equals("bye");
  }

  private static String findKeyword(String comment) {
    for (String keyword : KEYWORDS) {
      if (comment.toLowerCase().contains(keyword)) return keyword;
    }
    return "";
  }
}

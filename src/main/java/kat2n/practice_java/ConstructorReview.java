package main.java.kat2n.practice_java;

public class ConstructorReview {

    private int id;
    private String name;

    public ConstructorReview(String name) {
        this.id = (int)(Math.random() * 100);
        this.name = name;
    }

    public static void main(String... args) {
        ConstructorReview review = new ConstructorReview("xxx");
        System.out.println(review.id);
        System.out.println(review.name);
    }
}

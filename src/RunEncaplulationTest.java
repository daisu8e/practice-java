public class RunEncaplulationTest {
    public static void main(String[] args) {
        EncaplulationTest test = new EncaplulationTest();
        test.setName("Daisuke");
        test.setId("abc");
        test.setAge(37);
        System.out.println("Name : " + test.getName() + " Age : " + test.getAge());
    }
}

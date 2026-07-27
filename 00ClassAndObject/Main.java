public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 25;

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;

        person1.introduce();
        person2.introduce();
    }
}
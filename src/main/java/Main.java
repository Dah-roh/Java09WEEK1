import Models.Animal;
import Models.Person;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Whiskey", 4, 2, 2);
        Animal fish = new Animal("Goldie", 0, 2, 2);
        Person principal = new Person("Mr Okonkwo", "72", "principal", 123465453l);
        Person teacher = new Person();
        Person student = new Person();
        Person cleaner = new Person();
        dog.checkName();
        System.out.println(dog.makeSound("bark"));
        System.out.println(fish.makeSound("dolphin noises ey ey ey ey"));
        dog.waveTail();
        principal.setName("Mr Baba-Ijebu");
        System.out.println(principal.getName());
    }
}

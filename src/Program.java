public class Program {
    public static void main(String[] args) {

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 1
        bob.displayId();    // Id = 2
        System.out.println(Person.counter); // 3

        // изменяем Person.counter
        Person.counter = 8;

        Person sam = new Person();
        sam.displayId();    // Id = 8
        System.out.println(Person.counter);
        Person kot = new Person();
        System.out.println(Person.counter);
    }
}
class Person{

    private int id;
    static int counter=1;

    Person(){
        id = counter++;
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}

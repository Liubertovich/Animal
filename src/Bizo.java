class User {
    private String name;
    private String surname;
    private int birthYear;

    User(String name, String surname, int birthYear)
    {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.surname+", "+this.birthYear+" goda";
    }
}

public class Bizo {
    public static void main(String[] args) {
        User ghost = new User("Eduard", "Pupkov", 1990);
        System.out.println(ghost);
    }
}
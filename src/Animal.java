

class Main {
    int x = 4;
    static int y = 4;
    void Gio(){
        System.out.println(Math.pow(y, 2));
    }
    public static void main(String[] args) {
        Animal duck = new Animal("Utka", "Utya", 3, 5.8, true, true, true);
        Animal.method();
        System.out.println(duck);

        Bird b = new Bird();
        b.setArea("Na ugah");
        b.setWinterFly(false);
        System.out.println(b);

        Fish f = new Fish();
        System.out.println(f);
        f.setSquama("Krupnaya");
        f.setUpStreamSwim(true);
        int x = new Main().x;

        Insect i = new Insect();
        System.out.println(i);
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.printCount();
    }
}

public class Animal {

    protected String type;
    protected String name;
    protected int age;
    protected double weight;
    protected boolean isFly;
    protected boolean isWalk;
    protected boolean isSwim;
    protected static int count=0;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    {
        type = "tiger";
        name = "Sherkhan";
    }

    public Animal() {
        count++;
    }
    public String toString(){
return "Vivod " +this.name+" "+this.type+" "+this.age+" "+this.isSwim+" "+this.isFly+" "+this.isWalk;
    }


    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        count++;
    }

    public void printCount(){
        System.out.println("kolischestvo "+count);
    }
    public void display() {
        System.out.println("Rabotaet " + getClass().getSimpleName());
        System.out.println("Tip: " + type + " Imya: " + name + " Vozrast: " + age + " Ves: " + weight);
        if (isFly) {
            System.out.println("Umeet letat");
        } else {
            System.out.println("Ne umeet letat");
        }
        if (isSwim) {
            System.out.println("Umeet plavat");
        } else {
            System.out.println("Ne umeet plavat");
        }
        if (isWalk) {
            System.out.println("Umeet hodit");
        } else {
            System.out.println("Ne umeet hodit");
        }
        System.out.println("\n\n\n");
    }

    public void rename(String newName) {
        name = newName;
    }

    public void holiday(int day) {
        weight = weight + 0.1 * day;
    }

    public void holiday(double m) {
        weight = weight + m;
    }

    public void holiday(double m, int n) {
        weight = (weight + m) * n;
    }

    public void holiday() {
        weight = weight + 0.1;
    }

     static void method() {
        System.out.println("Jivotnie sila");
    }

}

class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;

    {
        name = "Von";
        type = "Juk";
    }

    public Insect() {
        super();
        setWalk(true);
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }
}

class Bird extends Animal {

    private String area;
    private boolean winterFly;

    {
        name = "Bob";
        type = "Vorobey";
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public Bird() {
        super();
        setFly(true);
    }

    public void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }


}

class Fish extends Animal {
    private String squama;
    private boolean upStreamSwim;

    {
        name = "Sam";
        type = "Seld";
    }

    public Fish() {
        super();
        setSwim(true);
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void bul_bul() {
        System.out.println("Bul-bul");
    }
}

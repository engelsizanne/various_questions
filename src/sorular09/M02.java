package sorular09;

public class M02 {
    private String color;
    private int height;
    private int length;

    public M02(int length, int theHeight) {

        length = this.length;
        height = theHeight;
        this.color = "white";

    }

    public static void main(String[] args) {
        M02 b = new M02(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}

/*
 // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    package sorular09;

public class M02 {
    Temp()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    M02(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    M02(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        new Temp();
    }
}
 */


/*

 */
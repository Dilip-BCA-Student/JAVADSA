package oopsinjava;

class A {
    private int rollno;
    double percentage;
    String name;
    final String con = "India";

    public A(int roll, double per, String name) {
        rollno = roll;
        percentage = per;
        this.name = name;

    }

    public void Seters(int n) {
        rollno = n;
    }

    public int geters() {
        return rollno;
    }
}

public class constructotr {

    public static void main(String args[]) {
        A obj = new A(55, 75.4, "DK");
        obj.name = "Dilip Raj";

        System.out.println(obj.con);

        System.out.println(obj.name + " " + obj.rollno + " " + obj.percentage);
        // A obj2 = new A();
        // obj2.rollno = 60;
        // obj2.percentage = 78.45;
        // obj2.name = "Dilip Kumar";
        // System.out.println(obj2.name + " " + obj2.rollno + " " + obj2.percentage);

    }
}

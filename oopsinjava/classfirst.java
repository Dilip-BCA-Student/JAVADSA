package oopsinjava;

public class classfirst {
    // class is student file in same package

    public static void main(String args[]) {
        Student s = new Student();
        s.name = "Dilip kumar";
        s.roll = 59;
        s.percentage = 70;

        Student d = new Student();
        d.name = "Kundan kumar";
        d.roll = 24;
        d.percentage = 70;

        Student c = new Student();
        c.name = "chhotu";
        c.roll = 44;
        c.percentage = 79;

        System.out.println(s.name + "  " + s.roll + "   " + s.percentage);
        System.out.println(d.name + "  " + d.roll + "   " + d.percentage);
        System.out.println(c.name + "  " + c.roll + "   " + c.percentage);

    }

}

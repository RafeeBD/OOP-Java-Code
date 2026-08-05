// object to object copy in java

class copy {
    int x;
    int y;

    copy() {
        this.x = 0;
        this.y = 0;
    }

    copy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    copy(copy obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    void copyfrom(copy obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(" object to object copy demonstration :");

        copy ob1 = new copy(10, 20);
        System.out.print("original object (ob1): ");
        ob1.display();

        copy ob2 = new copy(ob1);
        System.out.print("copied object using copy constructor (ob2): ");
        ob2.display();

        copy ob3 = new copy();
        ob3.copyfrom(ob1);
        System.out.print("copied object using copyfrom() method (ob3): ");
        ob3.display();

        System.out.println("\n--- modifying original object (ob1.x = 99, ob1.y = 88) ---");
        ob1.x = 99;
        ob1.y = 88;

        System.out.print("modified ob1: ");
        ob1.display();
        System.out.print("ob2: ");
        ob2.display();
        System.out.print("ob3: ");
        ob3.display();
    }
}

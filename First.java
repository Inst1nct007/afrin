import bag.A;

class B extends A {
    void print() {
        System.out.println(data);
    }
}

public class First extends A {
    public static void main(String[] args) {
        A newObj = new A();
        System.out.println(newObj.data);
    }
}
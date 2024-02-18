package bag;

public class A {
    protected static int data = 5;

    void setData() {
        data = 10;
        System.out.println(data);
    }
}

class B {
    void func() {
        A newObj = new A();
        System.out.println(newObj.data);
    }
}
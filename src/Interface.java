
interface Test {
    void meth1();  //by default these methods are public and abstract

    void meth2();
}
//    class My extends Test  //this will give an error because we cannot extend an interface we can implement it.\

class My implements Test
{
    @Override
    public void meth1() {
        System.out.println("Meth1 of MY");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2 of MY");
    }

    public void meth3()
    {
        System.out.println("Meth3 of MY");
    }
}

public class Interface {

    public static void main(String[] args) {

//        Test t=new Test();  this is error because similar to abstract classes, an interface also cannot have objects
        Test t = new My();
        t.meth1();
        t.meth2();
//        t.meth3();  //error as t does not know about meth3.
    }
}

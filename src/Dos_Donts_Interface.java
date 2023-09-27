
interface ITest
{
    public abstract void meth1();
    public abstract void meth2();

    public static void meth3()
    {
        System.out.println("We can declare static methods in interface");
    }

    default void meth4()
    {
        System.out.println("We can declare default methods in interface. These methods are used when we do not want to disturb other classes which are implementing interface");
        meth5();

    }

    private void meth5()
    {
        System.out.println("Private methods are only useful inside this interface and can be used by default methods");
    }
}

interface ITest2 extends ITest
{
    void meth();
}

public class Dos_Donts_Interface implements ITest2{
    @Override
    public void meth() {

    }

    @Override
    public void meth1() {

    }

    @Override
    public void meth2() {

    }

    public static void main(String[] args) {
        Dos_Donts_Interface d=new Dos_Donts_Interface();
        d.meth();
    }
}
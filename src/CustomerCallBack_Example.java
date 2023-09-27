//in this example we will implement the customer-store relation using interface.

interface Member
{
    void callBack();
}


class Store
{
    Member mem[]=new Member[100];   // This is an array of Member references.
    int count=0;

    public void registerAsMember(Member m)   //here we are passing reference to this method which is holding the object of Customer
    {
        mem[count++]=m;
    }

    public void inviteToSale()
    {
        for (int i=0;i<count;i++)
        {
            mem[i].callBack();
            // this will call the callBack method for every member of the store.
        }
    }
}

class Customer implements Member
{
    String name;
    Customer(String name)  //constructor
    {
        this.name=name;
    }

    @Override
    public void callBack() {
        System.out.println("Okay i will visit, -"+name);
    }
}

public class CustomerCallBack_Example {
    public static void main(String[] args) {

        Store s=new Store();
        Customer c1=new Customer("Milish");
        Customer c2=new Customer("Bhavya");
//        Customer c3=new Customer("dhannu");

        //now we will register both these customers as member of the store.
        s.registerAsMember(c1);  //here c1 is reference of interface Member which is holding object of Customer
        s.registerAsMember(c2);

        //Also note here that we can only pass the reference of a class that impements the Member interface.

        //now a sale is provided by the store and we need to invite the customers to the sale.
        s.inviteToSale();
        //this will give callBack to every registered customer.

        //working:-
        /*
        * first we have created a object of store i.e., s which is a store let's say xyz store is the name .
        * Now, we have created objects of Customer named Milish and Bhavya.
        * They go to the store and gets registered themselves as member. This is done via s.registerAsMember(c1)
        * the above line means :- c1 is the reference which is holding the object Milish and this reference is passed to
        * the registerAsMember method which will store the reference c1 in the array of references named as mem at location mem[0].
        * Same will happen for c2. Which holds the object Bhavya.
        *
        * Now, store has an upcoming sale and wants to invite its members for the sale.
        * so it will call the inviteToSale method.
        * this method has a for loop which will execute for total number of members times.
        * So, for every member customer, it will call the callBack method which is overriden in the Customer class.
        * */

    }
}
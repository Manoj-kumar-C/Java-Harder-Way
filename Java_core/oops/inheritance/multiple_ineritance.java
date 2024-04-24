// two parent and a one child is said to be the multiple inheritance

public class multiple_ineritance {
    public static void main(String[] args){
        child obj1 = new child();

        obj1.dad();
        obj1.mom();
    }
}


interface dady{
    abstract void dad();

}


interface mummy{
    abstract void mom();
}


class child implements dady, mummy{

    public  void dad(){
        System.out.println("Dady is a good person");
    }

    public void mom(){
        System.out.println("Moom also good person");
    }
}
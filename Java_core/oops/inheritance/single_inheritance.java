//for inheritance in java you need to use the extends keyword

public class single_inheritance {
    
    public static void main(String[] args){

        child obj1 = new child();
        obj1.earn();
        obj1.addon();
    }
}


class parent{
    void earn(){
        System.out.println("Earning amount for their children");
    }
}


class child extends parent{

    void addon(){
        System.out.println("Can Earn and use the parents properties");
    }
}
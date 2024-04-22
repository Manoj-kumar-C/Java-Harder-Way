public class inheritance {
    public static void main(String[] args) {
        

        child obj1 = new child();

        obj1.parcls();
        obj1.child();
    }


}


class parent{
    void parcls(){
        System.out.println("Parent Class");
    }
}

class child extends parent{
    void child(){
        System.out.println("Child Class");
    }
}

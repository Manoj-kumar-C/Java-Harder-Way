
public class multilvl_inheritance {
    public static void main(String[] args){
        child obj1 = new child();

        obj1.curprop();
        obj1.parentprop();
        obj1.grandprop();
    }
}


class grandparent{

    void grandprop(){
        System.out.println("Have Land");
    }

}

class parent extends grandparent{
    void parentprop(){
        System.out.println("Have House`");
    }


}

class child extends parent{

    void curprop(){
        System.out.println("Have Car");
    }

}

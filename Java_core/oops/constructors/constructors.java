public class constructors {
    public static void main(String[] args){

        mano obj1 = new mano();
        mano obj2 = new mano("para");

        obj1.display();
    }
}

class mano{
    mano(){
        System.out.println("This is a constructor");
    }

    mano(String a){
        System.out.println("Paramater constructor");
    }

    public void display(){
        System.out.println("class Display");
    }
}

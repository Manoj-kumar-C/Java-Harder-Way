
// polymorphism --- same method name with different argument count
// method overloading --- same method name with same argument count
public class polymorphism {
    
    public static void main(String[] args) {
        
        argumentCount obj1 = new argumentCount();

        obj1.countargs(0, 0);
        obj1.countargs(0, 0, 8);
        obj1.countargs(0.1f, 0.1f, 8.1f);
    }
}



class argumentCount{
    void countargs(int a, int b){
        System.out.println("Two arguments Passed are integers");
    }

    void countargs(int a, int b, int c){
        System.out.println("3 arguments Passed are integers");
    }
    void countargs(float a, float b, float c){
        System.out.println("3 arguments Passed are Float");
    }
}

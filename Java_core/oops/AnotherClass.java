// Define a class with different access modifiers
class MyClass {
    // Public variable accessible from anywhere
    public int publicVar;
    
    // Private variable accessible only within this class
    private int privateVar;
    
    // Protected variable accessible within this package and by subclasses
    protected int protectedVar;
    
    // Default (package-private) variable accessible only within this package
    int defaultVar;
    
    // Constructor
    public MyClass(int publicVar, int privateVar, int protectedVar, int defaultVar) {
        this.publicVar = publicVar;
        this.privateVar = privateVar;
        this.protectedVar = protectedVar;
        this.defaultVar = defaultVar;
    }
    
    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method");
    }
    
    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method");
    }
    
    // Protected method accessible within this package and by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
    
    // Default (package-private) method accessible only within this package
    void defaultMethod() {
        System.out.println("This is a default method");
    }
}

// Another class in the same package as MyClass
public class AnotherClass {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass(1, 2, 3, 4);
        
        // Accessing public variables and methods
        obj.publicVar = 10;
        obj.publicMethod();
        
        // Accessing protected variables and methods
        obj.protectedVar = 20;
        obj.protectedMethod();
        
        // Accessing default variables and methods
        obj.defaultVar = 30;
        obj.defaultMethod();
        
        // Private members cannot be accessed outside the class
        // obj.privateVar = 40; // This will cause a compilation error
        // obj.privateMethod(); // This will cause a compilation error
    }
}

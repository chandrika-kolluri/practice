public class Animal {

    // creating some methods
    public void breed() {
        System.out.println("I am x breed");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void dance() {
        System.out.println("I am dancing");
        work(); // calling static method to a non static method
        this.sleep(); // calling non static method to an non static method
    }

    public static void work() {
        Animal aniObj = new Animal();
        aniObj.sleep(); // calling non static method to a static method
        System.out.println("I am working");
        System.out.println("___________");
    } 

    public static void main(String[] args) {
        work();
        // to print non static method we should create an object and then print it
        Animal obj1 = new Animal();
        obj1.dance();
    }

    // creating static block
    static {
        // this prints 1st and then prints whole program irrespective of where we write static block
        System.out.println("static block");
    }
    
}

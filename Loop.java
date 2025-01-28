import java.util.Scanner;

public class Loop {

    private int age;
    private int day;
    String name;

    // creating constructor 
    public Loop(int age, int day) {
        this.age = age;
        this.day = day;
    }


    // creating method for checking age
    public void ageCheck () {
        // if else loop
        if (age < 18) {
            System.out.println("You are minor");
        } else if (age >= 18) {
            System.out.println("You are major");
        } else {
            System.out.println("Invalid age");
        }

    }

    // creating switch case to print which day
    public void switchCase() {

        // while loop to continue if the user entered beyond 7
        while (day <= 0 || day >= 8) { 
            System.out.println("Enter between 1 to 7: ");
            Scanner sc = new Scanner(System.in);
            day = sc.nextInt();
        }

        // switch case
        switch (day) {
            case 1:
                // System.out.println("Monday");
                name = "Monday";
                break;
            case 2:
                // System.out.println("Tuesday");
                name = "Tuesday";
                break;
            case 3:
                // System.out.println("Wednesday");
                name = "Wednesday";
                break;
            case 4:
                // System.out.println("Thursday");
                name = "Thursday";
                break;
            case 5:
                // System.out.println("Friday");
                name = "Friday";
                break;
            case 6:
                // System.out.println("Saturday");
                name = "Saturday";
                break;
            case 7:
                // System.out.println("Sunday");
                name = "Sunday";
                break;  
            // default:
            //     // System.out.println("Enter numbers from 1 to 7"); 
            //     name = "Input number from 1 to 7";  
            // continue
        }

        System.out.println(name);

    }

    public static void main(String[] args) {
        // creating a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age: ");
        // reading integer value from the user
        int ageIn = sc.nextInt();
        // creating object for constructor
        Loop ageInput = new Loop(ageIn, 0);
        // calling method
        ageInput.ageCheck();

        System.out.println("What day you want: ");
        int dayIn = sc.nextInt();
        Loop dayInput = new Loop(0, dayIn);
        dayInput.switchCase();

    }
    
}

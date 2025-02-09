import java.util.Scanner;

// 1. Class and Object
class Car {
    String brand = "Tesla";
    String model = "z";
    int year = 2024;

    public void carDetails() {
        System.out.println("Brand is " + brand + "\nModel is " + model + "\nRelease year is " + year);
    }
}

// 2. Constructor
class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void stuDetails() {
        System.out.println("Student name is " + name + "\nRoll number is " + rollNumber);
    }
}

// 3. Variable
class Employee {
    String name;
    int id;
    double salary;
    public void empDetails() {
        System.out.println("Employee name is " + name + "\nid is " + id + "\nSalary is " + salary);
    }
}

// 4. Methods
class Calculator {
    int num1;
    int num2;
    public void Addition() {
        int a = num1 + num2;
        System.out.println("num1 + num2 = " + a);
    }

    public void Subtraction() {
        int s = num1 - num2;
        System.out.println("num1 - num2 = " + s);
    }

    public void Multiplication() {
        int m = num1 * num2;
        System.out.println("num1 * num2 = " + m);
    }

    public void Division() {
        double d = num1 / num2;
        System.out.println("num1 / num2 = " + d);
    }
}

// 5. Loops
class NaturalNumbers {
    public void Numbers() {
        System.out.println("First 10 natural numbers are:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

// 6. If and Else Condition
class EvenOdd {
    int num1;
    public EvenOdd(int num1) {
        this.num1 = num1;
    }

    public void EveOdd() {
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is an Even Number");
        } else {
            System.out.println(num1 + " is an Odd Number");
        }
    }
}

// 7. Array
class LargeArrayNum {
    public void ArrayNum() {
        int arr1[] = {23,45,65,12,78,9,0,1,3,4,66};
        int largeNum = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > largeNum) {
                largeNum = arr1[i];
            }
        }
        System.out.println("The largest number of an array is " + largeNum);
    }
}

// 8. String
class Vowels {
    public void CountVowel() {
        String line = "I am very good girl and going to upstairs";
        int count = 0;
        for ( int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U' || line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u' ) {
                count++;
            }
        }
        System.out.println("Count of vowels in line is " + count);
    }
}

// 9. Scanner (User Input)
class Add {
    int num1;
    int num2;
    int add;
    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void Addition() {
        add = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is "  + add);
    }
}

// Main method
public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1");
        System.out.println("Car Details");
        Car carObj = new Car();
        carObj.carDetails();
        System.out.println("--------------");

        System.out.println("Question 2");
        System.out.println("Student Details");
        Student stuObj = new Student("Chandu", 1017);
        stuObj.stuDetails();
        System.out.println("--------------");

        System.out.println("Question 3");
        System.out.println("Employee Details");
        Employee empObj = new Employee();
        empObj.name = "Chandu";
        empObj.id = 1017678;
        empObj.salary = 1234567.98;
        empObj.empDetails();
        System.out.println("--------------");

        System.out.println("Question 4");
        System.out.println("Calculator");
        Calculator calObj = new Calculator();
        calObj.num1 = 10;
        calObj.num2 = 6;
        calObj.Addition();
        calObj.Subtraction();
        calObj.Multiplication();
        calObj.Division();
        System.out.println("--------------");

        System.out.println("Question 5");
        NaturalNumbers natObj = new NaturalNumbers();
        natObj.Numbers();
        System.out.println("--------------");

        System.out.println("Question 6");
        System.out.println("Even Or Odd Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is num1");
        int num1In = sc.nextInt();
        EvenOdd larObj = new EvenOdd(num1In);
        larObj.EveOdd();
        System.out.println("--------------");

        System.out.println("Question 7");
        System.out.println("Largest Number in a Given Array");
        LargeArrayNum arrObj = new LargeArrayNum();
        arrObj.ArrayNum();
        System.out.println("--------------");

        System.out.println("Question 8");
        System.out.println("Number of Vowels in a Given String");
        Vowels vowObj = new Vowels();
        vowObj.CountVowel();
        System.out.println("--------------");

        System.out.println("Question 9");
        System.out.println("Addition of two Number by Taking User input");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is the 1st number");
        int numb1In = sc1.nextInt();
        System.out.println("What is the 2nd number");
        int numb2In = sc.nextInt();
        Add addObj = new Add(numb1In, numb2In);
        addObj.Addition();
        System.out.println("--------------");

    } 

}
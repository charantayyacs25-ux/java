import java.util.*;

class WrongAge extends Exception {
    
    WrongAge() {
        super("Age Error!");
    }

    WrongAge(String message) {
        super(message);
    }
}

class Father {
    Scanner s = new Scanner(System.in);
    int fatherAge;

    Father() throws WrongAge {
        System.out.print("Enter father's age: ");
        fatherAge = s.nextInt();

        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    void display() {
        System.out.println("Father's Age: " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    Son() throws WrongAge {
        super();

        System.out.print("Enter son's age: ");
        sonAge = s.nextInt();

        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative");
        } else if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        }
    }

    void display() {
        System.out.println("Son's Age: " + sonAge);
    }
}

public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
        try {
            Son obj = new Son();
            obj.display();                // Son's age
            ((Father)obj).display();      // Father's age
        }
        catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

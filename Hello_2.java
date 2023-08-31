import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name; 
        int age;    
        System.out.print("Enter the name: ");
        name = sc.nextLine(); 

        System.out.print("Enter the number age: ");
        age = sc.nextInt(); 

        System.out.println("Hello " + name + ", your age is " + age);
    }
}

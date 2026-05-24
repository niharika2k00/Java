import java.util.Scanner;

public class ScannerClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine(); // string line input

    System.out.println("Enter your gender (M/F): ");
    char gender = sc.next().charAt(0); // character input

    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    System.out.println("Enter your cgpa: ");
    double cgpa = sc.nextDouble();

    System.out.println("Enter 4 space-separated marks: ");
    int[] nums = new int[4];
    for (int i = 0; i < 4; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.println("\nName: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Age: " + age);
    System.out.println("CGPA: " + cgpa);
    System.out.print("Marks: ");
    for (int n : nums)
      System.out.print(n + " ");
    System.out.println();
  }
}

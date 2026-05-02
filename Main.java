import java.util.*;

public class Main {

    // ===== USERS =====
    static Map<String, String> students = new HashMap<>();
    static Map<String, String> admins = new HashMap<>();


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ===== DEFAULT USERS =====
        admins.put("admin", "1234");

        students.put("101", "111");
        students.put("102", "222");

        while (true) {

            System.out.println("\n=== CAMPUS SYSTEM ===");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                adminLogin();
            } else if (choice == 2) {
                studentLogin();
            } else {
                break;
            }
        }
    }

    // ================= ADMIN =================
    static void adminLogin() {

        System.out.print("Admin ID: ");
        String id = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (admins.containsKey(id) && admins.get(id).equals(pass)) {
            // adminDashboard();
        } else {
            System.out.println("Invalid Admin!");
        }
    }


    // ================= STUDENT =================
    static void studentLogin() {

        System.out.print("Student ID: ");
        String id = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (students.containsKey(id) && students.get(id).equals(pass)) {
            // studentDashboard(id);
        } else {
            System.out.println("Invalid Student!");
        }
    }


}
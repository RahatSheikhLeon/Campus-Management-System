import java.util.*;

public class Main {

    // ===== USERS =====
    static Map<String, String> students = new HashMap<>();
    static Map<String, String> admins = new HashMap<>();
    
    static Map<String, List<String>> studentCourses = new HashMap<>();
    static Map<String, Double> results = new HashMap<>();
    static Map<String, Integer> attendance = new HashMap<>();
    static Map<String, Double> fees = new HashMap<>();
    static List<String> notices = new ArrayList<>();



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
            adminDashboard();
        } else {
            System.out.println("Invalid Admin!");
        }
    }

     static void adminDashboard() {

        while (true) {

           System.out.println("\n=== ADMIN DASHBOARD ===");
            System.out.println("1. View Student Courses");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Add/Update Result");
            System.out.println("4. Add Notice");
            System.out.println("5. Check Fee");
            System.out.println("6. Logout");

            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

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
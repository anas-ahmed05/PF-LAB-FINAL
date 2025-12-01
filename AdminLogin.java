import java.util.Scanner;
public class AdminLogin 
{
    public static void main(String[] args) 
    {
 
        Scanner sc = new Scanner(System.in);

        String adminUser = "admin";
        String adminPass = "1234";

        while(true) {
        System.out.println("\n--- ADMIN LOGIN ---");

        System.out.print("Enter Username: ");
        String admUser = sc.nextLine();

        System.out.print("Enter Password: ");
        String admPass = sc.nextLine();

        if (admUser.equals(adminUser) && admPass.equals(adminPass)) 
            {
                System.out.println("\nCorrect Password. Admin Access Granted.");
                adminMenu(sc);
            }
        else 
            {
            System.out.println("\nIncorrect Username or Password. Login Failed.");
            }
        }

    }

    public static void adminMenu(Scanner sc) 
    {

        int choice;

        while(true)
        {
            System.out.println("\nADMIN MENU");
            System.out.println("1. Employee Manipulation");
            System.out.println("2. Attendance Menu");
            System.out.println("3. Salary Management");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    employeeManipulation();
                    break;

                case 2:
                    attendanceMenu();
                    break;

                case 3:
                    salaryManagement();
                    break;

                case 4:
                    System.out.println("\nLogged Out Successfully.");
                    return;

                default:
                    System.out.println("\nInvalid Choice. Try again.");
            }
        }
    }

    public static void employeeManipulation() {
    }

    public static void attendanceMenu() {
    }

    public static void salaryManagement() {
    }
}

    


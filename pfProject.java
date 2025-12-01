import java.util.Scanner;

public class pfProject 
{

    public static void main(String[] args) 
    {

        Scanner pf = new Scanner(System.in);

        String adminUser = "admin";
        String adminPass = "1234";

        String empUser = "employee";
        String empPass = "1234";

        int choice;

        while (true) 
        {

            System.out.println("\nLOGIN MENU\n");
            System.out.println("1. Admin Login\n");
            System.out.println("2. Employee Login\n");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");
            choice = pf.nextInt();
            pf.nextLine();

            switch (choice) 
            {

                case 1:
                    System.out.println("\nADMIN LOGIN");

                    System.out.println("Enter Username: ");
                    String admUser = pf.nextLine();

                    System.out.println("Enter Password: ");
                    String admPass = pf.nextLine();

                    if (admUser.equals(adminUser) && admPass.equals(adminPass)) 
                        {
                        System.out.println("\nCorrect Password");
                        adminMenu(pf);
                        } 
                    else 
                        {
                        System.out.println("\nIncorrect Username or Password");
                        }
                    break;

                case 2:
                    System.out.println("\nEMPLOYEE LOGIN");

                    System.out.println("Enter Username: ");
                    String eUser = pf.nextLine();

                    System.out.println("Enter Password: ");
                    String ePass = pf.nextLine();

                    if (eUser.equals(empUser) && ePass.equals(empPass)) 
                        {
                        System.out.println("\nCorrect Password");
                        employeeMenu(pf);
                        } 
                    else 
                        {
                        System.out.println("\nIncorrect Username or Password");
                        }
                    break;

                case 3:
                    System.out.println("\nExiting Program...");
                    return;

                default:
                    System.out.println("\nInvalid Choice. Try again.");
            }
        }
    }

    public static void employeeMenu(Scanner pf) 
    {

        int choice;

        while (true) {
            System.out.println("\nEMPLOYEE MENU");
            System.out.println("1. View Profile");
            System.out.println("2. View Attendance");
            System.out.println("3. Salary Details");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");

            choice = pf.nextInt();

            switch (choice) 
            {

                case 1:viewProfile();
                    break;

                case 2:viewAttendance();
                    break;

                case 3:viewSalary();
                    break;

                case 4:System.out.println("\nLogged Out Successfully.");
                    return;

                default:System.out.println("\nInvalid Choice. Try again.");
            }
        }
    }

    public static void adminMenu(Scanner pf) 
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

            choice = pf.nextInt();

            switch (choice) 
            {

                case 1:employeeManipulation();
                    break;

                case 2:attendanceMenu();
                    break;

                case 3:salaryManagement();
                    break;

                case 4:System.out.println("\nLogged Out Successfully.");
                    return;

                default:System.out.println("\nInvalid Choice. Try again.");
            }
        }
    }

    public static void viewProfile() {
    }

    public static void viewAttendance() {
    }

    public static void viewSalary() {
    }

    public static void employeeManipulation() {
    }

    public static void attendanceMenu() {
    }

    public static void salaryManagement() {
    }
}

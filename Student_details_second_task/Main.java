import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. View All Students");
            System.out.println("4. serach for a student");
            System.out.println("5. Edit student details");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                seraching();
                    break;
                case 5:
                 editing();
                 break;
                case 6:
                System.exit(0);
                       break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void addStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        Student student = new Student(id, name, age);
        int k=studentManager.addStudent(student);
        if(k!=-1){
        System.out.println("Student added successfully.");}
    }
    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        int x=studentManager.deleteStudent(id);
        if(x!=0){
        System.out.println("Student deleted successfully.");}
    }

    private static void viewAllStudents() {
        System.out.println("List of students:");
        for (Student student : studentManager.getAllStudents()) {
            System.out.println(student);
        }
    }
    private static int seraching(){
        System.out.println("enter the id of the student: ");
        String idd=scanner.nextLine();
        int y=StudentManager.searchStudent(idd);
        return y;
    }
    private static void editing(){
        int u=Main.seraching();
        
        if(u!=-1){

            System.out.println("Now enter the new details...");
            StudentManager.editStudent(u);

        }
    }
}



import java.util.Scanner;

class Student {
    private String name;
    private int regNo;
    private String course;

    public Student(String name, int regNo, String course) {
        this.name = name;
        this.regNo = regNo;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getCourse() {
        return course;
    }
}

class Attendance extends Student {
    private int presentCount;
    private int totalClasses;

    public Attendance(String name, int regNo, String course) {
        super(name, regNo, course);
    }

    public void setAttendanceData(int presentCount, int totalClasses) {
        this.presentCount = presentCount;
        this.totalClasses = totalClasses;
    }

    public double calculateAttendancePercentage() {
        return (double) presentCount / totalClasses * 100;
    }

    public void printStudentDetails() {
        System.out.println("\n		---Student Details:---");
        System.out.println("\n Name: " + getName());
        System.out.println("\n Register Number: " + getRegNo());
        System.out.println("\n Course name: " + getCourse());
        System.out.println("\n Attendance Percentage: " + calculateAttendancePercentage() + "%");
		System.out.println("\n..................................................................");
    }
}

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("\n..................................................................");
		
		System.out.println("\n		**ATTENDANCE MANAGEMENT SYSTEM**\n");

        System.out.print("\n Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("\n Enter register number: ");
        int regNo = input.nextInt();

        System.out.print("\n Enter course name: ");
        input.nextLine();
        String courseName = input.nextLine();

        System.out.print("\n Enter present count: ");
        int presentCount = input.nextInt();

        System.out.print("\n Enter total classes: ");
        int totalClasses = input.nextInt();

        Attendance attendance = new Attendance(studentName, regNo, courseName);
        attendance.setAttendanceData(presentCount, totalClasses);
        attendance.printStudentDetails();
    }
}
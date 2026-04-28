import java.util.Scanner;

interface Department {
    void getDeptData();
    void printDeptData();
}

class Hostel {
    String hostelName, hostelLocation;
    int rooms;

    void getHostelData(Scanner sc) {
        System.out.print("Hostel Name: ");
        hostelName = sc.next();
        System.out.print("Location: ");
        hostelLocation = sc.next();
        System.out.print("Rooms: ");
        rooms = sc.nextInt();
    }

    void printHostelData() {
        System.out.println(hostelName + " " + hostelLocation + " " + rooms);
    }
}

class Student extends Hostel implements Department {
    String name, subject;
    int regdNo;
    double avgMarks;
    String deptName, deptHead;

    public void getDeptData() {
        deptName = "CSE";
        deptHead = "ABC";
    }

    public void printDeptData() {
        System.out.println(deptName + " " + deptHead);
    }

    void getStudentData(Scanner sc) {
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Reg No: ");
        regdNo = sc.nextInt();
        System.out.print("Subject: ");
        subject = sc.next();
        System.out.print("Avg Marks: ");
        avgMarks = sc.nextDouble();
    }

    void printStudentData() {
        System.out.println(name + " " + regdNo + " " + subject + " " + avgMarks);
    }
}

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        s.getHostelData(sc);
        s.getStudentData(sc);
        s.getDeptData();

        s.printHostelData();
        s.printStudentData();
        s.printDeptData();
    }
}
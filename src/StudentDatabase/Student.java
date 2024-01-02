package StudentDatabase;
import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private int gradeyear;
    private static int id=1000;
    private String StudentId;
    private String courses = "";
    private int tuitionCost= 0;
    private static int  courseFees=600;

    Student(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your FirstName : ");
        firstName = scn.nextLine();

        System.out.print("Enter your LastName : ");
        lastName = scn.nextLine();

        System.out.println("GRADE YEARS ---->");
        System.out.println("1 - Freshman");
        System.out.println("2 - Junior");
        System.out.println("3 - Senior");
        gradeyear = scn.nextInt();
        setStudentId();
       //System.out.println(firstName+" "+lastName+" "+gradeyear+" "+StudentId);
    }

    private void setStudentId(){
        id++;
        this.StudentId=gradeyear+""+id;
    }

    public void enroll(){
        do{
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter your course to enroll (q to quit) : ");
            String course = scn.nextLine();
            if(!course.equals("q")){
                courses= courses+"\n  "+course;
                tuitionCost = tuitionCost+courseFees;
            }
            else {
                break;
            }

        } while (true);
       // System.out.println("Enrolled In : "+courses);
       System.out.println("Tuition Fees : "+tuitionCost);

    }

    public void viewBalance(){
       // System.out.println("Your Balance is $"+tuitionCost);
    }

    public void payment(int pay){
        System.out.print("Enter your Ammount to pay $: ");
        Scanner scn =new Scanner(System.in);
        pay = scn.nextInt();
        tuitionCost = tuitionCost-pay;
        System.out.println("Thank you for the payment of $"+pay);
        viewBalance();

    }

    public String toString(){
        return "Name : "+firstName+" "+lastName+"\n"+
                "Grade Year : "+gradeyear+"\n"+
                "Student Id : "+StudentId+"\n"+
                "Enrolled In : "+courses+"\n"+
                "Balance : "+tuitionCost+"\n"
                ;
    }
}

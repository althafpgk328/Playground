import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Name");
    String name=s.next();
    System.out.println("Age");
    int a=s.nextInt();
    System.out.println("Gender"); 
    char gender=s.next().charAt(0);
    System.out.println("ID Number");
    long idNum=s.nextInt();
    System.out.println("Major");
    String major=s.next();
  
    System.out.println("CGPA");
    Double cgpa=s.nextDouble();
      System.out.println("Year");
    int year=s.nextInt();
    CollegeStudent st=new CollegeStudent();
    st.student(name,a,gender,idNum);
    st.display(major,year,cgpa);
  }
}
class Student
{
  String name;
  int age;
  char gender;
  Long idNum;
  public void student (String name,int a,char gender,Long idNum)
  {
     System.out.println("The Student details is");
     System.out.println("ID : "+idNum);
     System.out.println("Name : "+name);
     System.out.println("Age : "+a);
     System.out.println("Gender : "+gender);
    
  }
  }
  class CollegeStudent extends Student{
    String major;
    int year;
    Double cgpa;
    public void display(String major,int year, Double cgpa)
    {
     System.out.println("Major : "+major);
      System.out.println("CGPA : "+cgpa);
     System.out.println("Year : "+year);
         }  
}
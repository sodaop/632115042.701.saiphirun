package Week11;

public class Student {

    
    public static void main(String[] args) {
        StudentData std01 = new StudentData("Mark", 18, 4.00);
        StudentData std02 = new StudentData("jane", 18, 2.20);
        StudentData std03 = new StudentData("Peter", 19, 4.00);
        StudentData std04 = new StudentData("Mark", 18, 1.75);

        System.out.println(std01.equals(std02));
        System.out.println(std01.equals(std03));
        System.out.println(std02.equals(std04));
        System.out.println(std01.equals(std04));

        System.out.println(std01.age.equals(std02.age));
        System.out.println(std03.age.equals(std04.age));
        System.out.println(std01.age.equals(std03.age));

        System.out.println(std01.GPA.equals(std03.GPA));
        System.out.println(std02.GPA.equals(std04.GPA));
        System.out.println(std02.GPA.equals(std03.GPA));
        

      
      
 

    }
    
}

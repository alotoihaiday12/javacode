import java.util.Scanner;

public class StudentManagement {
    private Student[] students;
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup()==s2.getGroup()){
            System.out.print("Cung Lop");
            return true;
        }
        return false;
    }
    int n;
    public void addStudent(Student newStudent){
        int i;
        System.out.print("Nhap so sinh vien can them ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        for (i=0; i<n; i++){
            System.out.println("Nhap ten: ");
            String NAME = sc.nextLine();
            System.out.println("Nhap email: ");
            String EMAIL=sc.nextLine();
            System.out.println("Nhap group: ");
            String GROUP=sc.nextLine();
            System.out.println("Nhap id: ");
            String ID=sc.nextLine();
            newStudent =new Student(NAME,ID,GROUP,EMAIL);
            students= new Student[n];
            students[i]=newStudent;
        }
    }



    public String studentsByGroup(){
        for(int i=0; i<n; i++){
           System.out.print(students[i].getGroup());
           System.out.println(students[i].getName());
           for(int j=i+1; j<n-1; j++){
                if(sameGroup(students[j], students[i])==true) {
                    System.out.println(students[j].getName()+"---");
                }
                else ;
           }
        }
        return null;
   }

}
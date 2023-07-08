package lex;

public class studentTester {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setstudentId(1001);
        s1.setName("jacoob");
        s1.setresidentalStatus('H');
        s1.setQualifyingExamMarks(80); 
        s1.setYearOfEngg(3);
        System.out.println("student Id : " + s1.getStudentId());
        System.out.println("Student Name : "+ s1.getName());
        System.out.println("Residental status : "+ s1.getresidentalStatus());
        System.out.println("Qualifying Marks : "+ s1.getQualifyingExamMarks());
        System.out.println("Year of Engg : "+ s1.getYearOfEngg());

    }
}

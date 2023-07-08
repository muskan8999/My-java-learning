package lex;

public class student {
    private int studentId;
    private String Name;
    private float qualifyingExamMarks;
    private char residentalStatus;
    private int yearOfEngg;
    public int getStudentId(){
        return studentId;
    }
     public void setstudentId(int studentId){
        this.studentId = studentId;
     }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public float getQualifyingExamMarks(){
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks){
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public String getresidentalStatus() {
        if (residentalStatus=='H'){
            return "Hosteler";
        }
        else
            return "Day scholar";


    }

    public void setresidentalStatus(char residentalStatus){
        this.residentalStatus = residentalStatus;
    }

    public int getYearOfEngg() {
        return yearOfEngg;
    }

    public void setYearOfEngg(int yearOfEngg){
        this.yearOfEngg = yearOfEngg;
    }
}


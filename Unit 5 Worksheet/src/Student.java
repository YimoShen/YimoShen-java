import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName;
    private String studentGrade;
    private ArrayList<Double> grades;

    public Student (String name, String grade) {
        studentName = name;
        studentGrade = grade;
    }

    public boolean passingOrFailing (){
        int total = 0;
        for (int i = 0; i < grades.size()-1; i++){
            total += grades.indexOf(i);
        }
        return (total/grades.size()>=65);
    }

    public int numberOfClasses (){
        int classes = 0;
        for (int j = 0; j < grades.size(); j++){
            classes++;
        }
        return classes;
    }

    public String returnName(String studentName){
        return studentName;

    }
    public int returnGrade (){
        int total = 0;
        for (int i = 0; i < grades.size()-1; i++){
            total += grades.indexOf(i);
        }
        int average = total/grades.size();
        return average;
    }

    public void addToGrades (ArrayList grades, int newGrade) {
        grades.add(1, newGrade);
    }

}

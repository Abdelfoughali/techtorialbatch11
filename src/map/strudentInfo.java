package map;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class strudentInfo {

//    FirstName: David
//    LastName: Pena
//    Age: 25
//    Gender: M
//    City: Chicago

//    FirstName: Jeremiah
//    LastName: Michaelson
//    Age: 15
//    Gender: M
//    City: HighPark

//    FirstName: Michael
//    LastName: White
//    Age: 35
//    Gender: M
//    City: Winnetka

    //    FirstName: Sarah
//    LastName: Star
//    Age: 29
//    Gender: F
//    City: Chicago;
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastNmae", "Pena");
        student1.put("age", "25");
        student1.put("Gender", "M");
        student1.put("city", "chicago");
        HashMap<String, String> student2 = new HashMap<>();
        student2.put("FirstName", "Michealson");
        student2.put("LastNmae", "jeramiah");
        student2.put("age", "15");
        student2.put("Gender", "M");
        student2.put("city", "niles");
        HashMap<String, String> student3 = new HashMap<>();
        student3.put("FirstName", "boujea");
        student3.put("LastNmae", "fatiam");
        student3.put("age", "23");
        student3.put("Gender", "f");
        student3.put("city", "rever grove");
        HashMap<String, String> student4 = new HashMap<>();
        student4.put("FirstName", "foughali");
        student4.put("LastNmae", "abdennour");
        student4.put("age", "31");
        student4.put("Gender", "m");
        student4.put("city", "chicago");

        List<HashMap<String, String>> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println(studentList);
// the question is find out the student living in chicago and tell who they are
        for (HashMap<String, String> studentinfoMap : studentList) {
            if (studentinfoMap.get("city").equals("chicago")) {
                System.out.println(studentinfoMap.get("FirstName") + " is living in chicago");
            }
        }
        printStudentInfo(studentList);
    }

    //if you want a use the method you should go these steps
    public static void printStudentInfo(List<HashMap<String, String>> list) {
        for (HashMap<String, String> studentInfoMap : list) {
            if (studentInfoMap.get("city").equals("chicago")) {
                System.out.println(studentInfoMap.get("FirstName") + " is living in Chicago");
            }
        }
    }
}

package map;

import java.util.HashMap;

public class EmployeTest {
    public static void main(String[] args) {
        HashMap <Integer,Employe> mapOfEmployee =new HashMap();
        Employe e1=new Employe("max","new york ",21,1);
        Employe e2=new Employe("tim","st loius ",26,3);
        Employe e3=new Employe("david","denver ",25,5);
        Employe e4=new Employe("john","new mexico",24,56);

        mapOfEmployee.put(e1.id,e1);
        mapOfEmployee.put(e2.id,e2);
        mapOfEmployee.put(e3.id,e3);
        mapOfEmployee.put(e3.id,e4);
        System.out.println(mapOfEmployee);

       for (Employe em:mapOfEmployee.values()){
           System.out.println(em.name);
          System.out.println(em.city);
      }
    }
}

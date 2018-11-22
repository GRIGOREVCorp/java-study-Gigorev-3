package neoflexprojecttask3;

import java.util.*;

public class NeoflexProjectTask3 {
    static HashMap<String, Student> hashMap;
    static LinkedHashMap<String, Student> linkedHashMap;
    static LinkedList<Student> linkedList;
    static ArrayList<Student> arrayList;
    static Student student;

    public static void main(String[] args) {
        hashMap = new HashMap<String, Student>();
        linkedHashMap = new LinkedHashMap<String, Student>();
        linkedList = new LinkedList<Student>();
        arrayList = new ArrayList<Student>();
        int i=0;
        while (i<1000) { 
            student = new Student();
            hashMap.put(student.getName(), student);
            linkedHashMap.put(student.getName(), student);
            linkedList.add(student);
            arrayList.add(student);
            i++;
        }
        for (Student name : arrayList) System.out.println(name.getName());
    }
    
}

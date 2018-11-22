package neoflexprojecttask3;

import java.util.*;

public class NeoflexProjectTask3 {
    static HashMap<String, Student> hashMap;
    static LinkedHashMap<String, Student> linkedHashMap;
    static LinkedList<String> linkedList;
    static ArrayList<String> arrayList;
    static Student student;

    public static void main(String[] args) {
             generateStudent();
             System.out.println("Время сортировки HashMap = " + timeSortHashMap(hashMap));
             System.out.println("Время сортировки LinkedHashMap = " + timeSortLinkedHashMap(linkedHashMap));
             System.out.println("Время сортировки LinkedList = " + timeSortLinkedList(linkedList));
             System.out.println("Время сортировки ArrayList = " + timeSortArrayList(arrayList));
    }
    
    public static void generateStudent() {
        hashMap = new HashMap<String, Student>();
        linkedHashMap = new LinkedHashMap<String, Student>();
        linkedList = new LinkedList<String>();
        arrayList = new ArrayList<String>();
        int i=0;
        while (i<1000) { 
            student = new Student();
            hashMap.put(student.getName(), student);
            linkedHashMap.put(student.getName(), student);
            linkedList.add(student.getName());
            arrayList.add(student.getName());
            i++;
        }
    }
    
    public static long timeSortHashMap(HashMap<String, Student> hashMap) {
        long start = System.currentTimeMillis();
        hashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Student>comparingByKey());
        return System.currentTimeMillis() - start;
    }
    
    public static long timeSortLinkedHashMap(LinkedHashMap<String, Student> linkedHashMap) {
        long start = System.currentTimeMillis();
        linkedHashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Student>comparingByKey());
        return System.currentTimeMillis() - start;
    }
    
    public static long timeSortLinkedList(LinkedList<String> linkedList) {
        long start = System.currentTimeMillis();
        Collections.sort(linkedList);       
        return System.currentTimeMillis() - start;
    }
    
    public static long timeSortArrayList(ArrayList<String> arrayList) {
        long start = System.currentTimeMillis();
        Collections.sort(arrayList);
        return System.currentTimeMillis() - start;
    }
}

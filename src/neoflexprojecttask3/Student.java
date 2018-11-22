package neoflexprojecttask3;

import java.nio.charset.Charset;
import java.util.Random;

public class Student {
    private int age;
    private String name;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Student() {
        setAge(new Random().nextInt(82)+18);
        setName(new Random().nextInt(17)+4);
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(int length) {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < length; i++) {
            name.append(ALPHABET.charAt(new Random().nextInt(ALPHABET.length())));
        }        
        this.name = name.toString();
    }    
    
}

package demo6;

import java.io.Serializable;

public class Person implements Serializable {
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public Person(String name, int age){
         this.name = name;
         this.age = age;
    }

}

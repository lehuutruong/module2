package ss9_dsa_list.exercise.arraylist.controller;

import ss9_dsa_list.exercise.arraylist.model.MyArrayList;

public class MainController {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Truong");
        Student b = new Student(1, "Truong");
        Student c = new Student(1, "Truong");
        Student d = new Student(1, "Truong");
        Student e = new Student(1, "Truong");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        for (int i = 0; i <studentMyArrayList.size() ; i++) {
            Student student= (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}

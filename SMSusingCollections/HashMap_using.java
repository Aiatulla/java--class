package SMSusingCollections;

import java.util.*;

class Student{
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Student(int id, String name, int age, Set<String> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = courses;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }
}

public class HashMap_using {
    public HashMap<Integer, Student> map;
    public TreeSet<String> students;

    public HashMap_using() {
        this.map = new HashMap<>();
        this.students = new TreeSet<>();
    }

    public void addNewStudent(int id, String name, int age, Set<String> courses){
        Student s = new Student(id, name, age, courses);
        map.put(id,s);
        students.add(name);

    }

    public void sortedByName(){
        System.out.println(students);
    }

    public void removeStudent(int id){
        map.remove(id);
    }

    public void updateStudentDetails(int id, String name, int age, Set<String> courses){
        map.get(id).setAge(age);
        map.get(id).setCourses(courses);
        map.get(id).setName(name);
        map.get(id).setId(id);
    }

    public void displayStudents(){
        Iterator<Map.Entry<Integer,Student>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,Student> student = iter.next();
            Student s = student.getValue();
            System.out.println("Id:" + s.getId() + " Name:" + s.getName());
        }
    }

    public void search(int id){
        Student s = map.get(id);
        System.out.println("Name:" + s.getName() + " Id:" + s.getId() + " Age:" + s.getAge() + " Courses: " + s.getCourses());
    }

    public void sameCourseStudents(String course){
        Iterator<Map.Entry<Integer,Student>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,Student> student = iter.next();
            Student s = student.getValue();
//            System.out.println("All students in " + course);
            if (s.getCourses().contains(course)){
                System.out.println(s.getName());
            }
        }
    }

}

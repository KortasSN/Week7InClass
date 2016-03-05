package com.josh;
import java.util.*;

/**
 * Created by ec0662sr on 3/3/2016.
 */
public class ITECCourse {
    //Data for an ITECCourse object to store
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;
    private int roomLeft;







    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getCourseName() {
        return this.name;
    }

    public void setCourseName(String newName) {
        this.name = newName;
    }

    public String getRoomName() {
        return this.room;
    }

    public void setRoomName(String newRoom) {
        this.room = newRoom;
    }

    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseRoom) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.room = courseRoom;
    }

    public int getRoomLeft() {
        this.roomLeft = this.maxStudents - this.students.size();
        return roomLeft;
    }

    public void setRoomLeft(int roomLeft) {
        this.roomLeft = roomLeft;
    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course Room: " + this.room);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
        System.out.println("There are " + this.roomLeft + " in " + this.name + ".");
    }

    int getNumberOfStudents() {
        return this.students.size();
    }


    public void addStudent(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
        } else{
            students.add(studentName);

        }
        //don't need to check if students ArrayList is null –
        //we know that the constructor set it up
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);

        }
    }


}

//Other methods follow...

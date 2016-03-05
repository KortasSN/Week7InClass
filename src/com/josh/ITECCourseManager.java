package com.josh;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ITECCourseManager {
    public static void main(String args[]) {

        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "T123");

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.getRoomLeft();
        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30, "T456");

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.getRoomLeft();
        datacomCourse.writeCourseInfo();

        ITECCourse javaProgramming =
                new ITECCourse("Java Programming", 2545, 24, "T789");

        //Add some students
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Izzy");
        javaProgramming.addStudent("Josh");
        javaProgramming.addStudent("Happy");

        javaProgramming.removeStudent("Izzy");
        javaProgramming.removeStudent("Bob");
        javaProgramming.getRoomLeft();
        javaProgramming.writeCourseInfo();


        ITECCourse smallCourse =
                new ITECCourse("Small Course", 1111, 3, "T321");
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        //smallCourse.addStudent("Liam");
        //smallCourse.addStudent("Marigold");

        smallCourse.getRoomLeft();
        smallCourse.writeCourseInfo();

        ITECCourse infoTechConcepts =
                new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        infoTechConcepts.addStudent("Max");
        infoTechConcepts.addStudent("Nancy");
        infoTechConcepts.addStudent("Orson");
        infoTechConcepts.getRoomLeft();
        infoTechConcepts.writeCourseInfo();
    // Problem 3

        ArrayList<ITECCourse> allCourses = new ArrayList<>();
        allCourses.add(infoTechConcepts);
        allCourses.add(smallCourse);
        allCourses.add(javaProgramming);
        allCourses.add(datacomCourse);
        allCourses.add(maintenanceCourse);

            }




}




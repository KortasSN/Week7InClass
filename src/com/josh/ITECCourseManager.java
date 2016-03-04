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

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30, "T456");

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

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

        javaProgramming.writeCourseInfo();

        ITECCourse smallCourse =
                new ITECCourse("Small Course", 1111, 3, "T321");
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Marigold");



        ITECCourse infoTechConcepts =
                new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        infoTechConcepts.addStudent("Max");
        infoTechConcepts.addStudent("Nancy");
        infoTechConcepts.addStudent("Orson");


    // Problem 3

        /*ArrayList<ITECCourse> allCourses = new ArrayList<>();
        for (int x = 0; x < ITECCourse.)
        allCourses.add
*/
    }




}




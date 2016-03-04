package com.josh;

public class ITECCourseManager {
    public static void main(String args[]) {

        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse javaProgramming =
                new ITECCourse("Java Programming", 2545, 24);

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
                new ITECCourse("Small Course", 1111, 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Marigold");

    }

}




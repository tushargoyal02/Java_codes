class StudentTest_11_access_modifier{

    public static void main(String[] args){

        // student id creations
        int[] studnetIds = new int[] {1001, 1002, 1003};

        // creating object of student_6 class from another program
        student_11_access_modifier student1 = new student_11_access_modifier(studnetIds[0], "joan", "male");
        


        student_11_access_modifier student2 = new student_11_access_modifier(studnetIds[1], "raj", "male");

        student_11_access_modifier student3 = new student_11_access_modifier(studnetIds[2], "anita", "female ");

        System.out.println("Student1 name : " + student1.getName() );

        // using setter to put orignal name
        student1.setName("john");
        System.out.println("Student1 updated name : " + student1.getName());

        System.out.println("total number of students : " + student_11_access_modifier.getStudentCount());

/*
        // new student 4
        student_6 student4 = student1;
        System.out.println("Student 4 name : " + student4.name);

        // update method with Student4 object
        student4.updateProfile("newJohn");
        System.out.println("Student 4 name : " + student4.name);
        System.out.println("Student 4 name : " + student1.name); // checking name with student1 with object creations

        // try this
        student4=student2;  // assigning memory address of student 2 to student 4
        System.out.println("Student 4 name : " + student4.name);


        // assigning student 1 address ti student 2
        student2=student1;
            // student 4 have same memory address as earlier assigned by student 2
        System.out.println("Student 4 name effect after student 2 is assigned : " + student4.name);    // no changes noticed here


        System.out.println("Student 2 name effect after student 1 is assigned: " + student2.name);      // changes done

        // ------------------------------------------------------------
        // seprate code is there down below

        // DEMO OF COMPARISION OPERATOR
        if (student1==student2){
            System.out.println("Same object  are reference  :");
        }

        if (student1!=student2){
            System.out.println("Same object reference are not there:  :");
        }

        // creating NULL POINTER Exception
        student_6 std6=null;
        System.out.println("Student name : "+ std6.name);

        // removing null pointer exception
      
        if (std6 != null){    // comment above one line
        System.out.println("Removed NULL Pointer exception with Student name : "+ std6.name);
        }

        */
    }
}
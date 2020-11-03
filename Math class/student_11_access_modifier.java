class student_11_access_modifier{

    // making variables private
    private static int studentCount;
    private int id;
    private String name;                // instance variable name
    private String gender="male";
    
    //getter method
    public String getName(){
        return name;
    }

    // getter method for a student count
    public static int getStudentCount(){

        return studentCount;
    }

    // setter method -> use to initilize instance variable
    public void setName(String name){
        this.name = name;  // instance variable initialize
    }

    // constructor
    student_11_access_modifier(int id, String name, String gender){
    
        this.id = id;      //initializing instance variable
        this.name= name;
        this.gender= gender;

        // increse number of student count everytime
        studentCount++;
    }



    boolean updateProfile(String name){
        this.name=name;     // instance variable access
        return true;
    }
}
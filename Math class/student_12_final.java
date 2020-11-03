class student_12_final{

    // making variables private
    private static int studentCount;
    private int id;
    private String name;                // instance variable name
    private String gender="male";
    
    private int idIntializer=1000;        // intializer id
    private final int id1;
   
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
    student_12_final(String name, String gender){
    
        this.name= name;
        this.gender= gender;

        id1 =  ++ idIntializer; // increasing the value of id automatic

        // increse number of student count everytime
        studentCount++;

        System.out.println("Name : " + name + " id :" + id1 );
    }



    boolean updateProfile(String name){
        this.name=name;     // instance variable access
        return true;
    }
}
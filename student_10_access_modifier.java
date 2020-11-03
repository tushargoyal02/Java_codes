class student_10_access_modifier{

    // making variables private
    private int id;
    private String name;                // instance variable name
    private String gender="male";

    //getter method
    public String getName(){
        return name;
    }

    // setter method -> use to initilize instance variable
    public void setName(String name){
        this.name = name;  // instance variable initialize
    }

    // constructor
    student_10_access_modifier(int id, String name, String gender){
    
        this.id = id;      //initializing instance variable

        this.name= name;
        this.gender= gender;
     }



    boolean updateProfile(String name){
        this.name=name;     // instance variable access
        return true;
    }
}
class student_6{
    int id;
    String name;                // instance variable name
    String gender="male";


    // constructor
     student_6(int id, String name){
     
        // intiliase [NAME] variable from overload constructor belo
        this(name);
        this.id = id;      //initializing instance variable

     }


     // new constructor
     student_6(String name){

         // instance variable name access
         this.name = name;

     }

    boolean updateProfile(String name){
        this.name=name;     // instance variable access
        return true;
    }
}
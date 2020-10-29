class constructor_overloading_5{
    
    int id;
    String name;
    int salary;

    // constructor with same class name initiliasing id & name
    constructor_overloading_5(int userId, String Username){
        id = userId;
        name= Username;
    }

    // Initliasing all the 3 fields
    constructor_overloading_5(int userId, String Username, int userSalary){
        this(userId, Username);
        salary = userSalary;
    }

    public static void main(String[] args){
        // creating an object of Constructor [constructor_overloading_5]
        constructor_overloading_5  Instructor  = new constructor_overloading_5(12, "tushar", 1234);
        
        // calling name with [Instructor object]
        System.out.println("Name :"+ Instructor.name);
        // salary of the user
        System.out.println("Name :"+ Instructor.salary);

    }
}

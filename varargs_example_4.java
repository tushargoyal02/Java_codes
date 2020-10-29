class varargs_example_4{

    // var-args example
    static void varargOVerload(boolean b, int i, int j, int k){
        System.out.println("No VarArgs argument");
    }

    // overloading the above function [varargOverload function]
    static void varargOVerload(boolean b, int... list){
        System.out.println("VarArgs argument -> Method Overloaded");
        System.out.println("List length of Overload [varArgs method] : " + list.length);
    }


    public static void main(String[] args){
        varargOVerload(true, 1,2,3);  // call first args method
 
        varargOVerload(true, 1,2,3,4,5,2,123);   // calls overloaded varargs method

        varargOVerload(true);     // call overloaded varargs method
    }
}
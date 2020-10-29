class BasicsDemo{

    public static void values(){
        System.out.println("Pring all type of values");

        int intHex = 0x0041;
        System.out.println(intHex);

        //binary
        int intbinary = 0b01000001;
        System.out.println("Binary " + intbinary);

        // underscore
        int intunderscore = 1_23_345;
        System.out.println("Underscore_Value " + intunderscore);

    }


    public static void main(String[] args){
        values();
    }
}


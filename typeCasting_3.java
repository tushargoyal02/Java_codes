class typeCasting_3{
    public static void typecast(){

        // doing typecasting
        long y=42;
        //int x=y;    // this can't be done as long can't be assigned to int
        // explicit casting
        int x = (int) y;
        System.out.println("x value : " + x);

        // information loss
        byte narrowbyte = (byte) 123456;
        System.out.println("narrowbyte will show random value : "+ narrowbyte);

        // information loss from float to int
        int inttruncate = (int)0.09;
        System.out.println("Float to int :" + inttruncate);

        // Implicit casting
        char cChar = 'A';   
        int iChar = cChar;
        System.out.println("Char to int conversion: "+ iChar);


        // byte to char using explicit cast
        byte Bbyte = 65;
        cChar = (char) Bbyte; // (bYte will convert to int then int to -> char)

        System.out.println("Bye -> Int -> char : "+ cChar);

    
    }

    public static void main(String[] args)
    {
        typecast();
    }

}
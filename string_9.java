class string_9{

    static void stringExample(){

        String s = "Hello world";

        System.out.println("s values :" + s);

        System.out.println("length : "+ s.length());

        System.out.println("Empty : " + s.isEmpty());



        // comparisom methods
        System.out.println("Equals method " + s.equals("Hello world"));

        System.out.println("equals Ignore Case : " +  s.equalsIgnoreCase("HELLO WORLD"));

        // compaare as lexicograpphy [Compare unicode value]
        System.out.println("compare value return 0 if identifcal : " +  s.compareTo("HELLO WORLD"));


        // searching
            // case sensitive
        System.out.println("search contains : " +  s.contains("Hello"));

            // check the preceding string is starting with the string or not
    
            System.out.println("starts with  : " +  s.startsWith("He"));
    
            System.out.println("End with : " +  s.endsWith("d"));

            System.out.println("Index of : " +  s.indexOf("el"));

            // return 0 if not character is found
            System.out.println("Last Index of  : " +  s.lastIndexOf("o"));
    
    
            // charcter individula
            System.out.println("char at particular char : " +  s.charAt(4));
             
            // substring extraction
                // if the end is not given will return till last
            System.out.println("Substring extraction : " +  s.substring(4,9));


            // trim
                // remove begining & leading white space
            System.out.println("Trim: " +  s.trim());

            // replace character
            System.out.println("character [o] replaces by [r] : " +  s.replaceAll("o","r"));



            // static method
                // represent string method

            System.out.println("String Value : " +  String.valueOf(1.3));


            // sting concat

            String s1 = "Hello world";
            System.out.println("s : " + s1);

            StringBuffer sb = new StringBuffer(s1);
            sb.append(" good ").append("morning :) ");
            // returning string
            System.out.println("Sb string : " + sb.toString());

            System.out.println("Sb length : " + sb.length());

            // character delete
            sb.delete(1,5);   // delete from index 1 to 4
            System.out.println("Sb string : " + sb.toString());

            // inserting values
            sb.insert(1, "ey");
            System.out.println("Sb string : " + sb.toString());

            
    }


    public static void main(String[] args){
        stringExample();
    }
}
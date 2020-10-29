class switch_7{

    static void switchExample(){
    
    int month=3;
    switch (month) {
        case 1: System.out.println("jan");
                break;
        case 2: System.out.println("feb");
                break;
        case 3: System.out.println("march");
                break;
    
        default: System.out.println("default value");
            
       }
    
    }

    // Ternary operators
    static int min(int x, int y){
        int result = (x<y) ? x :y ;
        return result;
    }    

    // label break statement
    static void labelBreak(){
        System.out.println("Working as Inside block : ");

        int num=0;
        outermost: for(int  i=0; i<10 ; i++){
            for (int j=0; j<10; j++){
                if(i==5 && j==5){
                    System.out.println("If condition i & j :" + i + " " + j);
                 //   break;     // break only the inner loop 
                        break outermost;
                }
            num++;  // incrementing num 

            }
        }
    } 

    public static void main(String[] args){
        switchExample();

        //calling ternary operator
        int min = min(9,3); 
        System.out.println(min);



        // calling labled break;
        labelBreak();
    }
}
class demo_4{

    static void go(int[] arr){

        System.out.println(arr[0]);

        // updating value
        arr[0]=12;
        System.out.println(arr[0]);

    }

    public static void main(String[] args){

        int[] arr = {1,2,3};
        go(arr);
        System.out.println(arr[0]);
    }   


}
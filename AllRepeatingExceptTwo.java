class AllRepeatingExceptTwo{

    public static void main(String[] args){
        int[] arr = {23,27,23,17,17,37};

        int xxory = 0;

        for(int val: arr){
            xxory ^= val;
        }

        int rsbm = xxory & -xxory;

        int x = 0;
        int y = 0;

        for(int val: arr){
            if((rsbm & val) == 0){
                x ^= val;
            }else{
                y ^= val;
            }
        }

        if(x < y){
            System.out.println(x + " " + y);
        }else{
            System.out.println(y + " " + x);
        }
    }
}
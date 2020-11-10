class AllReapeatingExceptOne{

    public static void main(String[] args){
        int[] arr = {23,27,23,17,17};

        int xor = 0;

        for(int var: arr){
            xor ^= var;
        }

        System.out.println(xor);
    }
}
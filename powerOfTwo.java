class powerOfTwo{

    public static void main(String[] args){
        int n = 1024;

        int mask = (n & (n-1));

        if(mask == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
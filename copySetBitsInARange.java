class copySetBitsInARange{

    public static void main(String[] args){
        int a = 10;
        int b = 13;
        int left =2;
        int right = 3;

        int mask = (1 << (right-left+1));
        mask--;
        mask = (mask<<(left-1));

        mask = (a & (mask));

        b = b | mask;

        System.out.println(b);
    }
}

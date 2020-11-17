class swapAllOddAndEvenBits{

    public static void solution(int n){
        int res = 0;

        int omask = 0x55555555;
        int emask = 0xAAAAAAAA;

        omask = (omask & n);
        emask = (emask & n);

        omask <<= 1;
        emask >>= 1;

        res = omask | emask;

        System.out.println(res);

    }

    public static void main(String[] args){
        int n = 10;
        solution(n);
    }
}
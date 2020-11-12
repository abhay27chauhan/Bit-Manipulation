class SameNumOfSetBitsAsN{

    public static int csb(long n){
        int res = 0;

        while(n > 0){
            long rsbm = n & -n;
            n = n - rsbm;
            res++;
        }

        return res;
    }

    public static int ncr(long n, int r){
        if(n < r){
            return 0;
        }

        int res = 1;
        for(int i=0; i<r; i++){
            res *= (n-i);
            res /= (i+1);
        }

        return res;
    }

    public static int solution(long n, int k, int i){
        if(i == 0){
            return 0;
        }

        long mask = (1L << i);

        int res = 0;

        if((n & mask) == 0){
            res = solution(n, k, i-1);
        }else{
            int res1 = solution(n, k-1, i-1);
            int res0 = ncr(i, k);
            res = res1 + res0;
        }

        return res;
    }

    public static void main(String[] args){
        long n = 12;
        int k = csb(n);
        int ans = solution(n, k, 63);
        System.out.println(ans);
    }
}
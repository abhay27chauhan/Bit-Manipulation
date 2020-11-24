class NthPalindromicBinary{

    public static int getRev(int n){
        int rev = 0;

        while(n != 0){
            int mask = (n & 1);
            rev |= mask;

            rev <<= 1;
            n >>= 1;
        }
        rev >>= 1;
        return rev;
    }

    public static int solution(int n){
        int count = 1;
        int len = 1;

        while(count < n){
            len++;
            int eleInlen = (1<<(len-1)/2);
            count += eleInlen;
        } 

        count -= (1<<(len-1)/2);
        int offset = n-count-1;

        int ans = (1<<(len-1));
        ans |= (offset << (len/2));

        int valFR = (ans >> (len/2));
        int rev = getRev(valFR);

        ans |= rev;

        return ans;

    }

    public static void main(String[] args){
        int n = 17;

        int ans = solution(n);
        System.out.println(ans);
    }
}
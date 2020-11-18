class countSetBitsInFirstNNaturalNos{

    public static int power2(int n){
        int x = 0;

        while((1<<x) <= n){
            x++;
        }

        return x-1;
    }

    public static int solution(int n){
        if(n == 0){
            return 0;
        }

        int x = power2(n);

        int setBitsInhp2 = x * (1 << (x-1));
        int hp2DiffN = n - (1 << x) + 1;
        int rest = n - (1 << x);

        int res = setBitsInhp2 + hp2DiffN + solution(rest);

        return res;
    }

    public static void main(String[] args){
        int n = 17;
        int ans = solution(n);
        System.out.println(ans);
    }
}
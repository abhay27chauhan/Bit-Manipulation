class josephus{

    public static int powerOf2(int n){
        int i = 1;
        while(i*2 <= n){
            i = i*2;
        }

        return i;
    }

    public static int solution(int n){
        int hp2 = powerOf2(n);
        int l = n - hp2;

        return (2*l) + 1;
    }

    public static void main(String[] args){
        int n = 9;
        int ans = solution(n);
        System.out.println(ans);
    }
}
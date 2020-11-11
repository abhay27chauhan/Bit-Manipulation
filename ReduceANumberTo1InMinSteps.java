class ReduceANumberTo1InMinSteps{

    public static void main(String[] args){
        long n = 8;
        
        int res = 0;
        while(n != 1){
            if(n%2 == 0){
                n = n/2;
            }else if(n == 3){
                res = 2;
                break;
            }else if((n & 3) == 1){
                n = n-1;
            }else if((n & 3) == 3){
                n = n+1;
            }

            res++;
        }

        System.out.println(res);
    }
}
class PrintBinaryAndReverseBits{

    public static void solution(int n){
        boolean flag = false;
        int rev = 0;
        int count = 0;
        for(int i=31; i>=0; i--){
            int mask = (1<<i);
            if(flag){
                if((n&mask) != 0){
                    System.out.print(1);
                    rev = (rev | (1<<count));
                    count++;
                }else{
                    System.out.print(0);
                    count++;
                }

            }else{
                if((n&mask) != 0){
                    flag = true;
                    System.out.print(1);
                    rev = (rev | (1<<count));
                    count++;
                }else{

                }
            }
        }

        System.out.println();
        System.out.println(rev);
    }

    public static void main(String[] args){
        int n = 11;
        solution(n);
    }
}
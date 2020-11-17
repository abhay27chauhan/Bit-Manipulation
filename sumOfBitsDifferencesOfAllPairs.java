class sumOfBitsDifferencesOfAllPairs{

    public static int solution(int[] arr){
        int res = 0;

        for(int i=0; i<32; i++){
            int counton=0;
            for(int val: arr){
                int mask = (1<<i);

                if((val & mask) != 0){
                    counton++;
                }
            }

            int countoff = arr.length-counton;
            int diff = countoff*counton*2;
            res += diff;
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }
}
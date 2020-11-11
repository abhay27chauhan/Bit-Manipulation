class triplets1{

    public static void solution(int[] arr){
        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            int val = arr[i];
            for(int k=i+1; k<arr.length; k++){
                val = val ^ arr[k];

                if(val == 0){
                    count += (k-i);
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        int[] arr = {5,6,2,3,3,5,3,2,5,3};

        solution(arr);
    }
}
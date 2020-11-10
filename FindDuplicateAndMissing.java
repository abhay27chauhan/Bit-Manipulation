class FindDuplicateAndMissing{

    public static void main(String[] args){
        int[] arr = {1,2,3,2,5,6,7};

        int xxory = 0;
        for(int var: arr){
            xxory ^= var;
        }

        for(int i=1; i<=arr.length; i++){
            xxory ^= i;
        }

        int rsbm = xxory & -xxory;

        int x = 0;
        int y = 0;

        for(int var: arr){
            if((rsbm & var) == 0){
                x ^= var;
            }else{
                y ^= var;
            }
        }

        for(int i=1; i<=arr.length; i++){
            if((rsbm & i) == 0){
                x ^= i;
            }else{
                y ^= i;
            }
        }

        for(int var: arr){
            if(var == x){
                System.out.println("Repeating Number: " + x);
                System.out.println("Missing Number: " + y);
                break;
            }else if(var == y){
                System.out.println("Repeating Number: " + y);
                System.out.println("Missing Number: " + x);
                break;
            }
        }
    }
}
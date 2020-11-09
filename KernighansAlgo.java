// count the no. of bits ON
class KernighansAlgo{

    public static void main(String[] args){
        int n = 58;
        int count = 0;
        while(n != 0){

            int rsbm = (n & -n);
            n = n - rsbm;
            count++;
        }

        System.out.println(count);
    }
}
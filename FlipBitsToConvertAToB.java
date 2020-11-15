class FlipBitsToConvertAToB{

    public static void main(String[] args){
        int a = 57;
        int b = 76;

        int flipped = a ^ b;

        int count = 0;
        while(flipped != 0){
            int rsbm = (flipped & -flipped);

            flipped -= rsbm;
            count++;
        }

        System.out.println(count);
    }
}
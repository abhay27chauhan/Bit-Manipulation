class rightMostSetBitMask{

    public static void main(String[] args){
        int n = 58;

        int rsbm = n & -n;

        System.out.println(Integer.toBinaryString(rsbm));
    }
}
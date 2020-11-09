class basic{

    public static void main(String[] args){
        int n = 57;
        int i = 3; // setting i-th bit
        int j = 3; // unsetting j-th bit
        int k = 3; // toggeling k-th bit
        int m = 3; // checking m-th bit

        int onmask = (1 << i);
        int offmask = ~(1<<j);
        int tmask = (1<<k);
        int cmask = (1<<m);
        
        System.out.println(n | onmask);
        System.out.println(n & offmask);
        System.out.println(n ^ tmask);
        System.out.println((n & cmask) == 0 ? false : true);
    }
}
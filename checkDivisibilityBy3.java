class checkDivisibilityBy3{

    public static void main(String[] args){
        String str = "10010101010001";
        int odd = 0;
        int even = 0;
        for(int i=0; i<str.length(); i++){
            int n = str.charAt(i) - '0';

            if((i%2) == 0){
                even += n;
            }else{
                odd += n;
            }
        }

        int diff = even - odd;
        if((diff%11) == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
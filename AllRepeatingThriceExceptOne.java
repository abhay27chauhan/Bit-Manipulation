class AllRepeatingThriceExceptOne{

    public static void main(String[] args){
        int[] arr = {51,57,51,57,63,38,57,63,63,51};

        int tn = Integer.MAX_VALUE, tnp1 = 0, tnp2 = 0;

        for(int i=0; i<arr.length; i++){
            int cwt = (arr[i] & tn);
            int cwtnp1 = (arr[i] & tnp1);
            int cwtnp2 = (arr[i] & tnp2);

            tn = (tn & (~cwt));
            tnp1 = (tnp1 | cwt);

            tnp1 = (tnp1 & (~cwtnp1));
            tnp2 = (tnp2 | cwtnp1);

            tnp2 = (tnp2 & (~cwtnp2));
            tn = (tn | cwtnp2);
        }

        System.out.println(tnp1);
    }
}
class Utf8Encoding{

    public static boolean solution(int[] arr){
        int rbytes = 0;

        for(int val: arr){
            if(rbytes == 0){
                if((val & (val >> 7)) == 0b0){ // 1 byte of 1 length string
                    rbytes = 0;
                }else if((val & (val >> 5)) == 0b110){ // 1th byte of 2 length string
                    rbytes = 1;
                }else if((val & (val >> 4)) == 0b1110){ // 1th byte of 3 length string
                    rbytes = 2;
                }else if((val & (val >> 3)) == 0b11110){ // 1th byte of 4 length string
                    rbytes = 3;
                }
            }else{
                if((val & (val >> 6)) == 0b10){
                    rbytes--;
                }else{
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){
        int[] arr = {197, 130, 1};
        System.out.println(solution(arr));
    }
}
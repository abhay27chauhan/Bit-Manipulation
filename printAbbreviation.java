class printAbbreviation{

    public static void solution(String str){
        int count = 0;

        for(int i=0; i<(1<<str.length()); i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                int mask = 1<<str.length()-1-j;

                if((i & mask) == 0){
                    if(count == 0){
                        sb.append(ch);
                    }else{
                        sb.append(count);
                        sb.append(ch);
                        count = 0;
                    }
                }else{
                    count++;
                }
            }

            if(count !=0){
                sb.append(count);
                count = 0;
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args){
        String str = "pep";

        solution(str);
    }
}
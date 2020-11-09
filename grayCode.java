import java.util.ArrayList;
class grayCode{

    public static ArrayList<String> solution(int n){
        if(n == 1){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }

        ArrayList<String> rres = solution(n-1);
        ArrayList<String> mres = new ArrayList<>();

        for(int i=0; i<rres.size(); i++){
            String rstr = rres.get(i);
            mres.add("0" + rstr);
        }

        for(int i=rres.size()-1; i>=0; i--){
            String rstr = rres.get(i);
            mres.add("1" + rstr);
        }

        return mres;
    }

    public static void main(String[] args){
        int n = 3;
        ArrayList<String> ans = solution(n);
        System.out.println(ans);
    }
}
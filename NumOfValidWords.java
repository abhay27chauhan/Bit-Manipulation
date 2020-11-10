import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.String;
class NumOfValidWords{

    public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles){
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<26; i++){
            map.put((char)('a' + i), new ArrayList<>());
        }

        for(String word: words){
            int wmask = 0;
            for(char c: word.toCharArray()){
                int bit = c-'a';
                wmask = wmask | (1 << bit);
            }

            HashSet<Character> unique = new HashSet<>();
            for(char c: word.toCharArray()){
                if(unique.contains(c)){
                    continue;
                }   

                unique.add(c);
                map.get(c).add(wmask);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(String puzzle: puzzles){
            int pmask = 0;
            for(char c: puzzle.toCharArray()){
                int bit = c-'a';
                pmask = pmask | (1 << bit);
            }

            int fchar = puzzle.charAt(0);
            ArrayList<Integer> list = map.get(fchar);
            int count = 0;
            for(int wmask: list){
                if((wmask & pmask) == wmask){
                    count++;
                }
            }
            res.add(count);
        }

        return res;
    }

    public static void main(String[] args){
		int n = 7;
		String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};

		int m = 6;
		String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};

		ArrayList<Integer> ans = findNumOfValidWords(words,puzzles);
		for(int i=0; i<ans.size(); i++) {
			System.out.println(puzzles[i] + " -> " + ans.get(i));
		}
    }
}
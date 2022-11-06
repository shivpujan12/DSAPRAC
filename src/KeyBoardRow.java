import java.util.ArrayList;

/**
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 */
public class KeyBoardRow {
    String row1 = "qwertyuiop";
    String row2 = "asdfghjkl";
    String row3 = "zxcvbnm";
    public String[] findWords(String[] words) {
        ArrayList<String> a = new ArrayList<>();

        int index = 0;
        for (String word : words) {
            String letter = Character.toString(word.charAt(0)).toLowerCase();
            if(row1.contains(letter)){
                if(checkInRow1(word)){
                    a.add(word);
                }
            } else if(row2.contains(letter)){
                if(checkInRow2(word)){
                    a.add(word);
                }
            } else if(row3.contains(letter)){
                if(checkInRow3(word)){
                    a.add(word);
                }
            }
        }

        return a.toArray(new String[0]);

    }

    private boolean checkInRow3(String word) {
        for (int i = 1; i < word.length(); i++) {
            String letter = Character.toString(word.charAt(i)).toLowerCase();
            if(!row3.contains(letter)){
                return false;
            }
        }
        return true;
    }

    private boolean checkInRow2(String word) {
        for (int i = 1; i < word.length(); i++) {
            String letter = Character.toString(word.charAt(i)).toLowerCase();
            if(!row2.contains(letter)){
                return false;
            }
        }
        return true;
    }

    private boolean checkInRow1(String word) {
        for (int i = 1; i < word.length(); i++) {
            String letter = Character.toString(word.charAt(i)).toLowerCase();
            if(!row1.contains(letter)){
                return false;
            }
        }
        return true;
    }
}

import java.util.ArrayList;
import java.util.List;

public class ItemMatchingRule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index = 0;
        switch (ruleKey) {
            case "name" -> index = 2;
            case "color" -> index = 1;
            case "type" -> index = 0;
        }
        for (List<String> i : items) {
            if(ruleValue.equals(i.get(index))){
                count++;
            }
        }
        return count;
    }

    public void unitTest() {
        List<List<String>> items = new ArrayList<>();
        List<String> i = new ArrayList<>();
        i.add("phone");
        i.add("blue");
        i.add("pixel");
        items.add(i);
        i = new ArrayList<>();
        i.add("computer");
        i.add("silver");
        i.add("phone");
        items.add(i);
        i = new ArrayList<>();
        i.add("phone");
        i.add("gold");
        i.add("iphone");
        items.add(i);

        System.out.println(items);

        System.out.println(countMatches(items,"type","phone"));
    }

}

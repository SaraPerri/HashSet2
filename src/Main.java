import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> musicSet = createHashSet();
        String elementVerify = "Bass";
        Iterator<String> iterator = musicSet.iterator();
        while (iterator.hasNext()) {
            String instrument = iterator.next();
            if (instrument.equals(elementVerify)) {
                iterator.remove();
                System.out.println("The element has been removed from the Set");
            }
        }
        musicSet.clear();
        if (musicSet.isEmpty()){
            System.out.println("Set has been cleared successfully");
        }else{
            System.out.println("Set is not empty.");
        }
    }

    public static Set<String> createHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Guitar");
        set.add("Bass");
        set.add("Drum");
        set.add("Keyboard");
        return set;
    }
}
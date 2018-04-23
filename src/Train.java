import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Train implements Nameable {

    private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Namealbe>();

    public void instappen(Nameable nameable1, Nameable nameable2, Nameable nameable3){
        instappen(nameable1);
        instappen(nameable2);
        instappen(nameable3);
    }

    public void instappen(Nameable nameable){
        String key = nameable.getName();
        Namealbe value = nameable;
        this.stoelen.put(key, value);
        showInfo(nameable, " is ingestapt");
    }

    private int getCount(){
        return stoelen.size();
    }

    private void showInfo(Nameable uitgestapte, String actie){
        System.out.println(uitgestapte.getName() + actie);
    }

    public Nameable uitstappen(String name){
        if (!stoelen.containsKey(name)){
            System.out.println(name + " zit niet in de trein.");
            return null;
        }
        Nameable uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;
    }

    public String toString(){
        return "Er zitten "+getCount()+" mensen in de bus.";
    }

    public void info(){
        System.out.println(this);
    }

    public void printNames(){
        System.out.println("Deze mensen zitten in de trein:");
        for(Map.Entry<String, Nameable> entry : stoelen.entrySet()){
            String key = entry.getKey();
            System.out.println("- "+key);
        }
    }
}

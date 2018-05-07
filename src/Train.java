import java.util.HashMap;

public class Train {

    private HashMap<String, Persoon> chairs = new HashMap<>();

    public void instappen(Persoon persoon) {
        String key = persoon.getName();
        Persoon value = persoon;
        this.chairs.put(key, value);
        showInstappenInfo(persoon, " is ingestapt");
    }

    public Persoon uitstappen(String name) {
        if (!chairs.containsKey(name)) {
            System.out.println(name + " zit niet in de trein");
        }
        Persoon getOutPersoon = chairs.get(name);
        chairs.remove(name);
        showUitstappenInfo(getOutPersoon, " is uitgestapt");
        return getOutPersoon;
    }

    // TODO maak ticket mooier
    private void showInstappenInfo(Persoon persoon, String action) {
        System.out.println( persoon.getName() + action + ", " +
                "Ticket gekocht: " + persoon.getTicket() + ", " +
                persoon.getClasss() + "e klas" + ", " +
                "Eindbestemming: " + persoon.getDestination());
    }

    private void showUitstappenInfo(Persoon persoon, String action) {
        System.out.println(persoon.getName() + action);
    }

    private int getCount() {
        return chairs.size();
    }

    public void info() {
        System.out.println(this);
    }

    public String[] getNames() {
        String[] names = new String[getCount()];
        int i = 0;
        for (String key : chairs.keySet()) {
            names[i] = key;
            i++;
        }
        return names;
    }

    public String toString() {
        return "Er zitten " + getCount() + " passagiers in de trein";
    }
}

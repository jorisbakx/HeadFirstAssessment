public abstract class Mens implements Nameable {
    private String name;
    private String description;

    public Mens(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }
}

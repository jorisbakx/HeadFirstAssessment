public class Main {

    public static void main(String[] args) {
        Train train = new Train();
        train.info();

        // Treinstation goes
        TrainStation Goes = new TrainStation();
        Goes.rijdtBinnen(train);
        Persoon persoon1 = new Persoon("Joris", true, 2, "vlissingen");
        train.instappen(persoon1);
        Persoon persoon2 = new Persoon("Joery", true, 2, "vlissingen");
        train.instappen(persoon2);
        Persoon persoon3 = new Persoon("Ashley", true, 2, "vlissingen");
        train.instappen(persoon3);
        Persoon persoon4 = new Persoon("Joost", true, 2, "vlissingen");
        train.instappen(persoon4);
        Persoon persoon5 = new Persoon("Mike", true, 2, "vlissingen");
        train.instappen(persoon5);
        Persoon persoon6 = new Persoon("Zeta", true, 1, "vlissingen");
        train.instappen(persoon6);
        Persoon persoon7 = new Persoon("Hassan", false, null, "middelburg");
        train.instappen(persoon7);
        train.info();
        
        //Treinstation Arnemuiden
        TrainStation Arnemuiden = new TrainStation();
        Arnemuiden.rijdtBinnen(train);
        Persoon persoon8 = new Persoon("Theta", true, 2, "vlissingen-souburg");
        train.instappen(persoon8);
        Persoon persoon9 = new Persoon("Iota", true, 2, "vlissingen-souburg");
        train.instappen(persoon9);
        train.info();

        // Kaartjes controle
        System.out.println("Kaartjescontrole");
        Persoon uitstappenPersoon7 = (Persoon) train.uitstappen("Hassan");
        train.info();

        //Treinstation Middelburg
        TrainStation Middelburg = new TrainStation();
        Middelburg.rijdtBinnen(train);
        Persoon persoon10 = new Persoon("Kappa", true, 1, "vlissingen");
        train.instappen(persoon10);
        train.info();


        //Treinstation Vliss souberg
        TrainStation VlissingenSoeperg = new TrainStation();
        VlissingenSoeperg.rijdtBinnen(train);
        Persoon uitstappenPersoon8 = (Persoon) train.uitstappen("Theta");
        Persoon uitstappenPersoon9 = (Persoon) train.uitstappen("Iota");
        train.info();

        //Treinstation Vliss
        TrainStation vlissingen = new TrainStation();
        vlissingen.rijdtBinnen(train);
        train.info();


    }
}
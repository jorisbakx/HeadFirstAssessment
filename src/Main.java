public class Main {

    public static void main(String[] args) {
        Train train = new Train();

        // Treinstation goes
        Passagier zwartrijder = new Passagier("zwartrijder");
        Passagier mariano = new Passagier("mariano");
        Passagier ashley = new Passagier("ashley");
        Passagier joris = new Passagier("joris");
        Passagier joost = new Passagier("joost");

        train.instappen(zwartrijder);
        train.instappen(mariano);
        train.instappen(ashley);
        train.instappen(joris);
        train.instappen(joost);
        train.info();

        //Treinstation Arnemuiden
        Passagier geff = new Passagier("geff");
        Passagier andries = new Passagier("andries");
        train.instappen(geff);
        train.instappen(andries);
        train.info();

        //Treinstation Middelburg
        Passagier joery = new Passagier("joery");
        Mens uitgestapte = (Mens) train.uitstappen("zwartrijder");
        train.instappen(joery);
        train.info();

        //Treinstation Vliss souberg
        Mens uitgestapte = (Mens) train.uitstappen("geff");
        Mens uitgestapte = (Mens) train.uitstappen("andries");
        train.info();

        //Treinstation Vliss
        TrainStation vlissingen = new TrainStation();
        vlissingen.rijdtBinnen(train);


    }
}
import java.util.Stack;

public class TrainStation {

    private Stack<Persoon> perron = new Stack<Persoon>();

    public void rijdtBinnen(Train train) {
        leegBus(train);
        vulBus(train);
    }

    // TODO zorg dat niet iedereen uitstapt
    private void leegBus(Train train) {
        for(String name : train.getNames()) {
            Persoon uitgestapte = train.uitstappen(name);
            perron.push(uitgestapte);
        }
    }

    private void vulBus(Train train) {
        while(!perron.isEmpty()){
            Persoon stacked = perron.pop();
            train.instappen(stacked);
        }
    }
}
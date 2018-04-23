import java.util.Stack;
import javax.naming.Name;

public class TrainStation {
    private Stack<Nameable> perron = new Stack<Nameable>();

    public void rijdtBinnen(Train train){
        leegTrain(train);
        vulTrain(train);
    }

    private void leegTrain(Train train){

        for (String name : train.getNames()){
            Nameable uitgestapte = train.uitstappen(name);
            perron.push(uitgestapte);
        }
    }

    private void vulTrain(Train train){
        while(!perron.isEmpty()){
            Nameable opgestapelde = perron.pop();
            train.instappen(opgestapelde);
        }
    }
}

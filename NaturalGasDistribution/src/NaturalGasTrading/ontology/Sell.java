package NaturalGasTrading.ontology;

import jade.content.AgentAction;
import jade.core.AID;

public class Sell implements AgentAction {
private NaturalGas item;

public NaturalGas getItem() {
return item;
}

public void setItem(NaturalGas item) {
this.item = item;
}

}
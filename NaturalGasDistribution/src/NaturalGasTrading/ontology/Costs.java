package NaturalGasTrading.ontology;

import jade.content.Predicate;
import jade.core.AID;

public class Costs implements Predicate {
private NaturalGas item;
private int price;
private int energy;

public NaturalGas getItem() {
return item;
}

public void setItem(NaturalGas item) {
this.item = item;
}

public int getPrice() {
return price;
}

public void setPrice(int price) {
this.price = price;
}


public int getEnergy()
{
	return energy;
}



public void setEnergy(int energy) {
	this.energy=energy;
	
}


}
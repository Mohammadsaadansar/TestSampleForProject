package NaturalGasTrading.supplier;

public interface NaturalGasSupplierGui {

void setAgent(NaturalGasSupplierAgent a);
void show();
void hide();
void notifyUser(String message);
void dispose();
}
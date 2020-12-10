package NaturalGasTrading.load;

public interface NaturalGasLoadGui {

void setAgent(NaturalGasLoadAgent a);
void show();
void hide();
void notifyUser(String message);
void dispose();
}

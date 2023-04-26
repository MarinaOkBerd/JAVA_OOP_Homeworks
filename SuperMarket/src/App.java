import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionClient;
import Classes.SpecialClient;
import Interfaces.iActorBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        /*Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Ivan");
        OrdinaryClient client2 = new OrdinaryClient("Petr");
        SpecialClient client3 = new SpecialClient("Semen", 12345);
        SpecialClient client4 = new SpecialClient("Oleg", 67899);
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.update();*/
        Market market = new Market();
        iActorBehavior item1 = new OrdinaryClient("Ivan");
        iActorBehavior item2 = new SpecialClient("Semen", 12345);
        iActorBehavior item3 = new PromotionClient("Bob", "Sale 30%");
        iActorBehavior item4 = new PromotionClient("Ted", "Sale 20%");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.update();
        
    }

}



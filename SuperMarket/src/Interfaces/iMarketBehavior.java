package Interfaces;

import java.util.List;
import Classes.Actor;
/*
 * Интерфейс магазина
 */
public interface iMarketBehavior {
    //добавляем входящего клиента
    void acceptToMarket(iActorBehavior actor);
    //удаляем уходящего клиента
    void releaseFromMarket(List<Actor> actors);
    // обновляем состояние очереди
    void update();
    
}
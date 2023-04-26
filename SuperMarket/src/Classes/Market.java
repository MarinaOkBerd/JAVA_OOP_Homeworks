package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;
/*
 * Класс для поведения клиентов в магазине,
 * используя интерфейсы iMarketBehavior, iQueueBehavior
 */

public class Market implements iMarketBehavior, iQueueBehavior{
    //список клиентов в очереди
    private List<iActorBehavior> queue;

    //конструктор класса спмска клиентов в очереди 
    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }
    //добавляем входящего клиента 
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName() + " клиент зашел в магазин");
        takeInQueue(actor);
        
    }
    //добавляем клиента в очередь
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь.");
    }
    //удаляем уходящего клиента 
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor : actors){
            System.out.println(actor.getActor().getName() + " клиент вышел из магазина");
            this.queue.remove(actor);
        }
    }
    // обновляем состояние очереди
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
    // выдаем клиенту заказ, если он его сделал
    @Override
    public void giveOrder() {
        for (iActorBehavior actor : queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил заказ.");
            }
        }
    }
    // удаляем клиента из очереди
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehavior actor : queue){
            if(actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди.");
            }
        }
        releaseFromMarket(releaseActors);
        
    }
    // принимаем закза от клиента
    @Override
    public void takeOrder() {
        for (iActorBehavior actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал свой заказ.");
            }
        }
    }

    
}
package Interfaces;
/*
 * Интерфейс очереди в магазине
 */
public interface iQueueBehavior {
    //добавляем клиента в очередь
    void takeInQueue(iActorBehavior actor);
    //удаляем клиента из очереди
    void releaseFromQueue();
    //принимаем заказ у клиента из очереди
    void takeOrder();
    //возвращаем заказ клиента
    void giveOrder();
}


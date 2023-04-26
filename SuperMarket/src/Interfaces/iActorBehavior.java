package Interfaces;

import Classes.Actor;
/*
 * Интерфейс поведения клиента в магазине
 */
public interface iActorBehavior {
    //метод для клинта сделать заказ
    void setMakeOrder(boolean makeOrder);
    //метод для клиента забрать заказ
    void setTakeOrder(boolean pickUp);
    //проверяем, сделал ли клиент заказ
    boolean isMakeOrder();
    //проверяем, забрал ли клиент заказ
    boolean isTakeOrder();
    //возвращаем экземпляр класс клиента
    Actor getActor();
    
}
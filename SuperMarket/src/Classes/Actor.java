package Classes;
// Абстрактный класс клиента

import Interfaces.iActorBehavior;
import Interfaces.iReturnOrder;

// Абстрактный класс для клиента магазина

public abstract class Actor implements iActorBehavior, iReturnOrder{
    //защищенное поле имя клиента
    protected String name;
    // проверяем, забирает ли клиент заказ
    protected boolean isTakeOrder;
    // проверяем, хочет ли клиент сделать заказ
    protected boolean isMakeOrder;
    //проверяем, сделана ли заявка на возврат
    protected boolean isCreateReturnOrder;
    //проверяем, получение наличных денег за возврат
    protected boolean returnMoney;
    //
    //protected boolean returnToCard;
    //
    //protected boolean rejectionReturnOrder;
    /*конструктор класса для обычного клиента
     * @param name это имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }
    //абстрактный метод вывода имени клиента
    public abstract String getName();
    

}
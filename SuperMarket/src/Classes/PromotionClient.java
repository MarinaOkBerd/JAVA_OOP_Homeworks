package Classes;
// Класс для клиента по акции, наследуется от Actor
public class PromotionClient extends Actor{
    //название акции
    private String namePromotion;
    //номер клиента
    private static int number;
    static{
        number = 0;
    }    
    /**
     * конструктор класса для клиента по акции
     * @param name это имя клиента
     * @param namePromotion это название акции
     * @param number это номер клиента
     */

    public PromotionClient(String name, String namePromotion){
        super(name);
        this.namePromotion = namePromotion;
        number ++;
    }
    /**
     * переопределение вывода имени клиенте
     */
    @Override
    public String getName() {
        return super.name;
    }
    //получения вывода названия акции
    public String getNamePromotion() {
        return namePromotion;
    }
    //получение вывода номера клиента
    public int getNumber() {
        return PromotionClient.number;
    }
    // переопределяем метод получения клиента
    @Override
    public Actor getActor() {
        return this;
    }
    // проверяем, хочет ли клиент сделать заказ
    @Override
    public boolean isMakeOrder() {
        return super.isTakeOrder;
    }
    // переопределяем метод забрать заказ
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    // переопределяем метод сделать заказ
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    // переопределяем метод забрать заказ
    @Override
    public void setTakeOrder(boolean pickUp) {
        super.isTakeOrder = pickUp;
    }
    // проверяем, сделана ли заявка на возврат
    @Override
    public boolean isCreateReturnOrder() {
        return super.isCreateReturnOrder;
    }
    // переопределяем метод сделать заявку на возврат
    @Override
    public void setCreateReturnOrder(boolean CreateReturnOrder) {
        super.isCreateReturnOrder = CreateReturnOrder;
    }
    @Override
    public boolean returnMoney() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setReturnMoney() {
        // TODO Auto-generated method stub
        
    }
}
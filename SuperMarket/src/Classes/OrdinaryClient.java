package Classes;
    // Класс для обычного клиента, наследуется от Actor

public class OrdinaryClient extends Actor {
    /*конструктор класса для обычного клиента
    * @param name это имя клиента
    */
    public OrdinaryClient(String name){
        super(name);
    }
    /**
     * переопределение вывода имени клиента
     */
    @Override
    public String getName() {
        return super.name;
    }
    // проверяем, хочет ли клиент сделать заказ
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    // проверяем, забирает ли клиент заказ
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    // переопределяем метод сделать заказ
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }
    // переопределяем метод забрать заказ
    @Override
    public void setTakeOrder(boolean pickUp) {
        super.isTakeOrder = isTakeOrder;
        
    }
    // переопределяем метод получения клиента
    @Override
    public Actor getActor() {
        return this;
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
    public void setReturnMoney() {
       // TODO
    }
    @Override
    public boolean returnMoney() {
        // TODO Auto-generated method stub
        return false;
    }

    
    
    
}

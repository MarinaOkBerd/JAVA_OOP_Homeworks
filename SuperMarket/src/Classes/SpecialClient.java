package Classes;
// Класс для специального клиента, наследуется от Actor

public class SpecialClient extends Actor {
    // номер карты клиента
    private int idVip;
    /**
     * конструктор класса для специального клиента
     * @param name это имя клиента
     * @param idVip номер карты клиента
     */
    public SpecialClient(String name, int idVip){
        super(name);
        this.idVip = idVip;
    }
    /**
     * переопределение вывода имени клиенте
     */
    @Override
    public String getName() {
        return super.name;
    }
    // получение номера карты специального клиента
    public int getVipId(){
        return idVip;
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
    public void setCreateReturnOrder(boolean MakeReturnOrder) {
        super.isCreateReturnOrder = MakeReturnOrder;
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
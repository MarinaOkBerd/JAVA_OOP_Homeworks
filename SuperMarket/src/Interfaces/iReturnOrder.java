package Interfaces;


public interface iReturnOrder {
    //метод сделать заявку на возврат
    void setCreateReturnOrder(boolean CreateReturnOrder);
    // возвращаем наличные деньги за возврат
    void setReturnMoney();
    //void setReturnToCard(boolean isReturnToCard);
    //void getRejectionReturnOrder(boolean isRejectionReturnOrder);
    //проверяем, сделана ли заявка на возврат
    boolean isCreateReturnOrder();
    //проверяем, получение наличных денег за возврат
    boolean returnMoney();
    //boolean isReturnToCard();
    //boolean isRejectionReturnOrder();


}
package org.calma.poo.semaine13;

public interface OrderState {
    void confirmOrder(Order order);
    void prepareOrder(Order order);
    void shipOrder(Order order);
    void deliverOrder(Order order);
}

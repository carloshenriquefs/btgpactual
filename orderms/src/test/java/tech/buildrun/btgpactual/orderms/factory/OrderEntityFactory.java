package tech.buildrun.btgpactual.orderms.factory;

import tech.buildrun.btgpactual.orderms.entitiy.OrderEntity;
import tech.buildrun.btgpactual.orderms.entitiy.OrderItem;

import java.util.List;
import java.math.BigDecimal;

public class OrderEntityFactory {

    public static OrderEntity build() {
        var items = new OrderItem("notebook", 1, BigDecimal.valueOf(20.50));

        var entity = new OrderEntity();
        entity.setOrderId(1L);
        entity.setCustomerId(2L);
        entity.setTotal(BigDecimal.valueOf(20.50));
        entity.setItems(List.of(items));

        return entity;
    }
}

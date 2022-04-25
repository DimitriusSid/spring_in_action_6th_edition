package spring_in_action.sp_taco_cloud.tacos.data;

import spring_in_action.sp_taco_cloud.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);
}

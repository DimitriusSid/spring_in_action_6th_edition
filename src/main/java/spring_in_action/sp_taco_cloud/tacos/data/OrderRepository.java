package spring_in_action.sp_taco_cloud.tacos.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import spring_in_action.sp_taco_cloud.tacos.TacoOrder;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> readTacoOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
    List<TacoOrder> findByDeliveryCityOrderByDeliveryCity(String city);
    @Query("TacoOrder o where o.deliveryCity='Seattle'")
    List<TacoOrder> readTacoOrderDeliveredInSeattle();


}

package spring_in_action.sp_taco_cloud.tacos.data;

import org.springframework.data.repository.CrudRepository;
import spring_in_action.sp_taco_cloud.tacos.Ingredient;



public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

package spring_in_action.sp_taco_cloud.tacos.data;

import spring_in_action.sp_taco_cloud.tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);

}

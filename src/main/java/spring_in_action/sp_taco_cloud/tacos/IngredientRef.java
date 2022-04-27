package spring_in_action.sp_taco_cloud.tacos;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(value = "Ingredient_Ref")
public class IngredientRef {

    private final String ingredient;
}

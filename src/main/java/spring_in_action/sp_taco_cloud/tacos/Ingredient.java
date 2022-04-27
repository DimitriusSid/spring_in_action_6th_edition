package spring_in_action.sp_taco_cloud.tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(value = "Ingredient")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient implements Persistable<String> {

    @Id
    private final String id;

    @Column(value = "name")
    private final String name;

    @Column(value = "type")
    private final Type type;

    @Override
    public boolean isNew() {
        return false;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}

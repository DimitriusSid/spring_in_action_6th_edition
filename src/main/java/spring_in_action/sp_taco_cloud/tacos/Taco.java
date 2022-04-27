package spring_in_action.sp_taco_cloud.tacos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Data
@Table(value = "Taco")
public class Taco {

    @Id
    private Long id;

    @Column(value = "created_at")
    private Date createdAt = new Date();

    @Column(value = "name")
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

}

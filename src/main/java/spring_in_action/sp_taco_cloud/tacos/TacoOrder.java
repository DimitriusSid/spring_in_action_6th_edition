package spring_in_action.sp_taco_cloud.tacos;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Table("Taco_Order")
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column(value = "placed_at")
    private Date placedAt;

    @Column(value = "delivery_Name")
    @NotBlank(message = "Delivery name is required")
    private String deliveryName;

    @Column(value = "delivery_Street")
    @NotBlank(message = "Street is required")
    private String deliveryStreet;

    @Column(value = "delivery_City")
    @NotBlank(message = "City is required")
    private String deliveryCity;

    @Column(value = "delivery_State")
    @NotBlank(message = "State is required")
    private String deliveryState;

    @Column(value = "delivery_Zip")
    @NotBlank(message = "Zip code is required")
    private String deliveryZip;

    @Column(value = "cc_number")
    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;

    @Column(value = "cc_expiration")
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Must be formatted MM/YY")
    private String ccExpiration;

    @Column(value = "cc_cvv")
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }

}

package sellweb.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


/**
 * The information of product
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    /**
     * 0 represents available, 1 represents unavailable
     */
    private Integer productStatus;

    private Integer categoryType;
}

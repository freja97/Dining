package sellweb.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import sellweb.dataobject.OrderDetail;

@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    /**
     * The status of order
     */
    private Integer orderStatus;

    /**
     * The status of payment
     */
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}

package sellweb.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "The product doesn't exist"),

    PRODUCT_STOCK_ERROR(11, "The stock of product is incorrect"),

    ORDER_NOT_EXIST(12, "The order doesn't exist"),

    ORDERDETAIL_NOT_EXIST(13, "The order detail doesn't exist"),

    ORDER_STATUS_ERROR(14, "The order status is incorrect"),

    ORDER_UPDATE_FAIL(15, "The order cannot be updated"),

    ORDER_DETAIL_EMPTY(16, "The order detail is empty"),

    ORDER_PAY_STATUS_ERROR(17, ""),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

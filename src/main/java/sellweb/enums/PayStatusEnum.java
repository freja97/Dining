package sellweb.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {

    WAIT(0, "Wait for pay"),
    SUCCESS(1, "paid successfully")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

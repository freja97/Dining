package sellweb.VO;

import lombok.Data;


/**
 * The view object of result .
 *
 * @param <T> the type of data
 */
@Data
public class ResultVO<T> {

    /**
     * The code of status
     */
    private Integer code;


    /**
     * The message
     */
    private String msg;


    /**
     * The data
     */
    private T data;
}

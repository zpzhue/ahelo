package cn.irisz.ahelo.common.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Schema(name = "通用返回模型对象")
@Data
public class R<T> {

    @Schema(description = "返回的状态码", example = "200")
    private Integer code;

    @Schema(description = "服务的返回的消息内容，如果返回状态码异常，可以显示此信息")
    private String message;

    @Schema(description = "通用数据对象")
    private T data;

    /**
     * 构造器私有
     */
    private R(){}

    /**
     * 返回成功
     * @return R
     */
    public static <T> R <T> ok(){
        R<T> r = new R<>();
        r.setCode(ResponseEnum.SUCCESS.getCode())
                .setMessage(ResponseEnum.SUCCESS.getMessage());
        return r;
    }

    public static <T> R <T> ok(String message){
        R<T> r = new R<>();
        r.setCode(ResponseEnum.SUCCESS.getCode()).setMessage(message);
        return r;
    }

    public static <T> R <T> ok(String message, T data){
        R<T> r = new R<>();
        r.setCode(ResponseEnum.SUCCESS.getCode()).setMessage(message).setData(data);
        return r;
    }

    /**
     * 返回失败
     * @return R
     */
    public static <T> R <T> error(){
        return new R<T>()
                .setCode(ResponseEnum.ERROR.getCode())
                .setMessage(ResponseEnum.ERROR.getMessage());
    }

    /**
     * 返回失败，特定消息
     * @return R
     */
    public static <T> R <T> error(String message){
        return new R<T>()
                .setCode(ResponseEnum.ERROR.getCode())
                .setMessage(message);
    }

    public static <T> R <T> error(ResponseCode code, String message){
        return new R<T>()
                .setCode(code.getCode())
                .setMessage(message);
    }

    /**
     * 设置特定结果
     * @param responseEnum 返回枚举
     * @return R
     */
    public static <T> R <T> response(ResponseEnum responseEnum){
        return new R<T>()
                .setCode(responseEnum.getCode())
                .setMessage(responseEnum.getMessage());
    }

}

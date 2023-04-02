package cn.irisz.ahelo.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@ToString
public enum ResponseEnum {
    /**
     * 通用成功结果
     */
    SUCCESS(ResponseCode.Success.getCode(), "成功"),
    /**
     * 通用错误结果
     */
    ERROR(ResponseCode.ServerError.getCode(), "服务器内部错误"),
    PARAMS_VALID_ERROR(ResponseCode.ClientError.getCode(), "参数校验错误"),


    /**
     * 401 ~ 500 参数校验错误
     */
    LOGIN_AUTH_ERROR(401, "用户未登录，请登录后重试"),
    LOGIN_TOKEN_CHECK_ERROR(402, "Token解析错误"),
    LOGIN_USERNAME_OR_PASSWORD_ERROR(403, "用户或密码错误"),


    /**
     * 501 ~ 600 后端服务器错误
     */

    SERVLET_ERROR(502, "servlet请求异常"),
    UPLOAD_ERROR(503, "文件上传错误"),

    ;

    /**
     * 响应状态码
     */
    private final Integer code;
    /**
     * 响应信息
     */
    private final String message;
}

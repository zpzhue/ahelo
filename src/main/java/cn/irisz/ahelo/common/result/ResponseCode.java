package cn.irisz.ahelo.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum ResponseCode {
    Success(200),
    ClientError(400),

    ServerError(500)
    ;

    private final Integer code;
}

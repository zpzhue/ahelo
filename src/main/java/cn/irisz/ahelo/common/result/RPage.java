package cn.irisz.ahelo.common.result;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RPage<T> {
    @Schema(description = "当前页")
    private Integer page;

    @Schema(description = "每页条数")
    private Integer pageSize;

    @Schema(description = "总数量")
    private Long total;

    @Schema(description = "分页数据")
    private List<T> pageData;

}

package cn.irisz.ahelo.controller.admin.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Schema(description = "分页参数")
public class CommonPageSchema {

    @Schema(description = "当前页数", defaultValue = "1")
    private Integer currentPage;

    @Schema(description = "每页显示条目个数", defaultValue = "10")
    private Integer pageSize;

    @Schema(description = "总条目数")
    @NotEmpty
    private Long total;



}

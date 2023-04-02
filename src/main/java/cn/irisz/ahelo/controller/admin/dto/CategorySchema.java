package cn.irisz.ahelo.controller.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "更新分类参数")
@Data
public class CategorySchema {

    @Schema(description = "分类值")
    private String name;

    @Schema(description = "分类名称")
    private String displayName;
}

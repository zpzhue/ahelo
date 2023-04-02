package cn.irisz.ahelo.controller.admin;

import cn.irisz.ahelo.common.result.R;
import cn.irisz.ahelo.common.result.RPage;
import cn.irisz.ahelo.controller.admin.dto.CategorySchema;
import cn.irisz.ahelo.entries.Category;
import cn.irisz.ahelo.service.CategoryService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@RestController
@Tag(name = "分类管理")
@RequestMapping("/admin/blog/category")
public class BlogCategoryController {
    @Resource
    private CategoryService categoryService;

    @GetMapping("/")
    @Operation(summary = "获取分类列表")
    @Parameter(name = "currentPage", description = "当前页数")
    @Parameter(name = "pageSize", description = "每页显示条目个数")
    public RPage<Category> list(
            @Valid @NotEmpty @RequestParam(name = "currentPage", defaultValue = "1") Integer currentPage,
            @Valid @NotEmpty @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize
    ) {
        Page<Category> page = Page.of(currentPage, pageSize);
        categoryService.page(page);
        return new RPage<Category>()
                .setPage(currentPage)
                .setPageSize(pageSize)
                .setTotal(page.getTotal())
                .setPageData(page.getRecords());
    }

    @PostMapping("/")
    @Operation(summary = "创建分类")
    public R<Boolean> insert(@NotNull @Valid @RequestBody CategorySchema schema) {
        Category category = new Category()
                .setName(schema.getName())
                .setDisplayName(schema.getDisplayName());
        boolean status = categoryService.save(category);
        return R.ok("创建成功", status);
    }

    @PutMapping("/{id}")
    @Operation(summary = "更新分类")
    public R<Boolean> update(@Valid @NotNull @PathVariable Integer id,
                              @Valid @NotNull @RequestBody CategorySchema schema) {
        Category category = new Category()
                .setId(id)
                .setName(schema.getName())
                .setDisplayName(schema.getDisplayName());
        boolean status = categoryService.updateById(category);
        return R.ok("更新成功", status);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除分类")
    public R<Boolean> delete(@NotNull @PathVariable Integer id){
        boolean status = categoryService.updateById(new Category().setIsDelete(1));
        return R.ok("删除成功", status);
    }
}

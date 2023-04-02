package cn.irisz.ahelo.service.impl;

import cn.irisz.ahelo.entries.Category;
import cn.irisz.ahelo.mapper.CategoryMapper;
import cn.irisz.ahelo.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【blog_category(博客分类表)】的数据库操作Service实现
* @createDate 2023-03-05 22:11:23
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}





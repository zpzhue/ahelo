package cn.irisz.ahelo.service.impl;

import cn.irisz.ahelo.entries.ArticleTag;
import cn.irisz.ahelo.mapper.ArticleTagMapper;
import cn.irisz.ahelo.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【blog_article_tag(文章标签关联表)】的数据库操作Service实现
* @createDate 2023-03-05 22:11:23
*/
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag>
    implements ArticleTagService{

}





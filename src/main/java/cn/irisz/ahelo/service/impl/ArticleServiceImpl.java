package cn.irisz.ahelo.service.impl;

import cn.irisz.ahelo.entries.Article;
import cn.irisz.ahelo.mapper.ArticleMapper;
import cn.irisz.ahelo.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【blog_article(博客文章表)】的数据库操作Service实现
* @createDate 2023-03-05 22:11:23
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}





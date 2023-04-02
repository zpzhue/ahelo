package cn.irisz.ahelo.service.impl;

import cn.irisz.ahelo.entries.Tag;
import cn.irisz.ahelo.mapper.TagMapper;
import cn.irisz.ahelo.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【blog_tag(博客标签表)】的数据库操作Service实现
* @createDate 2023-03-05 22:11:23
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}





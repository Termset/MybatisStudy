package org.example.dao;

import org.example.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //insert
    int addBlog(Blog blog);

    //query
    List<Blog> queryBlogIF(Map map);
}

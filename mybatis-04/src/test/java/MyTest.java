import org.apache.ibatis.session.SqlSession;
import org.example.dao.BlogMapper;
import org.example.pojo.Blog;
import org.example.utils.IDUtils;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addInitBlog(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getID());
        blog.setTitle("Abdaoj");
        blog.setAuthor("xtq");
        blog.setCreate_time(new Date());
        blog.setViews(999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getID());
        blog.setTitle("asdasd");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
//        map.put("title", "asdasd");
        map.put("author", "xtq");
        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
//        map.put("title", "asdasd");
        map.put("author", "xtq");
        List<Blog> blogs = mapper.queryBlogChoose(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "java学习线路");
        map.put("author", "xutianqi");
        map.put("id", "d778618115464dde93597137f7f0f6d4");

        mapper.updateBlog(map);
        sqlSession.close();
    }
}

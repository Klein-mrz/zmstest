package myBatis.study;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import myBatis.common.MyBatisHelper;
import myBatis.entity.Worker;
import myBatis.mapper.WorkerMapper;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class mainTest {
    public static void main(String[] args) {
        interceptorTest(args);
    }

    public static void interceptorTest(String[] args) {
        System.out.println("test begin----z interceptor");
        SqlSession session= MyBatisHelper.openSession(false);
        WorkerMapper workerMapper =session.getMapper(WorkerMapper.class);
        Page<Object> page= PageHelper.startPage(1, 5);
        System.out.println("当前页码："+page.getPageNum());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("每页的记录数："+page.getPageSize());
        System.out.println("总页码："+page.getPages());

        List<Worker> list=workerMapper.selectAll();
        System.out.println("select 条目数:"+list.size());
        PageInfo pageinfo=new PageInfo(list);

        System.out.println("pageinfo总条数："+pageinfo.getTotal());
        System.out.println("pageinfo每页的记录数："+pageinfo.getPageSize());
        System.out.println("pageinfo总页码："+pageinfo.getPageNum());
        System.out.println("pageinfo总页码："+pageinfo.getPages());

        for(Worker worker:list){
            System.out.println(worker.toString());
        }
        session.close();
        System.out.println("test end----z interceptor");
    }

    public static void workTest(String[] args) {
        SqlSession session= MyBatisHelper.openSession(false);
        WorkerMapper workerMapper= session.getMapper(WorkerMapper.class);
        List<Worker> list=workerMapper.selectAll();
        for(Worker worker:list){
            System.out.println(worker.toString());
        }
        session.close();
    }
}

package myBatis.impl;

import myBatis.common.MyBatisHelper;
import myBatis.entity.Worker;
import myBatis.mapper.WorkerMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class workerImpl {
    public static void main(String[] args) {
        SqlSession session= MyBatisHelper.openSession(false);
        WorkerMapper workerMapper= session.getMapper(WorkerMapper.class);
        List<Worker> list=workerMapper.selectAll();
        for(Worker worker:list){
            System.out.println(worker.toString());
        }
        session.close();
    }
}

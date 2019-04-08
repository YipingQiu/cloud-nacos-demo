package xyz.qiuyiping.nacos.cloudnacosdemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserEntiy, Integer> {

    @Query("select u from UserEntiy u")
    List<UserEntiy> list();
}

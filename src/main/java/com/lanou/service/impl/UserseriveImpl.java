package com.lanou.service.impl;

import com.lanou.pojo.User;
import com.lanou.service.Userserive;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
事务的特征(原子性（Atomicity）、一致性（Consistency）、隔离性（Isolation）、持久性（Durability）
):
1.原子性:事务是一个原子操作,由一系列动作组成.事务原子性确保动作要么全不起作用,要么全部不起作用
2.一致性:一旦事务完成,会确保业务处于一致状态,不会出现部分失败的情况
3.隔离性;如果多个事务处理相同数据,事务是隔离的,避免事务损坏
4.持久性:一旦事务完成,无论发生什么系统错误,事务的结果会被写入持久化存储器中
 */
//写在容器中
//出现异常时,回滚
@Transactional(rollbackFor = Exception.class)
@Service
public class UserseriveImpl implements Userserive {
    @Override
    public User Login(String username, String password) {
        return null;
    }
}

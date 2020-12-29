package com.springbot_elasticsearch.wf20201229.service;

import com.springbot_elasticsearch.wf20201229.bean.UserES;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 王飞
 * @Date: 2020/12/29/11:46
 * @Description:
 */

public interface UserService   extends ElasticsearchRepository<UserES, Long>{
}

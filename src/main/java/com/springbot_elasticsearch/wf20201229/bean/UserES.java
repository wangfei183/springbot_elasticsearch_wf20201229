package com.springbot_elasticsearch.wf20201229.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 王飞
 * @Date: 2020/12/29/11:16
 * @Description:
 */
//@Document(indexName = "user", _type = "docs", shards = 1, replicas = 0)
//@Document(indexName = "item", type = "docs", shards = 1, replicas = 0)
@Document(indexName = "item",  shards = 1, replicas = 0)
public class UserES {

    //主键自增长
    @Id
    private Long id;//主键

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String userName;
    private String userPhone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "UserES{" +
                "userId=" + id +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}

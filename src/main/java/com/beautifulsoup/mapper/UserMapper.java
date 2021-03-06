package com.beautifulsoup.mapper;

import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.bean.db.UserExample;
import com.beautifulsoup.bean.vo.UserCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
public interface UserMapper {
    User findUserByUsername(@Param("username") String username);

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    int getAllUsersCount();
    List<User> findAllUsers();
    List<User> listAllUsersByPage(Integer pageNum);

    List<UserCustom> findUserCustomsByUid(Integer uid);

    void deleteArticleByUserId(int uid);

}

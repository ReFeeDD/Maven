package org.Lesson6.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lesson6.db.model.Categories;
import org.lesson6.db.model.CategoriesExample;

public interface CategoriesMapper {

    long countByExample(CategoriesExample example);


    int deleteByExample(CategoriesExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Categories row);


    int insertSelective(Categories row);


    List<Categories> selectByExample(CategoriesExample example);


    Categories selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("row") Categories row, @Param("example") CategoriesExample example);


    int updateByExample(@Param("row") Categories row, @Param("example") CategoriesExample example);


    int updateByPrimaryKeySelective(Categories row);


    int updateByPrimaryKey(Categories row);
}


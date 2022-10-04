package org.Lesson6.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lesson6.db.model.Products;
import org.lesson6.db.model.ProductsExample;

public interface ProductsMapper {

    long countByExample(ProductsExample example);


    int deleteByExample(ProductsExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Products row);


    int insertSelective(Products row);


    List<Products> selectByExample(ProductsExample example);


    Products selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("row") Products row, @Param("example") ProductsExample example);


    int updateByExample(@Param("row") Products row, @Param("example") ProductsExample example);

    int updateByPrimaryKeySelective(Products row);


    int updateByPrimaryKey(Products row);
}


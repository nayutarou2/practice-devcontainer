package com.example.practice_devcontainer.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.practice_devcontainer.entity.TestEnitty;

@Mapper
public interface TestRepository {

    @Insert("INSERT INTO tests (name,created_at) VALUES (#{name},#{createdAt})")
    @Options(keyProperty = "id", useGeneratedKeys = true)
    void insert(TestEnitty testEnitty);

    @Select("SELECT * FROM tests")
    List<TestEnitty> selectAll();

    @Select("SELECT * FROM tests WHERE id = #{id}")
    TestEnitty selectById(Long id);

    @Update("UPDATE tests SET name = #{name},created_at = #{createdAt} WHERE id = #{id}")
    void update(TestEnitty testEnitty);

    @Delete("DELETE FROM tests WHERE id = #{id}")
    void delete(Long id);

}

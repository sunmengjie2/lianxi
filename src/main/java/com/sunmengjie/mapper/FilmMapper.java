package com.sunmengjie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sunmengjie.entity.Film;

public interface FilmMapper {

	@Select("SELECT * FROM film")
	List<Film> list();

	@Insert("insert into film values(null,#{name},#{direct},#{price},#{dataa},#{duration},#{type},#{timea},#{area},2)")
	void add(Film f);

	@Update("update film set state=#{state} where id=#{id}")
	void updSta(@Param("state")int state,@Param("id")int id);

}

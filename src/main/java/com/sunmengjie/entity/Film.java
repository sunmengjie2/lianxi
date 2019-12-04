package com.sunmengjie.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Film {

	private Integer id;
	@NotBlank(message = "影片名不能为空")
	private String name;
	@NotBlank(message = "导演不能为空")
	@Size(min = 2,message = "最少两个字符")
	private String direct;
	
	@NotNull(message = "票价不能为空")
	private Integer price;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "上映时间不能为空")
	private Date dataa;

	@NotNull(message = "时长不能为空")
	private Integer duration;
	@NotBlank(message = "类型不能为空")
	private String type;
	@NotBlank(message = "年代不能为空")
	private String timea;
	@NotBlank(message = "区域不能为空")
	private String area;
	private String state;
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Film(Integer id, @NotBlank(message = "影片名不能为空") String name,
			@NotBlank(message = "导演不能为空") @Size(min = 2, message = "最少两个字符") String direct,
			@NotNull(message = "票价不能为空") Integer price, @NotEmpty(message = "上映时间不能为空") Date dataa,
			@NotNull(message = "时长不能为空") Integer duration, @NotBlank(message = "类型不能为空") String type,
			@NotBlank(message = "年代不能为空") String timea, @NotBlank(message = "区域不能为空") String area, String state) {
		super();
		this.id = id;
		this.name = name;
		this.direct = direct;
		this.price = price;
		this.dataa = dataa;
		this.duration = duration;
		this.type = type;
		this.timea = timea;
		this.area = area;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirect() {
		return direct;
	}
	public void setDirect(String direct) {
		this.direct = direct;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getDataa() {
		return dataa;
	}
	public void setDataa(Date dataa) {
		this.dataa = dataa;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTimea() {
		return timea;
	}
	public void setTimea(String timea) {
		this.timea = timea;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", direct=" + direct + ", price=" + price + ", dataa=" + dataa
				+ ", duration=" + duration + ", type=" + type + ", timea=" + timea + ", area=" + area + ", state="
				+ state + "]";
	}
	
	
	
	
	
}

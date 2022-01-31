package com.devsuperior.movieflix.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;

public class MovieCardDTO implements Serializable {
	private static final long serialVersionUID = 1L;
    
	private Long id;
	private String title;
	private String subTitle;
	private Integer year;
	private String imgUrl;
	private List<Review> reviews = new ArrayList<>();
	
	public MovieCardDTO() {
		
	}
	
	public MovieCardDTO(Movie entity) {
		id = entity.getId();
		title = entity.getSubTitle();
		subTitle = entity.getSubTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		reviews = entity.getReviews();
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	
}

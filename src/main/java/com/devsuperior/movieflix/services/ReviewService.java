package com.devsuperior.movieflix.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.DTO.ReviewDTO;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class ReviewService  {

	@Autowired
	private ReviewRepository repository;
	
		
	@Transactional(readOnly = true)
	public ReviewDTO findById(Long id) {
		Optional<Review> obj = repository.findById(id);
		Review entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ReviewDTO(entity);
	}


	public List<ReviewDTO> findByMovie(Long movieId) {
		List<Review> list = repository.findByMoviesId(movieId);
		return list.stream().map(x -> new ReviewDTO(x)).collect(Collectors.toList());
		
	}

  	
	
}

package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.DTO.MovieCardDTO;
import com.devsuperior.movieflix.DTO.MovieDetailsDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService  {

	@Autowired
	private MovieRepository repository;
	
	
	@Transactional(readOnly = true)
	public MovieDetailsDTO findById(Long id) {
		Optional<Movie> obj = repository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new MovieDetailsDTO(entity);
	}
	/*
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}

	public List<GenreDTO> findByGenre(Long genreId, Pageable pageable) {
		Optional<Movie> list = repository.findById(genreId);
		return list.stream().map(x -> new GenreDTO(x)).collect(Collectors.toList());
		return null;
	}


/*
	public Page<MovieCardDTO> findByGenre(Long genreId, Pageable pageable) {
		List<Movie> list = repository.findByGenre(genreId, pageable);
		return list.map(x -> new MovieCardDTO(x).getReviews());
		
	}
*/


	public Page<MovieCardDTO> findByGenre(Long genreId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	  	
	
}

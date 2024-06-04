package mk.ukim.finki.wp.kol2023.g2.repository;

import mk.ukim.finki.wp.kol2023.g2.model.Genre;
import mk.ukim.finki.wp.kol2023.g2.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAllByRatingLessThanAndGenreIsLike(Double rating, Genre genre);
    List<Movie> findAllByRatingLessThan(Double rating);
    List<Movie> findAllByGenreIsLike(Genre genre);
}

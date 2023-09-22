package br.com.fiap.StartupOneFIAP.controller;

import br.com.fiap.StartupOneFIAP.model.Review;
import br.com.fiap.StartupOneFIAP.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/review")
public class ReviewResource {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping
    public List<Review> listReview() { return reviewRepository.findAll(); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Review registerReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }
    @DeleteMapping("{id}")
    public void deleteReview(@PathVariable int id) {
        reviewRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Review UpdateReview(@RequestBody Review review, @PathVariable int id) {
        review.setId(id);
        return reviewRepository.save(review);
    }
}

package com.examly.springapp.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.model.Review;
import com.examly.springapp.service.ReviewService;


@RestController
@RequestMapping("/user")
public class ReviewController{
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addreview")	 
	public String addUser(@RequestBody Review review)
	{
        try{
            reviewService.saveReview(review);
		    return "Review added sucessfully!!";
        }
        catch(Exception e){
            return "Please enter proper fields and details";
        }	
	}

    @GetMapping("/reviews")
	public List<Review> getReviews(){
		return this.reviewService.getReviews();
	}

    @GetMapping("/getReviewById/{id}")
    public Review getReviewById(@PathVariable("id") Long id){
        // try{
            return reviewService.getReviewById(id);
        // }
        // catch(Exception e){
        //     return "Enter valid id";
        // }
        
    }

    @PutMapping("/updateReviewById/{id}")
	public String update(@RequestBody Review review, @PathVariable Long id) {
        System.out.println(id);
        System.out.println(review.toString());
        try {
            Review present= reviewService.getReviewById(id);
            review.setId(id);            
            reviewService.saveReview(review);
			return "Successfully updated";
        } catch (NoSuchElementException e) {
            return "Please enter valid id";
        }
    }

    @DeleteMapping("/deleteReviewById/{id}")
    public String delete(@PathVariable Long id) {
        System.out.println(id);
		try{
			reviewService.deleteReview(id);
			return "Successfully deleted";
		}
		catch(Exception e){
			return "Please enter valid id";
		}
        
    }


}
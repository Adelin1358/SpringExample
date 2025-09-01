package com.pallidamors.springexample.mybatis.service;

import com.pallidamors.springexample.mybatis.domain.Review;
import com.pallidamors.springexample.mybatis.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    //전달 받은 id와 매칭되는 리뷰정보 받아오기
    public Review getReview(int id){

        //new_review 테이블의 id가 14인 행 조회
        Review review = reviewRepository.selectReview(id);
        return review;

    }
    //리뷰정보를 받고 , 리뷰를 추가하는 기능
    public int createReview(
            int storeId
            ,String menu
            ,String userName
            ,double point
            ,String review){

        // review 테이블에 한행을 저장하는 기능
        int count = reviewRepository.insertReview(storeId,menu,userName,point,review);
        return count;
    }

    //리뷰정보를 객체로 전달 받고 저장하는 기능
    public int createReviewByObject(Review review){

        //
        int count = reviewRepository.insertReviewByObject(review);
        return count;
    }

}

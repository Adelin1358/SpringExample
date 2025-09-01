package com.pallidamors.springexample.mybatis.repository;

import com.pallidamors.springexample.mybatis.domain.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReviewRepository {

    // 전달 받은 id와 일치하는 new_review 테이블의 행 조회
    public Review selectReview(@Param("id") int id);

    // review 테이블에 한행을 저장하는 기능
    public int insertReview(
            @Param("storeId")int storeId
            ,@Param("menu") String menu
            ,@Param("userName") String userName
            ,@Param("point") double point
            ,@Param("review") String review
    );

    //
    public int insertReviewByObject(Review review);

}

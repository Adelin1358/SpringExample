package com.pallidamors.springexample.mybatis;

import com.pallidamors.springexample.mybatis.domain.Review;
import com.pallidamors.springexample.mybatis.service.ReviewService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.Integer.parseInt;

@RequestMapping("/mybatis/review")
@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    //요청한 곳에서 전달 받은 id와 일치하는 리뷰 정보를 response에 json으로 담는 페이지
    @RequestMapping("")
    @ResponseBody
    public Review review(@RequestParam("id") int id) {



        //id가 14인 리뷰 정보 얻어오기
        Review review = reviewService.getReview(id);
        return review;
    }
    @ResponseBody
    @RequestMapping("/write")
    // 하나의 리뷰를 작성하는 기능
    public String writeReview(){
//        //4 , 치즈피자 , 김인규, 4.5 , 치즈피자 존맛!
//        int count = reviewService.createReview(4 , "치즈피자" , "김인규", 4.5 , "치즈피자 존맛!");

        //2, 뿌링클, 김인규 , 4.0, 역시 뿌링클은 진리!
        Review review = new Review();
        review.setStoreId(2);
        review.setMenu("뿌링클");
        review.setUserName("김인규");
        review.setPoint(4.0);
        review.setReview("역시 뿌링클은 진리!");

        int count = reviewService.createReviewByObject(review);

        return "실행결과"+count;

    }

}

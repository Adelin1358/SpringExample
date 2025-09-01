package com.pallidamors.springexample.database.service;

import com.pallidamors.springexample.database.domain.UsedGoods;
import com.pallidamors.springexample.database.repository.usedGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//부가적인 기능 수행
public class UsedGoodsService {

    //의존성 주입 - DI(dependency injection)
    //객체 생성을 Spring Framework에서 직접 관리(멤버변수)

    @Autowired
    private usedGoodsRepository usedGoodsRepository;

    //중고 거래 게시글 정보 얻어오기
    public List<UsedGoods> getUsedGoodsList() {

        //used_goods 테이블의 모든 행 조회(서비스 기능 아님)
        List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
        return usedGoodsList;
    }

}

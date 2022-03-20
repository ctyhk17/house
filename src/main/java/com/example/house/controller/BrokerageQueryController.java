package com.example.house.controller;

import com.example.house.constants.ActionType;
import com.example.house.policy.BrokeragePolicy;
import com.example.house.policy.BrokeragePolicyFactory;
import com.example.house.policy.PurchaseBrokeragePolicy;
import com.example.house.policy.RentBrokeragePolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

  @GetMapping("/api/calc/brokerage")
  public Long calcBrokerage(@RequestParam ActionType actionType,
                            @RequestParam Long price){
    //TODO: 중계수수료 계산하는 로직

    BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);

    return policy.calculate(price);
  }
}

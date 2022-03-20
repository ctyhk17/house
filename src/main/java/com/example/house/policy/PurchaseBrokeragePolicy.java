package com.example.house.policy;

import com.sun.corba.se.pept.broker.Broker;

/**
 *
 *
 *
 * 매매일때 중계수수료를 계산해주는 클래스
 */
public class PurchaseBrokeragePolicy implements BrokeragePolicy {

  @Override
  public BrokerageRule createBrokerageRule(Long price){
    BrokerageRule rule;
    if(price < 50_000_000){
      rule = new BrokerageRule(0.6, 250_000L);
    }else if(price < 200_000_000){
      rule = new BrokerageRule(0.5, 800_000L);
    }else if(price < 500_000_000){
      rule = new BrokerageRule(0.4, null);
    }else if(price < 900_000_000){
      rule = new BrokerageRule(0.5, null);
    }else{
      rule = new BrokerageRule(0.9, null);
    }

    return rule;
  }
}

package com.example.house.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

  INVALID_REQUEST("잘못된 요청입니다"),
  INTERVAL_ERROR("알수없는 에러가 발생했습니다."),
  ENTITY_NOT_FOUND("데이터를 찾을수 없습니다.");

  private String message;

  }

package com.apiece.coupon.support

class NotStartedException : RuntimeException("쿠폰 발급이 아직 시작되지 않았습니다.")

class SoldOutException : RuntimeException("쿠폰이 모두 소진되었습니다.")

class AlreadyIssuedException : RuntimeException("이미 발급받은 쿠폰입니다.")

class IssuanceNotFoundException : RuntimeException("쿠폰 발급 내역을 찾을 수 없습니다.")

class AlreadyUsedException : RuntimeException("이미 사용한 쿠폰입니다.")

class ExpiredException : RuntimeException("만료된 쿠폰입니다.")

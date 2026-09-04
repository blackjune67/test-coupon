package com.apiece.coupon.support

class CouponNotFoundException(message: String = "쿠폰 정보를 찾을 수 없습니다.") : RuntimeException(message) {

}

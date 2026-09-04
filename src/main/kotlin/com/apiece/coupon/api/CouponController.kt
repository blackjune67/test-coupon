package com.apiece.coupon.api

import com.apiece.coupon.api.dto.CouponResponse
import com.apiece.coupon.api.dto.CreateCouponRequest
import com.apiece.coupon.application.CouponService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class CouponController(
    private val couponService: CouponService,
) {

    @PostMapping("/coupon")
    fun create(
        @RequestBody request: CreateCouponRequest
    ): ResponseEntity<CouponResponse> {
        return ResponseEntity.status(201).body(CouponResponse.from(couponService.createCoupon(request)))
    }


    @PostMapping("/{couponId}/issue")
    fun issue(
        @PathVariable couponId: Long,
        @RequestHeader("X-User-Id") userId: Long,
    ): IssuanceResponse = IssuanceResponse.from(couponService.issue(couponId, userId))
}

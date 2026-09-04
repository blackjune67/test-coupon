package com.apiece.coupon.api.dto

import com.apiece.coupon.domain.Coupon
import java.io.Serializable
import java.time.LocalDateTime

/**
 * DTO for {@link com.apiece.coupon.domain.Coupon}
 */
class CouponResponse(
    val name: String? = null,
    val totalQuantity: Int? = null,
    val issuedQuantity: Int = 0,
    val validityDays: Int = 7,
    val startsAt: LocalDateTime? = null,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val id: Long? = null
) {
    companion object {
        fun from(coupon: Coupon): CouponResponse = CouponResponse(
            id = requireNotNull(coupon.id),
            name = coupon.name,
            totalQuantity = coupon.totalQuantity,
            issuedQuantity = coupon.issuedQuantity,
            validityDays = coupon.validityDays,
            startsAt = coupon.startsAt,
            createdAt = coupon.createdAt,
        )
    }
}
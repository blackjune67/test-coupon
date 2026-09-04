package com.apiece.coupon.api.dto

import java.io.Serializable
import java.time.LocalDateTime

/**
 * DTO for {@link com.apiece.coupon.domain.Coupon}
 */
class CreateCouponRequest(
    val name: String,
    val totalQuantity: Int = 5000,
    val validityDays: Int = 7,
    val startsAt: LocalDateTime? = null
) : Serializable
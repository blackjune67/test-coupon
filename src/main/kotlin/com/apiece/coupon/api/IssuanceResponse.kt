package com.apiece.coupon.api

import com.apiece.coupon.domain.Issuance
import com.apiece.coupon.domain.IssuanceStatus
import java.io.Serializable
import java.time.LocalDateTime

/**
 * DTO for {@link com.apiece.coupon.domain.Issuance}
 */
data class IssuanceResponse(
    val userId: Long? = null,
    val couponId: Long? = null,
    val status: IssuanceStatus = IssuanceStatus.ISSUED,
    val issuedAt: LocalDateTime? = null,
    val expiresAt: LocalDateTime? = null,
    val usedAt: LocalDateTime? = null,
    val id: Long? = null
) {
    companion object {
        fun from(issuance: Issuance): IssuanceResponse = IssuanceResponse(
            id = requireNotNull(issuance.id),
            userId = issuance.userId,
            couponId = issuance.couponId,
            status = issuance.status,
            issuedAt = issuance.issuedAt,
            expiresAt = issuance.expiresAt,
            usedAt = issuance.usedAt,
        )
    }
}
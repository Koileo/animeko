/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package me.him188.ani.datasources.bangumi.next.models


import kotlinx.serialization.Required
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param count 
 * @param rank 
 * @param score 
 * @param total 
 */
@Serializable

data class BangumiNextSubjectRating(

    @SerialName(value = "count") @Required val count: kotlin.collections.List<kotlin.Int>,

    @SerialName(value = "rank") @Required val rank: kotlin.Int,

    @SerialName(value = "score") @Required val score: @Serializable(me.him188.ani.utils.serialization.BigNumAsDoubleStringSerializer::class) me.him188.ani.utils.serialization.BigNum,

    @SerialName(value = "total") @Required val total: kotlin.Int

) {


}


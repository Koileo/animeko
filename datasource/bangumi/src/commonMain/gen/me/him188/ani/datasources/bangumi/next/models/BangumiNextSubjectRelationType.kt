/*
 * Copyright (C) 2024-2025 OpenAni and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license, which can be found at the following link.
 *
 * https://github.com/open-ani/ani/blob/main/LICENSE
 */

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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param cn
 * @param desc
 * @param en 
 * @param id 
 * @param jp 
 */
@Serializable

data class BangumiNextSubjectRelationType(

    @SerialName(value = "cn") @Required val cn: kotlin.String,

    @SerialName(value = "desc") @Required val desc: kotlin.String,

    @SerialName(value = "en") @Required val en: kotlin.String,

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "jp") @Required val jp: kotlin.String

) {


}


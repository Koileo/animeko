package me.him188.ani.datasources.bangumi.infrastructure

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializable(Base64ByteArray.Companion::class)
class Base64ByteArray(val value: ByteArray) {
    companion object : KSerializer<Base64ByteArray> {
        override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Base64ByteArray", PrimitiveKind.STRING)
        override fun serialize(encoder: Encoder, value: Base64ByteArray): Unit =
            encoder.encodeString(value.value.encodeBase64())

        override fun deserialize(decoder: Decoder): Base64ByteArray =
            Base64ByteArray(decoder.decodeString().decodeBase64Bytes())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Base64ByteArray
        return value.contentEquals(other.value)
    }

    override fun hashCode(): Int {
        return value.contentHashCode()
    }

    override fun toString(): String {
        return "Base64ByteArray(${hex(value)})"
    }
}

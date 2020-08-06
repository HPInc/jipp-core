// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "document-access" collection as defined in:
 * [IPPWG20180620](https://ftp.pwg.org/pub/pwg/ipp/registrations/ippwg-access-x509-certificate-obsolete-20180620.txt),
 * [PWG5100.18](https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DocumentAccess
constructor(
    var accessOauthToken: List<ByteArray>? = null,
    var accessOauthUri: java.net.URI? = null,
    var accessPassword: String? = null,
    var accessPin: String? = null,
    var accessUserName: String? = null
) : AttributeCollection {

    /** Construct an empty [DocumentAccess]. */
    constructor() : this(null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            accessOauthToken?.let { Types.accessOauthToken.of(it) },
            accessOauthUri?.let { Types.accessOauthUri.of(it) },
            accessPassword?.let { Types.accessPassword.of(it) },
            accessPin?.let { Types.accessPin.of(it) },
            accessUserName?.let { Types.accessUserName.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val accessOauthToken = OctetsType.Set("access-oauth-token")
        @JvmField val accessOauthUri = UriType("access-oauth-uri")
        @JvmField val accessPassword = TextType("access-password")
        @JvmField val accessPin = TextType("access-pin")
        @JvmField val accessUserName = TextType("access-user-name")
    }

    /** Defines types for each member of [DocumentAccess]. */
    companion object : AttributeCollection.Converter<DocumentAccess> {
        override fun convert(attributes: List<Attribute<*>>): DocumentAccess =
            DocumentAccess(
                extractAll(attributes, Types.accessOauthToken),
                extractOne(attributes, Types.accessOauthUri),
                extractOne(attributes, Types.accessPassword)?.value,
                extractOne(attributes, Types.accessPin)?.value,
                extractOne(attributes, Types.accessUserName)?.value
            )
    }
    override fun toString() = "DocumentAccess(${attributes.joinToString()})"
}

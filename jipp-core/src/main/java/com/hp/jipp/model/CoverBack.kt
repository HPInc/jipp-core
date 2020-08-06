// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "cover-back" collection as defined in:
 * [PWG5100.3](https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
@Suppress("RedundantCompanionReference", "unused")
data class CoverBack
constructor(
    /** May contain any keyword from [CoverType]. */
    var coverType: String? = null,
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null
) : AttributeCollection {

    /** Construct an empty [CoverBack]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            coverType?.let { Types.coverType.of(it) },
            media?.let { Types.media.of(it) },
            mediaCol?.let { Types.mediaCol.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val coverType = KeywordType("cover-type")
        @JvmField val media = KeywordOrNameType("media")
        @JvmField val mediaCol = AttributeCollection.Type("media-col", MediaCol)
    }

    /** Defines types for each member of [CoverBack]. */
    companion object : AttributeCollection.Converter<CoverBack> {
        override fun convert(attributes: List<Attribute<*>>): CoverBack =
            CoverBack(
                extractOne(attributes, Types.coverType),
                extractOne(attributes, Types.media),
                extractOne(attributes, Types.mediaCol)
            )
    }
    override fun toString() = "CoverBack(${attributes.joinToString()})"
}

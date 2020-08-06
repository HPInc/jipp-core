// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "proof-print" collection as defined in:
 * [PWG5100.11](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class ProofPrint
constructor(
    /** May contain any keyword from [Media] or a name. */
    var media: KeywordOrName? = null,
    var mediaCol: MediaCol? = null,
    var proofPrintCopies: Int? = null
) : AttributeCollection {

    /** Construct an empty [ProofPrint]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            media?.let { Types.media.of(it) },
            mediaCol?.let { Types.mediaCol.of(it) },
            proofPrintCopies?.let { Types.proofPrintCopies.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val media = KeywordOrNameType("media")
        @JvmField val mediaCol = AttributeCollection.Type("media-col", MediaCol)
        @JvmField val proofPrintCopies = IntType("proof-print-copies")
    }

    /** Defines types for each member of [ProofPrint]. */
    companion object : AttributeCollection.Converter<ProofPrint> {
        override fun convert(attributes: List<Attribute<*>>): ProofPrint =
            ProofPrint(
                extractOne(attributes, Types.media),
                extractOne(attributes, Types.mediaCol),
                extractOne(attributes, Types.proofPrintCopies)
            )
    }
    override fun toString() = "ProofPrint(${attributes.joinToString()})"
}

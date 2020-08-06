// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-col" collection as defined in:
 * [IPPLABEL](https://ftp.pwg.org/pub/pwg/ipp/registrations/reg-ipplabel10-20200213.pdf),
 * [PWG5100.7](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext20-20190816-5100.7.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MediaCol
constructor(
    /** May contain any keyword from [MediaBackCoating] or a name. */
    var mediaBackCoating: KeywordOrName? = null,
    var mediaBottomMargin: Int? = null,
    /** May contain any keyword from [MediaColor] or a name. */
    var mediaColor: KeywordOrName? = null,
    /** May contain any keyword from [MediaBackCoating] or a name. */
    var mediaFrontCoating: KeywordOrName? = null,
    /** May contain any keyword from [MediaGrain] or a name. */
    var mediaGrain: KeywordOrName? = null,
    var mediaHoleCount: Int? = null,
    var mediaInfo: String? = null,
    /** May contain any keyword from [Media] or a name. */
    var mediaKey: KeywordOrName? = null,
    var mediaLeftMargin: Int? = null,
    var mediaOrderCount: Int? = null,
    /** May contain any keyword from [MediaPrePrinted] or a name. */
    var mediaPrePrinted: KeywordOrName? = null,
    /** May contain any keyword from [MediaRecycled] or a name. */
    var mediaRecycled: KeywordOrName? = null,
    var mediaRightMargin: Int? = null,
    var mediaSize: MediaSize? = null,
    /** May contain any keyword from [Media] or a name. */
    var mediaSizeName: KeywordOrName? = null,
    /** May contain any keyword from [MediaSource] or a name. */
    var mediaSource: KeywordOrName? = null,
    var mediaSourceProperties: MediaSourceProperties? = null,
    var mediaThickness: Int? = null,
    /** May contain any keyword from [MediaTooth] or a name. */
    var mediaTooth: KeywordOrName? = null,
    var mediaTopMargin: Int? = null,
    var mediaTopOffset: Int? = null,
    /** May contain any keyword from [MediaTracking]. */
    var mediaTracking: String? = null,
    /** May contain any keyword from [MediaType] or a name. */
    var mediaType: KeywordOrName? = null,
    var mediaWeightMetric: Int? = null
) : AttributeCollection {

    /** Construct an empty [MediaCol]. */
    constructor() : this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            mediaBackCoating?.let { Types.mediaBackCoating.of(it) },
            mediaBottomMargin?.let { Types.mediaBottomMargin.of(it) },
            mediaColor?.let { Types.mediaColor.of(it) },
            mediaFrontCoating?.let { Types.mediaFrontCoating.of(it) },
            mediaGrain?.let { Types.mediaGrain.of(it) },
            mediaHoleCount?.let { Types.mediaHoleCount.of(it) },
            mediaInfo?.let { Types.mediaInfo.of(it) },
            mediaKey?.let { Types.mediaKey.of(it) },
            mediaLeftMargin?.let { Types.mediaLeftMargin.of(it) },
            mediaOrderCount?.let { Types.mediaOrderCount.of(it) },
            mediaPrePrinted?.let { Types.mediaPrePrinted.of(it) },
            mediaRecycled?.let { Types.mediaRecycled.of(it) },
            mediaRightMargin?.let { Types.mediaRightMargin.of(it) },
            mediaSize?.let { Types.mediaSize.of(it) },
            mediaSizeName?.let { Types.mediaSizeName.of(it) },
            mediaSource?.let { Types.mediaSource.of(it) },
            mediaSourceProperties?.let { Types.mediaSourceProperties.of(it) },
            mediaThickness?.let { Types.mediaThickness.of(it) },
            mediaTooth?.let { Types.mediaTooth.of(it) },
            mediaTopMargin?.let { Types.mediaTopMargin.of(it) },
            mediaTopOffset?.let { Types.mediaTopOffset.of(it) },
            mediaTracking?.let { Types.mediaTracking.of(it) },
            mediaType?.let { Types.mediaType.of(it) },
            mediaWeightMetric?.let { Types.mediaWeightMetric.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val mediaBackCoating = KeywordOrNameType("media-back-coating")
        @JvmField val mediaBottomMargin = IntType("media-bottom-margin")
        @JvmField val mediaColor = KeywordOrNameType("media-color")
        @JvmField val mediaFrontCoating = KeywordOrNameType("media-front-coating")
        @JvmField val mediaGrain = KeywordOrNameType("media-grain")
        @JvmField val mediaHoleCount = IntType("media-hole-count")
        @JvmField val mediaInfo = TextType("media-info")
        @JvmField val mediaKey = KeywordOrNameType("media-key")
        @JvmField val mediaLeftMargin = IntType("media-left-margin")
        @JvmField val mediaOrderCount = IntType("media-order-count")
        @JvmField val mediaPrePrinted = KeywordOrNameType("media-pre-printed")
        @JvmField val mediaRecycled = KeywordOrNameType("media-recycled")
        @JvmField val mediaRightMargin = IntType("media-right-margin")
        @JvmField val mediaSize = AttributeCollection.Type("media-size", MediaSize)
        @JvmField val mediaSizeName = KeywordOrNameType("media-size-name")
        @JvmField val mediaSource = KeywordOrNameType("media-source")
        @JvmField val mediaSourceProperties = AttributeCollection.Type("media-source-properties", MediaSourceProperties)
        @JvmField val mediaThickness = IntType("media-thickness")
        @JvmField val mediaTooth = KeywordOrNameType("media-tooth")
        @JvmField val mediaTopMargin = IntType("media-top-margin")
        @JvmField val mediaTopOffset = IntType("media-top-offset")
        @JvmField val mediaTracking = KeywordType("media-tracking")
        @JvmField val mediaType = KeywordOrNameType("media-type")
        @JvmField val mediaWeightMetric = IntType("media-weight-metric")
    }

    /** Defines types for each member of [MediaCol]. */
    companion object : AttributeCollection.Converter<MediaCol> {
        override fun convert(attributes: List<Attribute<*>>): MediaCol =
            MediaCol(
                extractOne(attributes, Types.mediaBackCoating),
                extractOne(attributes, Types.mediaBottomMargin),
                extractOne(attributes, Types.mediaColor),
                extractOne(attributes, Types.mediaFrontCoating),
                extractOne(attributes, Types.mediaGrain),
                extractOne(attributes, Types.mediaHoleCount),
                extractOne(attributes, Types.mediaInfo)?.value,
                extractOne(attributes, Types.mediaKey),
                extractOne(attributes, Types.mediaLeftMargin),
                extractOne(attributes, Types.mediaOrderCount),
                extractOne(attributes, Types.mediaPrePrinted),
                extractOne(attributes, Types.mediaRecycled),
                extractOne(attributes, Types.mediaRightMargin),
                extractOne(attributes, Types.mediaSize),
                extractOne(attributes, Types.mediaSizeName),
                extractOne(attributes, Types.mediaSource),
                extractOne(attributes, Types.mediaSourceProperties),
                extractOne(attributes, Types.mediaThickness),
                extractOne(attributes, Types.mediaTooth),
                extractOne(attributes, Types.mediaTopMargin),
                extractOne(attributes, Types.mediaTopOffset),
                extractOne(attributes, Types.mediaTracking),
                extractOne(attributes, Types.mediaType),
                extractOne(attributes, Types.mediaWeightMetric)
            )
    }

    /**
     * Data object corresponding to a "media-size" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSize
    constructor(
        var xDimension: Int? = null,
        var yDimension: Int? = null
    ) : AttributeCollection {

        /** Construct an empty [MediaSize]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                xDimension?.let { Types.xDimension.of(it) },
                yDimension?.let { Types.yDimension.of(it) }
            )
        }

        /** Types for each member attribute. */
        object Types {
            @JvmField val xDimension = IntType("x-dimension")
            @JvmField val yDimension = IntType("y-dimension")
        }

        /** Defines types for each member of [MediaSize]. */
        companion object : AttributeCollection.Converter<MediaSize> {
            override fun convert(attributes: List<Attribute<*>>): MediaSize =
                MediaSize(
                    extractOne(attributes, Types.xDimension),
                    extractOne(attributes, Types.yDimension)
                )
        }
        override fun toString() = "MediaSize(${attributes.joinToString()})"
    }

    /**
     * Data object corresponding to a "media-source-properties" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSourceProperties
    constructor(
        /** May contain any keyword from [FeedOrientation]. */
        var mediaSourceFeedDirection: String? = null,
        var mediaSourceFeedOrientation: Orientation? = null
    ) : AttributeCollection {

        /** Construct an empty [MediaSourceProperties]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                mediaSourceFeedDirection?.let { Types.mediaSourceFeedDirection.of(it) },
                mediaSourceFeedOrientation?.let { Types.mediaSourceFeedOrientation.of(it) }
            )
        }

        /** Types for each member attribute. */
        object Types {
            @JvmField val mediaSourceFeedDirection = KeywordType("media-source-feed-direction")
            /**
             * "media-source-feed-orientation" member type.
             */
            @JvmField val mediaSourceFeedOrientation = Orientation.Type("media-source-feed-orientation")
        }

        /** Defines types for each member of [MediaSourceProperties]. */
        companion object : AttributeCollection.Converter<MediaSourceProperties> {
            override fun convert(attributes: List<Attribute<*>>): MediaSourceProperties =
                MediaSourceProperties(
                    extractOne(attributes, Types.mediaSourceFeedDirection),
                    extractOne(attributes, Types.mediaSourceFeedOrientation)
                )
        }
        override fun toString() = "MediaSourceProperties(${attributes.joinToString()})"
    }
    override fun toString() = "MediaCol(${attributes.joinToString()})"
}

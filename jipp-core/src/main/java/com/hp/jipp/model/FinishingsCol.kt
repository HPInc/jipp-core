// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-09-17
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "finishings-col" collection as defined in:
 * [PWG5100.1](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf),
 * [PWG5100.3](https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class FinishingsCol
constructor(
    var baling: Baling? = null,
    var binding: Binding? = null,
    var coating: Coating? = null,
    var covering: Covering? = null,
    /** May contain any keyword from [FinishingTemplate] or a name. */
    var finishingTemplate: KeywordOrName? = null,
    var folding: List<Folding>? = null,
    /** May contain any keyword from [ImpositionTemplate] or a name. */
    var impositionTemplate: KeywordOrName? = null,
    var laminating: Laminating? = null,
    var mediaSheetsSupported: IntRange? = null,
    var mediaSize: MediaSize? = null,
    /** May contain any keyword from [Media]. */
    var mediaSizeName: String? = null,
    var punching: Punching? = null,
    var stitching: Stitching? = null,
    var trimming: List<Trimming>? = null
) : AttributeCollection {

    /** Construct an empty [FinishingsCol]. */
    constructor() : this(null, null, null, null, null, null, null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            baling?.let { Types.baling.of(it) },
            binding?.let { Types.binding.of(it) },
            coating?.let { Types.coating.of(it) },
            covering?.let { Types.covering.of(it) },
            finishingTemplate?.let { Types.finishingTemplate.of(it) },
            folding?.let { Types.folding.of(it) },
            impositionTemplate?.let { Types.impositionTemplate.of(it) },
            laminating?.let { Types.laminating.of(it) },
            mediaSheetsSupported?.let { Types.mediaSheetsSupported.of(it) },
            mediaSize?.let { Types.mediaSize.of(it) },
            mediaSizeName?.let { Types.mediaSizeName.of(it) },
            punching?.let { Types.punching.of(it) },
            stitching?.let { Types.stitching.of(it) },
            trimming?.let { Types.trimming.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<FinishingsCol>(FinishingsCol)

    /** All member names as strings. */
    object Name {
        /** "baling" member name */
        const val baling = "baling"
        /** "binding" member name */
        const val binding = "binding"
        /** "coating" member name */
        const val coating = "coating"
        /** "covering" member name */
        const val covering = "covering"
        /** "finishing-template" member name */
        const val finishingTemplate = "finishing-template"
        /** "folding" member name */
        const val folding = "folding"
        /** "imposition-template" member name */
        const val impositionTemplate = "imposition-template"
        /** "laminating" member name */
        const val laminating = "laminating"
        /** "media-sheets-supported" member name */
        const val mediaSheetsSupported = "media-sheets-supported"
        /** "media-size" member name */
        const val mediaSize = "media-size"
        /** "media-size-name" member name */
        const val mediaSizeName = "media-size-name"
        /** "punching" member name */
        const val punching = "punching"
        /** "stitching" member name */
        const val stitching = "stitching"
        /** "trimming" member name */
        const val trimming = "trimming"
    }

    /** Types for each member attribute. */
    object Types {
        val baling = Baling.Type(Name.baling)
        val binding = Binding.Type(Name.binding)
        val coating = Coating.Type(Name.coating)
        val covering = Covering.Type(Name.covering)
        val finishingTemplate = KeywordOrNameType(Name.finishingTemplate)
        val folding = Folding.Type(Name.folding)
        val impositionTemplate = KeywordOrNameType(Name.impositionTemplate)
        val laminating = Laminating.Type(Name.laminating)
        val mediaSheetsSupported = IntRangeType(Name.mediaSheetsSupported)
        val mediaSize = MediaSize.Type(Name.mediaSize)
        val mediaSizeName = KeywordType(Name.mediaSizeName)
        val punching = Punching.Type(Name.punching)
        val stitching = Stitching.Type(Name.stitching)
        val trimming = Trimming.Type(Name.trimming)
    }

    /** Defines types for each member of [FinishingsCol] */
    companion object : AttributeCollection.Converter<FinishingsCol> {
        override fun convert(attributes: List<Attribute<*>>): FinishingsCol =
            FinishingsCol(
                extractOne(attributes, Types.baling),
                extractOne(attributes, Types.binding),
                extractOne(attributes, Types.coating),
                extractOne(attributes, Types.covering),
                extractOne(attributes, Types.finishingTemplate),
                extractAll(attributes, Types.folding),
                extractOne(attributes, Types.impositionTemplate),
                extractOne(attributes, Types.laminating),
                extractOne(attributes, Types.mediaSheetsSupported),
                extractOne(attributes, Types.mediaSize),
                extractOne(attributes, Types.mediaSizeName),
                extractOne(attributes, Types.punching),
                extractOne(attributes, Types.stitching),
                extractAll(attributes, Types.trimming)
            )
    }

    /**
     * Data object corresponding to a "baling" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Baling
    constructor(
        /** May contain any keyword from [BalingType] or a name. */
        var balingType: KeywordOrName? = null,
        /** May contain any keyword from [BalingWhen]. */
        var balingWhen: String? = null
    ) : AttributeCollection {

        /** Construct an empty [Baling]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                balingType?.let { Types.balingType.of(it) },
                balingWhen?.let { Types.balingWhen.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Baling>(Baling)

        /** All member names as strings. */
        object Name {
            /** "baling-type" member name */
            const val balingType = "baling-type"
            /** "baling-when" member name */
            const val balingWhen = "baling-when"
        }

        /** Types for each member attribute. */
        object Types {
            val balingType = KeywordOrNameType(Name.balingType)
            val balingWhen = KeywordType(Name.balingWhen)
        }

        /** Defines types for each member of [Baling] */
        companion object : AttributeCollection.Converter<Baling> {
            override fun convert(attributes: List<Attribute<*>>): Baling =
                Baling(
                    extractOne(attributes, Types.balingType),
                    extractOne(attributes, Types.balingWhen)
                )
        }
    }

    /**
     * Data object corresponding to a "binding" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Binding
    constructor(
        /** May contain any keyword from [BindingReferenceEdge]. */
        var bindingReferenceEdge: String? = null,
        /** May contain any keyword from [BindingType] or a name. */
        var bindingType: KeywordOrName? = null
    ) : AttributeCollection {

        /** Construct an empty [Binding]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                bindingReferenceEdge?.let { Types.bindingReferenceEdge.of(it) },
                bindingType?.let { Types.bindingType.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Binding>(Binding)

        /** All member names as strings. */
        object Name {
            /** "binding-reference-edge" member name */
            const val bindingReferenceEdge = "binding-reference-edge"
            /** "binding-type" member name */
            const val bindingType = "binding-type"
        }

        /** Types for each member attribute. */
        object Types {
            val bindingReferenceEdge = KeywordType(Name.bindingReferenceEdge)
            val bindingType = KeywordOrNameType(Name.bindingType)
        }

        /** Defines types for each member of [Binding] */
        companion object : AttributeCollection.Converter<Binding> {
            override fun convert(attributes: List<Attribute<*>>): Binding =
                Binding(
                    extractOne(attributes, Types.bindingReferenceEdge),
                    extractOne(attributes, Types.bindingType)
                )
        }
    }

    /**
     * Data object corresponding to a "coating" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Coating
    constructor(
        /** May contain any keyword from [CoatingSides]. */
        var coatingSides: String? = null,
        /** May contain any keyword from [CoatingType] or a name. */
        var coatingType: KeywordOrName? = null
    ) : AttributeCollection {

        /** Construct an empty [Coating]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                coatingSides?.let { Types.coatingSides.of(it) },
                coatingType?.let { Types.coatingType.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Coating>(Coating)

        /** All member names as strings. */
        object Name {
            /** "coating-sides" member name */
            const val coatingSides = "coating-sides"
            /** "coating-type" member name */
            const val coatingType = "coating-type"
        }

        /** Types for each member attribute. */
        object Types {
            val coatingSides = KeywordType(Name.coatingSides)
            val coatingType = KeywordOrNameType(Name.coatingType)
        }

        /** Defines types for each member of [Coating] */
        companion object : AttributeCollection.Converter<Coating> {
            override fun convert(attributes: List<Attribute<*>>): Coating =
                Coating(
                    extractOne(attributes, Types.coatingSides),
                    extractOne(attributes, Types.coatingType)
                )
        }
    }

    /**
     * Data object corresponding to a "covering" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Covering
    constructor(
        /** May contain any keyword from [CoveringName] or a name. */
        var coveringName: KeywordOrName? = null
    ) : AttributeCollection {

        /** Construct an empty [Covering]. */
        constructor() : this(null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                coveringName?.let { Types.coveringName.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Covering>(Covering)

        /** All member names as strings. */
        object Name {
            /** "covering-name" member name */
            const val coveringName = "covering-name"
        }

        /** Types for each member attribute. */
        object Types {
            val coveringName = KeywordOrNameType(Name.coveringName)
        }

        /** Defines types for each member of [Covering] */
        companion object : AttributeCollection.Converter<Covering> {
            override fun convert(attributes: List<Attribute<*>>): Covering =
                Covering(
                    extractOne(attributes, Types.coveringName)
                )
        }
    }

    /**
     * Data object corresponding to a "folding" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Folding
    constructor(
        /** May contain any keyword from [FoldingDirection]. */
        var foldingDirection: String? = null,
        var foldingOffset: Int? = null,
        /** May contain any keyword from [FoldingReferenceEdge]. */
        var foldingReferenceEdge: String? = null
    ) : AttributeCollection {

        /** Construct an empty [Folding]. */
        constructor() : this(null, null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                foldingDirection?.let { Types.foldingDirection.of(it) },
                foldingOffset?.let { Types.foldingOffset.of(it) },
                foldingReferenceEdge?.let { Types.foldingReferenceEdge.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Folding>(Folding)

        /** All member names as strings. */
        object Name {
            /** "folding-direction" member name */
            const val foldingDirection = "folding-direction"
            /** "folding-offset" member name */
            const val foldingOffset = "folding-offset"
            /** "folding-reference-edge" member name */
            const val foldingReferenceEdge = "folding-reference-edge"
        }

        /** Types for each member attribute. */
        object Types {
            val foldingDirection = KeywordType(Name.foldingDirection)
            val foldingOffset = IntType(Name.foldingOffset)
            val foldingReferenceEdge = KeywordType(Name.foldingReferenceEdge)
        }

        /** Defines types for each member of [Folding] */
        companion object : AttributeCollection.Converter<Folding> {
            override fun convert(attributes: List<Attribute<*>>): Folding =
                Folding(
                    extractOne(attributes, Types.foldingDirection),
                    extractOne(attributes, Types.foldingOffset),
                    extractOne(attributes, Types.foldingReferenceEdge)
                )
        }
    }

    /**
     * Data object corresponding to a "laminating" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Laminating
    constructor(
        /** May contain any keyword from [LaminatingSides]. */
        var laminatingSides: String? = null,
        /** May contain any keyword from [LaminatingType] or a name. */
        var laminatingType: KeywordOrName? = null
    ) : AttributeCollection {

        /** Construct an empty [Laminating]. */
        constructor() : this(null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                laminatingSides?.let { Types.laminatingSides.of(it) },
                laminatingType?.let { Types.laminatingType.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Laminating>(Laminating)

        /** All member names as strings. */
        object Name {
            /** "laminating-sides" member name */
            const val laminatingSides = "laminating-sides"
            /** "laminating-type" member name */
            const val laminatingType = "laminating-type"
        }

        /** Types for each member attribute. */
        object Types {
            val laminatingSides = KeywordType(Name.laminatingSides)
            val laminatingType = KeywordOrNameType(Name.laminatingType)
        }

        /** Defines types for each member of [Laminating] */
        companion object : AttributeCollection.Converter<Laminating> {
            override fun convert(attributes: List<Attribute<*>>): Laminating =
                Laminating(
                    extractOne(attributes, Types.laminatingSides),
                    extractOne(attributes, Types.laminatingType)
                )
        }
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

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<MediaSize>(MediaSize)

        /** All member names as strings. */
        object Name {
            /** "x-dimension" member name */
            const val xDimension = "x-dimension"
            /** "y-dimension" member name */
            const val yDimension = "y-dimension"
        }

        /** Types for each member attribute. */
        object Types {
            val xDimension = IntType(Name.xDimension)
            val yDimension = IntType(Name.yDimension)
        }

        /** Defines types for each member of [MediaSize] */
        companion object : AttributeCollection.Converter<MediaSize> {
            override fun convert(attributes: List<Attribute<*>>): MediaSize =
                MediaSize(
                    extractOne(attributes, Types.xDimension),
                    extractOne(attributes, Types.yDimension)
                )
        }
    }

    /**
     * Data object corresponding to a "punching" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Punching
    constructor(
        var punchingLocations: List<Int>? = null,
        var punchingOffset: Int? = null,
        /** May contain any keyword from [PunchingReferenceEdge]. */
        var punchingReferenceEdge: String? = null
    ) : AttributeCollection {

        /** Construct an empty [Punching]. */
        constructor() : this(null, null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                punchingLocations?.let { Types.punchingLocations.of(it) },
                punchingOffset?.let { Types.punchingOffset.of(it) },
                punchingReferenceEdge?.let { Types.punchingReferenceEdge.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Punching>(Punching)

        /** All member names as strings. */
        object Name {
            /** "punching-locations" member name */
            const val punchingLocations = "punching-locations"
            /** "punching-offset" member name */
            const val punchingOffset = "punching-offset"
            /** "punching-reference-edge" member name */
            const val punchingReferenceEdge = "punching-reference-edge"
        }

        /** Types for each member attribute. */
        object Types {
            val punchingLocations = IntType(Name.punchingLocations)
            val punchingOffset = IntType(Name.punchingOffset)
            val punchingReferenceEdge = KeywordType(Name.punchingReferenceEdge)
        }

        /** Defines types for each member of [Punching] */
        companion object : AttributeCollection.Converter<Punching> {
            override fun convert(attributes: List<Attribute<*>>): Punching =
                Punching(
                    extractAll(attributes, Types.punchingLocations),
                    extractOne(attributes, Types.punchingOffset),
                    extractOne(attributes, Types.punchingReferenceEdge)
                )
        }
    }

    /**
     * Data object corresponding to a "stitching" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Stitching
    constructor(
        var stitchingAngle: Int? = null,
        var stitchingLocations: List<Int>? = null,
        /** May contain any keyword from [StitchingMethod]. */
        var stitchingMethod: String? = null,
        var stitchingOffset: Int? = null,
        /** May contain any keyword from [StitchingReferenceEdge]. */
        var stitchingReferenceEdge: String? = null
    ) : AttributeCollection {

        /** Construct an empty [Stitching]. */
        constructor() : this(null, null, null, null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                stitchingAngle?.let { Types.stitchingAngle.of(it) },
                stitchingLocations?.let { Types.stitchingLocations.of(it) },
                stitchingMethod?.let { Types.stitchingMethod.of(it) },
                stitchingOffset?.let { Types.stitchingOffset.of(it) },
                stitchingReferenceEdge?.let { Types.stitchingReferenceEdge.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Stitching>(Stitching)

        /** All member names as strings. */
        object Name {
            /** "stitching-angle" member name */
            const val stitchingAngle = "stitching-angle"
            /** "stitching-locations" member name */
            const val stitchingLocations = "stitching-locations"
            /** "stitching-method" member name */
            const val stitchingMethod = "stitching-method"
            /** "stitching-offset" member name */
            const val stitchingOffset = "stitching-offset"
            /** "stitching-reference-edge" member name */
            const val stitchingReferenceEdge = "stitching-reference-edge"
        }

        /** Types for each member attribute. */
        object Types {
            val stitchingAngle = IntType(Name.stitchingAngle)
            val stitchingLocations = IntType(Name.stitchingLocations)
            val stitchingMethod = KeywordType(Name.stitchingMethod)
            val stitchingOffset = IntType(Name.stitchingOffset)
            val stitchingReferenceEdge = KeywordType(Name.stitchingReferenceEdge)
        }

        /** Defines types for each member of [Stitching] */
        companion object : AttributeCollection.Converter<Stitching> {
            override fun convert(attributes: List<Attribute<*>>): Stitching =
                Stitching(
                    extractOne(attributes, Types.stitchingAngle),
                    extractAll(attributes, Types.stitchingLocations),
                    extractOne(attributes, Types.stitchingMethod),
                    extractOne(attributes, Types.stitchingOffset),
                    extractOne(attributes, Types.stitchingReferenceEdge)
                )
        }
    }

    /**
     * Data object corresponding to a "trimming" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class Trimming
    constructor(
        var trimmingOffset: Int? = null,
        /** May contain any keyword from [TrimmingReferenceEdge]. */
        var trimmingReferenceEdge: String? = null,
        /** May contain any keyword from [TrimmingType] or a name. */
        var trimmingType: KeywordOrName? = null,
        /** May contain any keyword from [TrimmingWhen]. */
        var trimmingWhen: String? = null
    ) : AttributeCollection {

        /** Construct an empty [Trimming]. */
        constructor() : this(null, null, null, null)

        /** Produce an attribute list from members. */
        override val attributes: List<Attribute<*>> by lazy {
            listOfNotNull(
                trimmingOffset?.let { Types.trimmingOffset.of(it) },
                trimmingReferenceEdge?.let { Types.trimmingReferenceEdge.of(it) },
                trimmingType?.let { Types.trimmingType.of(it) },
                trimmingWhen?.let { Types.trimmingWhen.of(it) }
            )
        }

        /** Type for attributes of this collection */
        class Type(override val name: String) : AttributeCollection.Type<Trimming>(Trimming)

        /** All member names as strings. */
        object Name {
            /** "trimming-offset" member name */
            const val trimmingOffset = "trimming-offset"
            /** "trimming-reference-edge" member name */
            const val trimmingReferenceEdge = "trimming-reference-edge"
            /** "trimming-type" member name */
            const val trimmingType = "trimming-type"
            /** "trimming-when" member name */
            const val trimmingWhen = "trimming-when"
        }

        /** Types for each member attribute. */
        object Types {
            val trimmingOffset = IntType(Name.trimmingOffset)
            val trimmingReferenceEdge = KeywordType(Name.trimmingReferenceEdge)
            val trimmingType = KeywordOrNameType(Name.trimmingType)
            val trimmingWhen = KeywordType(Name.trimmingWhen)
        }

        /** Defines types for each member of [Trimming] */
        companion object : AttributeCollection.Converter<Trimming> {
            override fun convert(attributes: List<Attribute<*>>): Trimming =
                Trimming(
                    extractOne(attributes, Types.trimmingOffset),
                    extractOne(attributes, Types.trimmingReferenceEdge),
                    extractOne(attributes, Types.trimmingType),
                    extractOne(attributes, Types.trimmingWhen)
                )
        }
    }
}

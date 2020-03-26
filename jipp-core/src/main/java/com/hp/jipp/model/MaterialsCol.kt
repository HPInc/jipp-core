// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "materials-col" collection as defined in:
 * [PWG5100.21](https://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d11-20190329-5100.21.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MaterialsCol
constructor(
    var materialAmount: Int? = null,
    /** May contain any keyword from [MaterialAmountUnit]. */
    var materialAmountUnits: String? = null,
    /** May contain any keyword from [MediaColor]. */
    var materialColor: String? = null,
    var materialDiameter: Int? = null,
    var materialDiameterTolerance: Int? = null,
    var materialFillDensity: Int? = null,
    var materialKey: String? = null,
    var materialName: String? = null,
    var materialNozzleDiameter: Int? = null,
    /** May contain any keyword from [MaterialPurpose]. */
    var materialPurpose: List<String>? = null,
    var materialRate: Int? = null,
    /** May contain any keyword from [MaterialRateUnit]. */
    var materialRateUnits: String? = null,
    var materialRetraction: Boolean? = null,
    var materialShellThickness: Int? = null,
    var materialTemperature: IntOrIntRange? = null,
    /** May contain any keyword from [MaterialType] or a name. */
    var materialType: KeywordOrName? = null
) : AttributeCollection {

    /** Construct an empty [MaterialsCol]. */
    constructor() : this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            materialAmount?.let { Types.materialAmount.of(it) },
            materialAmountUnits?.let { Types.materialAmountUnits.of(it) },
            materialColor?.let { Types.materialColor.of(it) },
            materialDiameter?.let { Types.materialDiameter.of(it) },
            materialDiameterTolerance?.let { Types.materialDiameterTolerance.of(it) },
            materialFillDensity?.let { Types.materialFillDensity.of(it) },
            materialKey?.let { Types.materialKey.of(it) },
            materialName?.let { Types.materialName.of(it) },
            materialNozzleDiameter?.let { Types.materialNozzleDiameter.of(it) },
            materialPurpose?.let { Types.materialPurpose.of(it) },
            materialRate?.let { Types.materialRate.of(it) },
            materialRateUnits?.let { Types.materialRateUnits.of(it) },
            materialRetraction?.let { Types.materialRetraction.of(it) },
            materialShellThickness?.let { Types.materialShellThickness.of(it) },
            materialTemperature?.let { Types.materialTemperature.of(it) },
            materialType?.let { Types.materialType.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<MaterialsCol>(MaterialsCol)

    /** All member names as strings. */
    object Name {
        /** "material-amount" member name */
        const val materialAmount = "material-amount"
        /** "material-amount-units" member name */
        const val materialAmountUnits = "material-amount-units"
        /** "material-color" member name */
        const val materialColor = "material-color"
        /** "material-diameter" member name */
        const val materialDiameter = "material-diameter"
        /** "material-diameter-tolerance" member name */
        const val materialDiameterTolerance = "material-diameter-tolerance"
        /** "material-fill-density" member name */
        const val materialFillDensity = "material-fill-density"
        /** "material-key" member name */
        const val materialKey = "material-key"
        /** "material-name" member name */
        const val materialName = "material-name"
        /** "material-nozzle-diameter" member name */
        const val materialNozzleDiameter = "material-nozzle-diameter"
        /** "material-purpose" member name */
        const val materialPurpose = "material-purpose"
        /** "material-rate" member name */
        const val materialRate = "material-rate"
        /** "material-rate-units" member name */
        const val materialRateUnits = "material-rate-units"
        /** "material-retraction" member name */
        const val materialRetraction = "material-retraction"
        /** "material-shell-thickness" member name */
        const val materialShellThickness = "material-shell-thickness"
        /** "material-temperature" member name */
        const val materialTemperature = "material-temperature"
        /** "material-type" member name */
        const val materialType = "material-type"
    }

    /** Types for each member attribute. */
    object Types {
        val materialAmount = IntType(Name.materialAmount)
        val materialAmountUnits = KeywordType(Name.materialAmountUnits)
        val materialColor = KeywordType(Name.materialColor)
        val materialDiameter = IntType(Name.materialDiameter)
        val materialDiameterTolerance = IntType(Name.materialDiameterTolerance)
        val materialFillDensity = IntType(Name.materialFillDensity)
        val materialKey = KeywordType(Name.materialKey)
        val materialName = NameType(Name.materialName)
        val materialNozzleDiameter = IntType(Name.materialNozzleDiameter)
        val materialPurpose = KeywordType(Name.materialPurpose)
        val materialRate = IntType(Name.materialRate)
        val materialRateUnits = KeywordType(Name.materialRateUnits)
        val materialRetraction = BooleanType(Name.materialRetraction)
        val materialShellThickness = IntType(Name.materialShellThickness)
        val materialTemperature = IntOrIntRangeType(Name.materialTemperature)
        val materialType = KeywordOrNameType(Name.materialType)
    }

    /** Defines types for each member of [MaterialsCol] */
    companion object : AttributeCollection.Converter<MaterialsCol> {
        override fun convert(attributes: List<Attribute<*>>): MaterialsCol =
            MaterialsCol(
                extractOne(attributes, Types.materialAmount),
                extractOne(attributes, Types.materialAmountUnits),
                extractOne(attributes, Types.materialColor),
                extractOne(attributes, Types.materialDiameter),
                extractOne(attributes, Types.materialDiameterTolerance),
                extractOne(attributes, Types.materialFillDensity),
                extractOne(attributes, Types.materialKey),
                extractOne(attributes, Types.materialName)?.value,
                extractOne(attributes, Types.materialNozzleDiameter),
                extractAll(attributes, Types.materialPurpose),
                extractOne(attributes, Types.materialRate),
                extractOne(attributes, Types.materialRateUnits),
                extractOne(attributes, Types.materialRetraction),
                extractOne(attributes, Types.materialShellThickness),
                extractOne(attributes, Types.materialTemperature),
                extractOne(attributes, Types.materialType)
            )
    }
}

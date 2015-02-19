
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExclusionRuleError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExclusionRuleError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLOCK_ALL_RULE_CANNOT_INCLUDE_ROOT_AD_UNIT"/>
 *     &lt;enumeration value="BLOCK_ALL_RULE_CANNOT_HAVE_BLOCKED_LABELS"/>
 *     &lt;enumeration value="BLOCK_ALL_RULE_MUST_CONTAIN_ALLOWED_LABELS"/>
 *     &lt;enumeration value="RULE_MUST_CONTAIN_BLOCKING"/>
 *     &lt;enumeration value="BLOCKED_LABEL_ALSO_ALLOWED"/>
 *     &lt;enumeration value="LABELS_MUST_BE_AD_EXCLUSION_TYPE"/>
 *     &lt;enumeration value="EXCLUDED_AD_UNIT_ALSO_INCLUDED"/>
 *     &lt;enumeration value="AD_UNITS_OVER_LIMIT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExclusionRuleError.Reason")
@XmlEnum
public enum AdExclusionRuleErrorReason {


    /**
     * 
     *                 The {@link AdExclusionRule#inventoryTargeting} cannot target the root ad unit if
     *                 {@link AdExclusionRule#isBlockAll} is true.
     *               
     * 
     */
    BLOCK_ALL_RULE_CANNOT_INCLUDE_ROOT_AD_UNIT,

    /**
     * 
     *                 The {@link AdExclusionRule#blockedLabelIds} must be empty if
     *                 {@link AdExclusionRule#isBlockAll} is true.
     *               
     * 
     */
    BLOCK_ALL_RULE_CANNOT_HAVE_BLOCKED_LABELS,

    /**
     * 
     *                 The {@link AdExclusionRule#allowedLabelIds} must contain allowed labels if
     *                 {@link AdExclusionRule#isBlockAll} is true.
     *               
     * 
     */
    BLOCK_ALL_RULE_MUST_CONTAIN_ALLOWED_LABELS,

    /**
     * 
     *                 The {@link AdExclusionRule} must contain blocking information.
     *               
     * 
     */
    RULE_MUST_CONTAIN_BLOCKING,

    /**
     * 
     *                 The same label ID cannot be contained in both {@link AdExclusionRule#allowedLabelIds} and
     *                 {@link AdExclusionRule#blockedLabelIds}.
     *               
     * 
     */
    BLOCKED_LABEL_ALSO_ALLOWED,

    /**
     * 
     *                 Label IDs included in {@link AdExclusionRule#allowedLabelIds} and
     *                 {@link AdExclusionRule#blockedLabelIds} must correspond to {@link Label} objects with type
     *                 {@link Label#AD_EXCLUSION}.
     *               
     * 
     */
    LABELS_MUST_BE_AD_EXCLUSION_TYPE,

    /**
     * 
     *                 The same ad unit cannot be included in both {@link InventoryTargeting#targetedAdUnits} and
     *                 {@link InventoryTargeting#excludedAdUnits} in {@link AdExclusionRule#inventoryTargeting}.
     *               
     * 
     */
    EXCLUDED_AD_UNIT_ALSO_INCLUDED,

    /**
     * 
     *                 Total number of ad units included in {@link AdExclusionRule#inventoryTargeting} is over the
     *                 allowed limit.
     *               
     * 
     */
    AD_UNITS_OVER_LIMIT,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdExclusionRuleErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

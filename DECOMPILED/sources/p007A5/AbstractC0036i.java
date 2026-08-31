package p007A5;

import com.anas_mugally.clipboard.R;

/* JADX INFO: renamed from: A5.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0036i {

    /* JADX INFO: renamed from: P */
    public static final int f215P = 0;

    /* JADX INFO: renamed from: Q */
    public static final int f217Q = 1;

    /* JADX INFO: renamed from: R */
    public static final int f218R = 2;

    /* JADX INFO: renamed from: S */
    public static final int f219S = 3;

    /* JADX INFO: renamed from: T */
    public static final int f220T = 4;

    /* JADX INFO: renamed from: a */
    public static final int[] f227a = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* JADX INFO: renamed from: b */
    public static final int[] f229b = {android.R.attr.layout_gravity};

    /* JADX INFO: renamed from: c */
    public static final int[] f231c = {android.R.attr.minWidth};

    /* JADX INFO: renamed from: d */
    public static final int[] f233d = new int[0];

    /* JADX INFO: renamed from: e */
    public static final int[] f235e = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* JADX INFO: renamed from: f */
    public static final int[] f237f = {R.attr.iconTint, R.attr.menu};

    /* JADX INFO: renamed from: g */
    public static final int[] f239g = {R.attr.expandActivityOverflowButtonDrawable, R.attr.initialActivityCount};

    /* JADX INFO: renamed from: h */
    public static final int[] f241h = {android.R.attr.layout, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* JADX INFO: renamed from: i */
    public static final int[] f243i = {android.R.attr.dither, android.R.attr.visible, android.R.attr.variablePadding, android.R.attr.constantSize, android.R.attr.enterFadeDuration, android.R.attr.exitFadeDuration};

    /* JADX INFO: renamed from: j */
    public static final int[] f245j = {android.R.attr.id, android.R.attr.drawable};

    /* JADX INFO: renamed from: k */
    public static final int[] f247k = {android.R.attr.drawable, android.R.attr.toId, android.R.attr.fromId, android.R.attr.reversible};

    /* JADX INFO: renamed from: l */
    public static final int[] f249l = new int[0];

    /* JADX INFO: renamed from: m */
    public static final int[] f251m = {android.R.attr.src, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};

    /* JADX INFO: renamed from: n */
    public static final int[] f253n = {android.R.attr.thumb, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* JADX INFO: renamed from: o */
    public static final int[] f255o = {android.R.attr.textAppearance, android.R.attr.drawableTop, android.R.attr.drawableBottom, android.R.attr.drawableLeft, android.R.attr.drawableRight, android.R.attr.drawableStart, android.R.attr.drawableEnd};

    /* JADX INFO: renamed from: p */
    public static final int[] f257p = {android.R.attr.textAppearance, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};

    /* JADX INFO: renamed from: q */
    public static final int[] f259q = {android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* JADX INFO: renamed from: r */
    public static final int[] f261r = {R.attr.allowStacking};

    /* JADX INFO: renamed from: s */
    public static final int[] f263s = {R.attr.queryPatterns, R.attr.shortcutMatchRequired};

    /* JADX INFO: renamed from: t */
    public static final int[] f265t = {android.R.attr.minWidth, android.R.attr.minHeight, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* JADX INFO: renamed from: u */
    public static final int[] f267u = {R.attr.carousel_alignment, R.attr.carousel_backwardTransition, R.attr.carousel_emptyViewsBehavior, R.attr.carousel_firstView, R.attr.carousel_forwardTransition, R.attr.carousel_infinite, R.attr.carousel_nextState, R.attr.carousel_previousState, R.attr.carousel_touchUpMode, R.attr.carousel_touchUp_dampeningFactor, R.attr.carousel_touchUp_velocityThreshold};

    /* JADX INFO: renamed from: v */
    public static final int[] f269v = {android.R.attr.checkMark, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};

    /* JADX INFO: renamed from: w */
    public static final int[] f271w = {android.R.attr.color, android.R.attr.alpha, android.R.attr.lStar, R.attr.alpha, R.attr.lStar};

    /* JADX INFO: renamed from: x */
    public static final int[] f273x = {android.R.attr.button, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};

    /* JADX INFO: renamed from: y */
    public static final int[] f275y = {android.R.attr.orientation, android.R.attr.id, android.R.attr.visibility, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_marginLeft, android.R.attr.layout_marginTop, android.R.attr.layout_marginRight, android.R.attr.layout_marginBottom, android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.minWidth, android.R.attr.minHeight, android.R.attr.alpha, android.R.attr.transformPivotX, android.R.attr.transformPivotY, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.layout_marginStart, android.R.attr.layout_marginEnd, android.R.attr.translationZ, android.R.attr.elevation, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* JADX INFO: renamed from: z */
    public static final int[] f277z = {android.R.attr.orientation, android.R.attr.padding, android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom, android.R.attr.visibility, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_margin, android.R.attr.layout_marginLeft, android.R.attr.layout_marginTop, android.R.attr.layout_marginRight, android.R.attr.layout_marginBottom, android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.minWidth, android.R.attr.minHeight, android.R.attr.paddingStart, android.R.attr.paddingEnd, android.R.attr.layout_marginStart, android.R.attr.layout_marginEnd, android.R.attr.elevation, android.R.attr.layout_marginHorizontal, android.R.attr.layout_marginVertical, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};

    /* JADX INFO: renamed from: A */
    public static final int[] f185A = {R.attr.reactiveGuide_animateChange, R.attr.reactiveGuide_applyToAllConstraintSets, R.attr.reactiveGuide_applyToConstraintSet, R.attr.reactiveGuide_valueId};

    /* JADX INFO: renamed from: B */
    public static final int[] f187B = {R.attr.content, R.attr.placeholder_emptyVisibility};

    /* JADX INFO: renamed from: C */
    public static final int[] f189C = {android.R.attr.orientation, android.R.attr.id, android.R.attr.visibility, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_marginLeft, android.R.attr.layout_marginTop, android.R.attr.layout_marginRight, android.R.attr.layout_marginBottom, android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.minWidth, android.R.attr.minHeight, android.R.attr.alpha, android.R.attr.transformPivotX, android.R.attr.transformPivotY, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.layout_marginStart, android.R.attr.layout_marginEnd, android.R.attr.translationZ, android.R.attr.elevation, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* JADX INFO: renamed from: D */
    public static final int[] f191D = {android.R.attr.orientation, android.R.attr.id, android.R.attr.visibility, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_marginLeft, android.R.attr.layout_marginTop, android.R.attr.layout_marginRight, android.R.attr.layout_marginBottom, android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.minWidth, android.R.attr.minHeight, android.R.attr.pivotX, android.R.attr.pivotY, android.R.attr.alpha, android.R.attr.transformPivotX, android.R.attr.transformPivotY, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.layout_marginStart, android.R.attr.layout_marginEnd, android.R.attr.translationZ, android.R.attr.elevation, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.stateLabels, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* JADX INFO: renamed from: E */
    public static final int[] f193E = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};

    /* JADX INFO: renamed from: F */
    public static final int[] f195F = {R.attr.arrowHeadLength, R.attr.arrowShaftLength, R.attr.barLength, R.attr.color, R.attr.drawableSize, R.attr.gapBetweenBars, R.attr.spinBars, R.attr.thickness};

    /* JADX INFO: renamed from: G */
    public static final int[] f197G = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFallbackQuery, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};

    /* JADX INFO: renamed from: H */
    public static final int[] f199H = {android.R.attr.font, android.R.attr.fontWeight, android.R.attr.fontStyle, android.R.attr.ttcIndex, android.R.attr.fontVariationSettings, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};

    /* JADX INFO: renamed from: I */
    public static final int[] f201I = {android.R.attr.name, android.R.attr.id, android.R.attr.tag};

    /* JADX INFO: renamed from: J */
    public static final int[] f203J = {android.R.attr.name, android.R.attr.tag};

    /* JADX INFO: renamed from: K */
    public static final int[] f205K = {android.R.attr.startColor, android.R.attr.endColor, android.R.attr.type, android.R.attr.centerX, android.R.attr.centerY, android.R.attr.gradientRadius, android.R.attr.tileMode, android.R.attr.centerColor, android.R.attr.startX, android.R.attr.startY, android.R.attr.endX, android.R.attr.endY};

    /* JADX INFO: renamed from: L */
    public static final int[] f207L = {android.R.attr.color, android.R.attr.offset};

    /* JADX INFO: renamed from: M */
    public static final int[] f209M = {R.attr.grid_columnWeights, R.attr.grid_columns, R.attr.grid_horizontalGaps, R.attr.grid_orientation, R.attr.grid_rowWeights, R.attr.grid_rows, R.attr.grid_skips, R.attr.grid_spans, R.attr.grid_useRtl, R.attr.grid_validateInputs, R.attr.grid_verticalGaps};

    /* JADX INFO: renamed from: N */
    public static final int[] f211N = {R.attr.altSrc, R.attr.blendSrc, R.attr.brightness, R.attr.contrast, R.attr.crossfade, R.attr.imagePanX, R.attr.imagePanY, R.attr.imageRotate, R.attr.imageZoom, R.attr.overlay, R.attr.round, R.attr.roundPercent, R.attr.saturation, R.attr.warmth};

    /* JADX INFO: renamed from: O */
    public static final int[] f213O = {R.attr.animationDuration, R.attr.currentPageIndicatorColor, R.attr.dotDiameter, R.attr.dotGap, R.attr.pageIndicatorColor};

    /* JADX INFO: renamed from: U */
    public static final int[] f221U = {android.R.attr.alpha, android.R.attr.transformPivotX, android.R.attr.transformPivotY, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.translationZ, android.R.attr.elevation, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* JADX INFO: renamed from: V */
    public static final int[] f222V = {android.R.attr.alpha, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.translationZ, android.R.attr.elevation, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveOffset, R.attr.wavePeriod, R.attr.wavePhase, R.attr.waveShape, R.attr.waveVariesBy};

    /* JADX INFO: renamed from: W */
    public static final int[] f223W = new int[0];

    /* JADX INFO: renamed from: X */
    public static final int[] f224X = new int[0];

    /* JADX INFO: renamed from: Y */
    public static final int[] f225Y = new int[0];

    /* JADX INFO: renamed from: Z */
    public static final int[] f226Z = {R.attr.curveFit, R.attr.drawPath, R.attr.framePosition, R.attr.keyPositionType, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.percentHeight, R.attr.percentWidth, R.attr.percentX, R.attr.percentY, R.attr.sizePercent, R.attr.transitionEasing};

    /* JADX INFO: renamed from: a0 */
    public static final int[] f228a0 = {android.R.attr.alpha, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.translationZ, android.R.attr.elevation, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveDecay, R.attr.waveOffset, R.attr.wavePeriod, R.attr.wavePhase, R.attr.waveShape};

    /* JADX INFO: renamed from: b0 */
    public static final int[] f230b0 = {R.attr.framePosition, R.attr.motionTarget, R.attr.motion_postLayoutCollision, R.attr.motion_triggerOnCollision, R.attr.onCross, R.attr.onNegativeCross, R.attr.onPositiveCross, R.attr.triggerId, R.attr.triggerReceiver, R.attr.triggerSlack, R.attr.viewTransitionOnCross, R.attr.viewTransitionOnNegativeCross, R.attr.viewTransitionOnPositiveCross};

    /* JADX INFO: renamed from: c0 */
    public static final int[] f232c0 = {android.R.attr.orientation, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_marginLeft, android.R.attr.layout_marginTop, android.R.attr.layout_marginRight, android.R.attr.layout_marginBottom, android.R.attr.layout_marginStart, android.R.attr.layout_marginEnd, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* JADX INFO: renamed from: d0 */
    public static final int[] f234d0 = {android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};

    /* JADX INFO: renamed from: e0 */
    public static final int[] f236e0 = {android.R.attr.layout_gravity, android.R.attr.layout_width, android.R.attr.layout_height, android.R.attr.layout_weight};

    /* JADX INFO: renamed from: f0 */
    public static final int[] f238f0 = {android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};

    /* JADX INFO: renamed from: g0 */
    public static final int[] f240g0 = {android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};

    /* JADX INFO: renamed from: h0 */
    public static final int[] f242h0 = {android.R.attr.icon, android.R.attr.enabled, android.R.attr.id, android.R.attr.checked, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.title, android.R.attr.titleCondensed, android.R.attr.alphabeticShortcut, android.R.attr.numericShortcut, android.R.attr.checkable, android.R.attr.onClick, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};

    /* JADX INFO: renamed from: i0 */
    public static final int[] f244i0 = {android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, R.attr.preserveIconSpacing, R.attr.subMenuArrow};

    /* JADX INFO: renamed from: j0 */
    public static final int[] f246j0 = {R.attr.mock_diagonalsColor, R.attr.mock_label, R.attr.mock_labelBackgroundColor, R.attr.mock_labelColor, R.attr.mock_showDiagonals, R.attr.mock_showLabel};

    /* JADX INFO: renamed from: k0 */
    public static final int[] f248k0 = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};

    /* JADX INFO: renamed from: l0 */
    public static final int[] f250l0 = {R.attr.motionEffect_alpha, R.attr.motionEffect_end, R.attr.motionEffect_move, R.attr.motionEffect_start, R.attr.motionEffect_strict, R.attr.motionEffect_translationX, R.attr.motionEffect_translationY, R.attr.motionEffect_viewTransition};

    /* JADX INFO: renamed from: m0 */
    public static final int[] f252m0 = {R.attr.onHide, R.attr.onShow};

    /* JADX INFO: renamed from: n0 */
    public static final int[] f254n0 = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.gravity, android.R.attr.text, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.autoSizeTextType, R.attr.borderRound, R.attr.borderRoundPercent, R.attr.scaleFromTextSize, R.attr.textBackground, R.attr.textBackgroundPanX, R.attr.textBackgroundPanY, R.attr.textBackgroundRotate, R.attr.textBackgroundZoom, R.attr.textOutlineColor, R.attr.textOutlineThickness, R.attr.textPanX, R.attr.textPanY, R.attr.textureBlurFactor, R.attr.textureEffect, R.attr.textureHeight, R.attr.textureWidth};

    /* JADX INFO: renamed from: o0 */
    public static final int[] f256o0 = {R.attr.applyMotionScene, R.attr.currentState, R.attr.layoutDescription, R.attr.motionDebug, R.attr.motionProgress, R.attr.showPaths};

    /* JADX INFO: renamed from: p0 */
    public static final int[] f258p0 = {R.attr.defaultDuration, R.attr.layoutDuringTransition};

    /* JADX INFO: renamed from: q0 */
    public static final int[] f260q0 = {R.attr.telltales_tailColor, R.attr.telltales_tailScale, R.attr.telltales_velocityMode};

    /* JADX INFO: renamed from: r0 */
    public static final int[] f262r0 = {R.attr.clickAction, R.attr.targetId};

    /* JADX INFO: renamed from: s0 */
    public static final int[] f264s0 = {R.attr.autoCompleteMode, R.attr.dragDirection, R.attr.dragScale, R.attr.dragThreshold, R.attr.limitBoundsTo, R.attr.maxAcceleration, R.attr.maxVelocity, R.attr.moveWhenScrollAtTop, R.attr.nestedScrollFlags, R.attr.onTouchUp, R.attr.rotationCenterId, R.attr.springBoundary, R.attr.springDamping, R.attr.springMass, R.attr.springStiffness, R.attr.springStopThreshold, R.attr.touchAnchorId, R.attr.touchAnchorSide, R.attr.touchRegionId};

    /* JADX INFO: renamed from: t0 */
    public static final int[] f266t0 = {R.attr.layout_parallaxFactor};

    /* JADX INFO: renamed from: u0 */
    public static final int[] f268u0 = {android.R.attr.popupBackground, android.R.attr.popupAnimationStyle, R.attr.overlapAnchor};

    /* JADX INFO: renamed from: v0 */
    public static final int[] f270v0 = {R.attr.state_above_anchor};

    /* JADX INFO: renamed from: w0 */
    public static final int[] f272w0 = {android.R.attr.visibility, android.R.attr.alpha, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* JADX INFO: renamed from: x0 */
    public static final int[] f274x0 = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};

    /* JADX INFO: renamed from: y0 */
    public static final int[] f276y0 = {android.R.attr.textAppearance, android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.text, android.R.attr.hint, android.R.attr.inputType, android.R.attr.imeOptions, R.attr.animateMenuItems, R.attr.animateNavigationIcon, R.attr.autoShowKeyboard, R.attr.backHandlingEnabled, R.attr.backgroundTint, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.headerLayout, R.attr.hideNavigationIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.searchPrefixText, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.useDrawerArrowDrawable, R.attr.voiceIcon};

    /* JADX INFO: renamed from: z0 */
    public static final int[] f278z0 = {android.R.attr.entries, android.R.attr.popupBackground, android.R.attr.prompt, android.R.attr.dropDownWidth, R.attr.popupTheme};

    /* JADX INFO: renamed from: A0 */
    public static final int[] f186A0 = {android.R.attr.id, R.attr.constraints};

    /* JADX INFO: renamed from: B0 */
    public static final int[] f188B0 = {android.R.attr.dither, android.R.attr.visible, android.R.attr.variablePadding, android.R.attr.constantSize, android.R.attr.enterFadeDuration, android.R.attr.exitFadeDuration};

    /* JADX INFO: renamed from: C0 */
    public static final int[] f190C0 = {android.R.attr.drawable};

    /* JADX INFO: renamed from: D0 */
    public static final int[] f192D0 = {R.attr.defaultState};

    /* JADX INFO: renamed from: E0 */
    public static final int[] f194E0 = {android.R.attr.textOn, android.R.attr.textOff, android.R.attr.thumb, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};

    /* JADX INFO: renamed from: F0 */
    public static final int[] f196F0 = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* JADX INFO: renamed from: G0 */
    public static final int[] f198G0 = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.text, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, R.attr.borderRound, R.attr.borderRoundPercent, R.attr.textFillColor, R.attr.textOutlineColor, R.attr.textOutlineThickness};

    /* JADX INFO: renamed from: H0 */
    public static final int[] f200H0 = {android.R.attr.gravity, android.R.attr.minHeight, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};

    /* JADX INFO: renamed from: I0 */
    public static final int[] f202I0 = {android.R.attr.transformPivotX, android.R.attr.transformPivotY, android.R.attr.translationX, android.R.attr.translationY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.rotationX, android.R.attr.rotationY, android.R.attr.translationZ, android.R.attr.elevation, R.attr.transformPivotTarget};

    /* JADX INFO: renamed from: J0 */
    public static final int[] f204J0 = {android.R.attr.id, R.attr.autoTransition, R.attr.constraintSetEnd, R.attr.constraintSetStart, R.attr.duration, R.attr.layoutDuringTransition, R.attr.motionInterpolator, R.attr.pathMotionArc, R.attr.staggered, R.attr.transitionDisable, R.attr.transitionFlags};

    /* JADX INFO: renamed from: K0 */
    public static final int[] f206K0 = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* JADX INFO: renamed from: L0 */
    public static final int[] f208L0 = {android.R.attr.theme, android.R.attr.focusable, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};

    /* JADX INFO: renamed from: M0 */
    public static final int[] f210M0 = {android.R.attr.background, R.attr.backgroundTint, R.attr.backgroundTintMode};

    /* JADX INFO: renamed from: N0 */
    public static final int[] f212N0 = {android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};

    /* JADX INFO: renamed from: O0 */
    public static final int[] f214O0 = {android.R.attr.id, R.attr.SharedValue, R.attr.SharedValueId, R.attr.clearsTag, R.attr.duration, R.attr.ifTagNotSet, R.attr.ifTagSet, R.attr.motionInterpolator, R.attr.motionTarget, R.attr.onStateTransition, R.attr.pathMotionArc, R.attr.setsTag, R.attr.transitionDisable, R.attr.upDuration, R.attr.viewTransitionMode};

    /* JADX INFO: renamed from: P0 */
    public static final int[] f216P0 = {R.attr.constraintSet};
}

package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p325p3.AbstractC6742c;

/* JADX INFO: loaded from: classes2.dex */
public class Slider extends AbstractC4584g {
    public Slider(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    /* JADX INFO: renamed from: F0 */
    protected boolean mo21086F0() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    /* JADX INFO: renamed from: J0 */
    public /* bridge */ /* synthetic */ void mo21087J0() {
        super.mo21087J0();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ boolean mo21088c0() {
        return super.mo21088c0();
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    /* JADX INFO: renamed from: g0 */
    public /* bridge */ /* synthetic */ boolean mo21089g0() {
        return super.mo21089g0();
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        return super.getThumbHeight();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        return super.getThumbTrackGapSize();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        return super.getThumbWidth();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTickVisibilityMode() {
        return super.getTickVisibilityMode();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackCornerSize() {
        return super.getTrackCornerSize();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTrackIconActiveColor() {
        return super.getTrackIconActiveColor();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ Drawable getTrackIconActiveEnd() {
        return super.getTrackIconActiveEnd();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ Drawable getTrackIconActiveStart() {
        return super.getTrackIconActiveStart();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTrackIconInactiveColor() {
        return super.getTrackIconInactiveColor();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ Drawable getTrackIconInactiveEnd() {
        return super.getTrackIconInactiveEnd();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ Drawable getTrackIconInactiveStart() {
        return super.getTrackIconInactiveStart();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackIconSize() {
        return super.getTrackIconSize();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        return super.getTrackInsideCornerSize();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        return super.getTrackStopIndicatorSize();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo21090m(InterfaceC4578a interfaceC4578a) {
        super.mo21090m(interfaceC4578a);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i7, KeyEvent keyEvent) {
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ void onVisibilityAggregated(boolean z7) {
        super.onVisibilityAggregated(z7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    /* JADX INFO: renamed from: s0 */
    public /* bridge */ /* synthetic */ boolean mo21091s0() {
        return super.mo21091s0();
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setCentered(boolean z7) {
        super.setCentered(z7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public void setCustomThumbDrawable(int i7) {
        super.setCustomThumbDrawable(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z7) {
        super.setEnabled(z7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i7) {
        super.setFocusedThumbIndex(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setHaloRadius(int i7) {
        super.setHaloRadius(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int i7) {
        super.setHaloRadiusResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i7) {
        super.setLabelBehavior(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setLabelFormatter(InterfaceC4585h interfaceC4585h) {
        super.setLabelFormatter(interfaceC4585h);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setOrientation(int i7) {
        super.setOrientation(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setStepSize(float f7) {
        super.setStepSize(f7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbElevation(float f7) {
        super.setThumbElevation(f7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbElevationResource(int i7) {
        super.setThumbElevationResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbHeight(int i7) {
        super.setThumbHeight(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbHeightResource(int i7) {
        super.setThumbHeightResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbRadius(int i7) {
        super.setThumbRadius(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int i7) {
        super.setThumbRadiusResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int i7) {
        super.setThumbStrokeColorResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f7) {
        super.setThumbStrokeWidth(f7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int i7) {
        super.setThumbStrokeWidthResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i7) {
        super.setThumbTrackGapSize(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbWidth(int i7) {
        super.setThumbWidth(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setThumbWidthResource(int i7) {
        super.setThumbWidthResource(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i7) {
        super.setTickActiveRadius(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i7) {
        super.setTickInactiveRadius(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTickTintList(ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTickVisibilityMode(int i7) {
        super.setTickVisibilityMode(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    @Deprecated
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z7) {
        super.setTickVisible(z7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackCornerSize(int i7) {
        super.setTrackCornerSize(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackHeight(int i7) {
        super.setTrackHeight(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconActiveColor(ColorStateList colorStateList) {
        super.setTrackIconActiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(int i7) {
        super.setTrackIconActiveEnd(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(int i7) {
        super.setTrackIconActiveStart(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconInactiveColor(ColorStateList colorStateList) {
        super.setTrackIconInactiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(int i7) {
        super.setTrackIconInactiveEnd(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(int i7) {
        super.setTrackIconInactiveStart(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconSize(int i7) {
        super.setTrackIconSize(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int i7) {
        super.setTrackInsideCornerSize(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int i7) {
        super.setTrackStopIndicatorSize(i7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackTintList(ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public void setValue(float f7) {
        setValues(Float.valueOf(f7));
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setValueFrom(float f7) {
        super.setValueFrom(f7);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setValueTo(float f7) {
        super.setValueTo(f7);
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26243a0);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(Drawable drawable) {
        super.setTrackIconActiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(Drawable drawable) {
        super.setTrackIconActiveStart(drawable);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(Drawable drawable) {
        super.setTrackIconInactiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.AbstractC4584g
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(Drawable drawable) {
        super.setTrackIconInactiveStart(drawable);
    }

    public Slider(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

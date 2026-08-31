package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.appcompat.widget.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C2360j0 extends AbstractC2337W {

    /* JADX INFO: renamed from: c */
    private static boolean f8281c = false;

    /* JADX INFO: renamed from: b */
    private final WeakReference f8282b;

    public C2360j0(Context context, Resources resources) {
        super(resources);
        this.f8282b = new WeakReference(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10104b() {
        return f8281c;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10105c() {
        m10104b();
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i7) {
        return super.getAnimation(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i7) {
        return super.getBoolean(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i7) {
        return super.getColor(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i7) {
        return super.getColorStateList(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i7) {
        return super.getDimension(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i7) {
        return super.getDimensionPixelOffset(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i7) {
        return super.getDimensionPixelSize(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i7, Resources.Theme theme) {
        return super.getDrawable(i7, theme);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i7, int i8) {
        return super.getDrawableForDensity(i7, i8);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i7, int i8, int i9) {
        return super.getFraction(i7, i8, i9);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i7) {
        return super.getIntArray(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i7) {
        return super.getInteger(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i7) {
        return super.getLayout(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i7) {
        return super.getMovie(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i7, int i8) {
        return super.getQuantityString(i7, i8);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i7, int i8) {
        return super.getQuantityText(i7, i8);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i7) {
        return super.getResourceEntryName(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i7) {
        return super.getResourceName(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i7) {
        return super.getResourcePackageName(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i7) {
        return super.getResourceTypeName(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i7) {
        return super.getString(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i7) {
        return super.getStringArray(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i7) {
        return super.getText(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i7) {
        return super.getTextArray(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i7, TypedValue typedValue, boolean z7) {
        super.getValue(i7, typedValue, z7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i7, int i8, TypedValue typedValue, boolean z7) {
        super.getValueForDensity(i7, i8, typedValue, z7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i7) {
        return super.getXml(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i7) {
        return super.obtainTypedArray(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i7) {
        return super.openRawResource(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i7) {
        return super.openRawResourceFd(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Context context = (Context) this.f8282b.get();
        return context != null ? C2335V.m9949g().m9963s(context, this, i7) : m9976a(i7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i7, int i8, Resources.Theme theme) {
        return super.getDrawableForDensity(i7, i8, theme);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i7, int i8, Object[] objArr) {
        return super.getQuantityString(i7, i8, objArr);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i7, Object[] objArr) {
        return super.getString(i7, objArr);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i7, CharSequence charSequence) {
        return super.getText(i7, charSequence);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z7) {
        super.getValue(str, typedValue, z7);
    }

    @Override // androidx.appcompat.widget.AbstractC2337W, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i7, TypedValue typedValue) {
        return super.openRawResource(i7, typedValue);
    }
}

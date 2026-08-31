package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p025D.AbstractC0165h;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C2348d0 {

    /* JADX INFO: renamed from: a */
    private final Context f8218a;

    /* JADX INFO: renamed from: b */
    private final TypedArray f8219b;

    /* JADX INFO: renamed from: c */
    private TypedValue f8220c;

    private C2348d0(Context context, TypedArray typedArray) {
        this.f8218a = context;
        this.f8219b = typedArray;
    }

    /* JADX INFO: renamed from: t */
    public static C2348d0 m10023t(Context context, int i7, int[] iArr) {
        return new C2348d0(context, context.obtainStyledAttributes(i7, iArr));
    }

    /* JADX INFO: renamed from: u */
    public static C2348d0 m10024u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C2348d0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: v */
    public static C2348d0 m10025v(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new C2348d0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    /* JADX INFO: renamed from: a */
    public boolean m10026a(int i7, boolean z7) {
        return this.f8219b.getBoolean(i7, z7);
    }

    /* JADX INFO: renamed from: b */
    public int m10027b(int i7, int i8) {
        return this.f8219b.getColor(i7, i8);
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m10028c(int i7) {
        int resourceId;
        ColorStateList colorStateListM25174a;
        return (!this.f8219b.hasValue(i7) || (resourceId = this.f8219b.getResourceId(i7, 0)) == 0 || (colorStateListM25174a = AbstractC5659a.m25174a(this.f8218a, resourceId)) == null) ? this.f8219b.getColorStateList(i7) : colorStateListM25174a;
    }

    /* JADX INFO: renamed from: d */
    public float m10029d(int i7, float f7) {
        return this.f8219b.getDimension(i7, f7);
    }

    /* JADX INFO: renamed from: e */
    public int m10030e(int i7, int i8) {
        return this.f8219b.getDimensionPixelOffset(i7, i8);
    }

    /* JADX INFO: renamed from: f */
    public int m10031f(int i7, int i8) {
        return this.f8219b.getDimensionPixelSize(i7, i8);
    }

    /* JADX INFO: renamed from: g */
    public Drawable m10032g(int i7) {
        int resourceId;
        return (!this.f8219b.hasValue(i7) || (resourceId = this.f8219b.getResourceId(i7, 0)) == 0) ? this.f8219b.getDrawable(i7) : AbstractC5659a.m25175b(this.f8218a, resourceId);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m10033h(int i7) {
        int resourceId;
        if (!this.f8219b.hasValue(i7) || (resourceId = this.f8219b.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return C2359j.m10088b().m10093d(this.f8218a, resourceId, true);
    }

    /* JADX INFO: renamed from: i */
    public float m10034i(int i7, float f7) {
        return this.f8219b.getFloat(i7, f7);
    }

    /* JADX INFO: renamed from: j */
    public Typeface m10035j(int i7, int i8, AbstractC0165h.e eVar) {
        int resourceId = this.f8219b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f8220c == null) {
            this.f8220c = new TypedValue();
        }
        return AbstractC0165h.m816h(this.f8218a, resourceId, this.f8220c, i8, eVar);
    }

    /* JADX INFO: renamed from: k */
    public int m10036k(int i7, int i8) {
        return this.f8219b.getInt(i7, i8);
    }

    /* JADX INFO: renamed from: l */
    public int m10037l(int i7, int i8) {
        return this.f8219b.getInteger(i7, i8);
    }

    /* JADX INFO: renamed from: m */
    public int m10038m(int i7, int i8) {
        return this.f8219b.getLayoutDimension(i7, i8);
    }

    /* JADX INFO: renamed from: n */
    public int m10039n(int i7, int i8) {
        return this.f8219b.getResourceId(i7, i8);
    }

    /* JADX INFO: renamed from: o */
    public String m10040o(int i7) {
        return this.f8219b.getString(i7);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m10041p(int i7) {
        return this.f8219b.getText(i7);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence[] m10042q(int i7) {
        return this.f8219b.getTextArray(i7);
    }

    /* JADX INFO: renamed from: r */
    public TypedArray m10043r() {
        return this.f8219b;
    }

    /* JADX INFO: renamed from: s */
    public boolean m10044s(int i7) {
        return this.f8219b.hasValue(i7);
    }

    /* JADX INFO: renamed from: w */
    public TypedValue m10045w(int i7) {
        return this.f8219b.peekValue(i7);
    }

    /* JADX INFO: renamed from: x */
    public void m10046x() {
        this.f8219b.recycle();
    }
}

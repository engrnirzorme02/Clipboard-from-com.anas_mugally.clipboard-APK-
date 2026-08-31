package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.C3553a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.C */
/* JADX INFO: loaded from: classes.dex */
class C2304C {

    /* JADX INFO: renamed from: l */
    private static final RectF f7895l = new RectF();

    /* JADX INFO: renamed from: m */
    private static ConcurrentHashMap f7896m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private int f7897a = 0;

    /* JADX INFO: renamed from: b */
    private boolean f7898b = false;

    /* JADX INFO: renamed from: c */
    private float f7899c = -1.0f;

    /* JADX INFO: renamed from: d */
    private float f7900d = -1.0f;

    /* JADX INFO: renamed from: e */
    private float f7901e = -1.0f;

    /* JADX INFO: renamed from: f */
    private int[] f7902f = new int[0];

    /* JADX INFO: renamed from: g */
    private boolean f7903g = false;

    /* JADX INFO: renamed from: h */
    private TextPaint f7904h;

    /* JADX INFO: renamed from: i */
    private final TextView f7905i;

    /* JADX INFO: renamed from: j */
    private final Context f7906j;

    /* JADX INFO: renamed from: k */
    private final d f7907k;

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static StaticLayout m9737a(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i8 == -1) {
                i8 = C3553a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i8);
            try {
                dVar.mo9738a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$b */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.C2304C.d
        /* JADX INFO: renamed from: a */
        void mo9738a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C2304C.m9715m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$c */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.C2304C.b, androidx.appcompat.widget.C2304C.d
        /* JADX INFO: renamed from: a */
        void mo9738a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C2304C.d
        /* JADX INFO: renamed from: b */
        boolean mo9739b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$d */
    private static class d {
        d() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo9738a(StaticLayout.Builder builder, TextView textView);

        /* JADX INFO: renamed from: b */
        boolean mo9739b(TextView textView) {
            return ((Boolean) C2304C.m9715m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C2304C(TextView textView) {
        this.f7905i = textView;
        this.f7906j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7907k = new c();
        } else {
            this.f7907k = new b();
        }
    }

    /* JADX INFO: renamed from: b */
    private int[] m9711b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    private void m9712c() {
        this.f7897a = 0;
        this.f7900d = -1.0f;
        this.f7901e = -1.0f;
        this.f7899c = -1.0f;
        this.f7902f = new int[0];
        this.f7898b = false;
    }

    /* JADX INFO: renamed from: e */
    private int m9713e(RectF rectF) {
        int length = this.f7902f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = 1;
        int i8 = length - 1;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = (i7 + i8) / 2;
            if (m9720x(this.f7902f[i10], rectF)) {
                int i11 = i10 + 1;
                i9 = i7;
                i7 = i11;
            } else {
                i9 = i10 - 1;
                i8 = i9;
            }
        }
        return this.f7902f[i9];
    }

    /* JADX INFO: renamed from: k */
    private static Method m9714k(String str) {
        try {
            Method declaredMethod = (Method) f7896m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f7896m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    static Object m9715m(Object obj, String str, Object obj2) {
        try {
            return m9714k(str).invoke(obj, new Object[0]);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m9716s(float f7) {
        if (f7 != this.f7905i.getPaint().getTextSize()) {
            this.f7905i.getPaint().setTextSize(f7);
            boolean zIsInLayout = this.f7905i.isInLayout();
            if (this.f7905i.getLayout() != null) {
                this.f7898b = false;
                try {
                    Method methodM9714k = m9714k("nullLayouts");
                    if (methodM9714k != null) {
                        methodM9714k.invoke(this.f7905i, new Object[0]);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (zIsInLayout) {
                    this.f7905i.forceLayout();
                } else {
                    this.f7905i.requestLayout();
                }
                this.f7905i.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m9717u() {
        if (m9721y() && this.f7897a == 1) {
            if (!this.f7903g || this.f7902f.length == 0) {
                int iFloor = ((int) Math.floor((this.f7901e - this.f7900d) / this.f7899c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round(this.f7900d + (i7 * this.f7899c));
                }
                this.f7902f = m9711b(iArr);
            }
            this.f7898b = true;
        } else {
            this.f7898b = false;
        }
        return this.f7898b;
    }

    /* JADX INFO: renamed from: v */
    private void m9718v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f7902f = m9711b(iArr);
            m9719w();
        }
    }

    /* JADX INFO: renamed from: w */
    private boolean m9719w() {
        int[] iArr = this.f7902f;
        int length = iArr.length;
        boolean z7 = length > 0;
        this.f7903g = z7;
        if (z7) {
            this.f7897a = 1;
            this.f7900d = iArr[0];
            this.f7901e = iArr[length - 1];
            this.f7899c = -1.0f;
        }
        return z7;
    }

    /* JADX INFO: renamed from: x */
    private boolean m9720x(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f7905i.getText();
        TransformationMethod transformationMethod = this.f7905i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f7905i)) != null) {
            text = transformation;
        }
        int maxLines = this.f7905i.getMaxLines();
        m9730l(i7);
        StaticLayout staticLayoutM9724d = m9724d(text, (Layout.Alignment) m9715m(this.f7905i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM9724d.getLineCount() <= maxLines && staticLayoutM9724d.getLineEnd(staticLayoutM9724d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM9724d.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: renamed from: y */
    private boolean m9721y() {
        return !(this.f7905i instanceof C2361k);
    }

    /* JADX INFO: renamed from: z */
    private void m9722z(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f7897a = 1;
        this.f7900d = f7;
        this.f7901e = f8;
        this.f7899c = f9;
        this.f7903g = false;
    }

    /* JADX INFO: renamed from: a */
    void m9723a() {
        if (m9731n()) {
            if (this.f7898b) {
                if (this.f7905i.getMeasuredHeight() <= 0 || this.f7905i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f7907k.mo9739b(this.f7905i) ? 1048576 : (this.f7905i.getMeasuredWidth() - this.f7905i.getTotalPaddingLeft()) - this.f7905i.getTotalPaddingRight();
                int height = (this.f7905i.getHeight() - this.f7905i.getCompoundPaddingBottom()) - this.f7905i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f7895l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM9713e = m9713e(rectF);
                        if (fM9713e != this.f7905i.getTextSize()) {
                            m9736t(0, fM9713e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f7898b = true;
        }
    }

    /* JADX INFO: renamed from: d */
    StaticLayout m9724d(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        return a.m9737a(charSequence, alignment, i7, i8, this.f7905i, this.f7904h, this.f7907k);
    }

    /* JADX INFO: renamed from: f */
    int m9725f() {
        return Math.round(this.f7901e);
    }

    /* JADX INFO: renamed from: g */
    int m9726g() {
        return Math.round(this.f7900d);
    }

    /* JADX INFO: renamed from: h */
    int m9727h() {
        return Math.round(this.f7899c);
    }

    /* JADX INFO: renamed from: i */
    int[] m9728i() {
        return this.f7902f;
    }

    /* JADX INFO: renamed from: j */
    int m9729j() {
        return this.f7897a;
    }

    /* JADX INFO: renamed from: l */
    void m9730l(int i7) {
        TextPaint textPaint = this.f7904h;
        if (textPaint == null) {
            this.f7904h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f7904h.set(this.f7905i.getPaint());
        this.f7904h.setTextSize(i7);
    }

    /* JADX INFO: renamed from: n */
    boolean m9731n() {
        return m9721y() && this.f7897a != 0;
    }

    /* JADX INFO: renamed from: o */
    void m9732o(AttributeSet attributeSet, int i7) {
        int resourceId;
        Context context = this.f7906j;
        int[] iArr = AbstractC5529j.f21256g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        TextView textView = this.f7905i;
        AbstractC1030Z.m4470h0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        int i8 = AbstractC5529j.f21281l0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f7897a = typedArrayObtainStyledAttributes.getInt(i8, 0);
        }
        int i9 = AbstractC5529j.f21276k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i9) ? typedArrayObtainStyledAttributes.getDimension(i9, -1.0f) : -1.0f;
        int i10 = AbstractC5529j.f21266i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i10) ? typedArrayObtainStyledAttributes.getDimension(i10, -1.0f) : -1.0f;
        int i11 = AbstractC5529j.f21261h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getDimension(i11, -1.0f) : -1.0f;
        int i12 = AbstractC5529j.f21271j0;
        if (typedArrayObtainStyledAttributes.hasValue(i12) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m9718v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m9721y()) {
            this.f7897a = 0;
            return;
        }
        if (this.f7897a == 1) {
            if (!this.f7903g) {
                DisplayMetrics displayMetrics = this.f7906j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m9722z(dimension2, dimension3, dimension);
            }
            m9717u();
        }
    }

    /* JADX INFO: renamed from: p */
    void m9733p(int i7, int i8, int i9, int i10) {
        if (m9721y()) {
            DisplayMetrics displayMetrics = this.f7906j.getResources().getDisplayMetrics();
            m9722z(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (m9717u()) {
                m9723a();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    void m9734q(int[] iArr, int i7) {
        if (m9721y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f7906j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArrCopyOf[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f7902f = m9711b(iArrCopyOf);
                if (!m9719w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f7903g = false;
            }
            if (m9717u()) {
                m9723a();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    void m9735r(int i7) {
        if (m9721y()) {
            if (i7 == 0) {
                m9712c();
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            }
            DisplayMetrics displayMetrics = this.f7906j.getResources().getDisplayMetrics();
            m9722z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m9717u()) {
                m9723a();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    void m9736t(int i7, float f7) {
        Context context = this.f7906j;
        m9716s(TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}

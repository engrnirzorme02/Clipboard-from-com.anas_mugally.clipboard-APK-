package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p240f0.C5393f;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.m */
/* JADX INFO: loaded from: classes.dex */
class C2364m {

    /* JADX INFO: renamed from: a */
    private final TextView f8295a;

    /* JADX INFO: renamed from: b */
    private final C5393f f8296b;

    C2364m(TextView textView) {
        this.f8295a = textView;
        this.f8296b = new C5393f(textView, false);
    }

    /* JADX INFO: renamed from: a */
    InputFilter[] m10120a(InputFilter[] inputFilterArr) {
        return this.f8296b.m24438a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m10121b() {
        return this.f8296b.m24439b();
    }

    /* JADX INFO: renamed from: c */
    void m10122c(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f8295a.getContext().obtainStyledAttributes(attributeSet, AbstractC5529j.f21256g0, i7, 0);
        try {
            int i8 = AbstractC5529j.f21326u0;
            boolean z7 = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getBoolean(i8, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m10124e(z7);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    void m10123d(boolean z7) {
        this.f8296b.m24440c(z7);
    }

    /* JADX INFO: renamed from: e */
    void m10124e(boolean z7) {
        this.f8296b.m24441d(z7);
    }

    /* JADX INFO: renamed from: f */
    public TransformationMethod m10125f(TransformationMethod transformationMethod) {
        return this.f8296b.m24442e(transformationMethod);
    }
}

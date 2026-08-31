package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.widget.AbstractC2452c;
import p041F.AbstractC0400a;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i */
/* JADX INFO: loaded from: classes.dex */
class C2357i {

    /* JADX INFO: renamed from: a */
    private final CompoundButton f8266a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f8267b = null;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f8268c = null;

    /* JADX INFO: renamed from: d */
    private boolean f8269d = false;

    /* JADX INFO: renamed from: e */
    private boolean f8270e = false;

    /* JADX INFO: renamed from: f */
    private boolean f8271f;

    C2357i(CompoundButton compoundButton) {
        this.f8266a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    void m10078a() {
        Drawable drawableM10718a = AbstractC2452c.m10718a(this.f8266a);
        if (drawableM10718a != null) {
            if (this.f8269d || this.f8270e) {
                Drawable drawableMutate = AbstractC0400a.m1712r(drawableM10718a).mutate();
                if (this.f8269d) {
                    AbstractC0400a.m1709o(drawableMutate, this.f8267b);
                }
                if (this.f8270e) {
                    AbstractC0400a.m1710p(drawableMutate, this.f8268c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f8266a.getDrawableState());
                }
                this.f8266a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m10079b() {
        return this.f8267b;
    }

    /* JADX INFO: renamed from: c */
    PorterDuff.Mode m10080c() {
        return this.f8268c;
    }

    /* JADX INFO: renamed from: d */
    void m10081d(AttributeSet attributeSet, int i7) {
        int i8;
        int iM10039n;
        int iM10039n2;
        Context context = this.f8266a.getContext();
        int[] iArr = AbstractC5529j.f21202U0;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        CompoundButton compoundButton = this.f8266a;
        AbstractC1030Z.m4470h0(compoundButton, compoundButton.getContext(), iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        try {
            int i9 = AbstractC5529j.f21210W0;
            if (!c2348d0M10025v.m10044s(i9) || (iM10039n2 = c2348d0M10025v.m10039n(i9, 0)) == 0) {
                i8 = AbstractC5529j.f21206V0;
                if (c2348d0M10025v.m10044s(i8) && (iM10039n = c2348d0M10025v.m10039n(i8, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f8266a;
                    compoundButton2.setButtonDrawable(AbstractC5659a.m25175b(compoundButton2.getContext(), iM10039n));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f8266a;
                    compoundButton3.setButtonDrawable(AbstractC5659a.m25175b(compoundButton3.getContext(), iM10039n2));
                } catch (Resources.NotFoundException unused) {
                    i8 = AbstractC5529j.f21206V0;
                    if (c2348d0M10025v.m10044s(i8)) {
                        CompoundButton compoundButton4 = this.f8266a;
                        compoundButton4.setButtonDrawable(AbstractC5659a.m25175b(compoundButton4.getContext(), iM10039n));
                    }
                }
            }
            int i10 = AbstractC5529j.f21214X0;
            if (c2348d0M10025v.m10044s(i10)) {
                AbstractC2452c.m10721d(this.f8266a, c2348d0M10025v.m10028c(i10));
            }
            int i11 = AbstractC5529j.f21218Y0;
            if (c2348d0M10025v.m10044s(i11)) {
                AbstractC2452c.m10722e(this.f8266a, AbstractC2315M.m9771e(c2348d0M10025v.m10036k(i11, -1), null));
            }
        } finally {
            c2348d0M10025v.m10046x();
        }
    }

    /* JADX INFO: renamed from: e */
    void m10082e() {
        if (this.f8271f) {
            this.f8271f = false;
        } else {
            this.f8271f = true;
            m10078a();
        }
    }

    /* JADX INFO: renamed from: f */
    void m10083f(ColorStateList colorStateList) {
        this.f8267b = colorStateList;
        this.f8269d = true;
        m10078a();
    }

    /* JADX INFO: renamed from: g */
    void m10084g(PorterDuff.Mode mode) {
        this.f8268c = mode;
        this.f8270e = true;
        m10078a();
    }
}

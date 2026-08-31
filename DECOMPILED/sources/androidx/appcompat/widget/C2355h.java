package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.widget.AbstractC2451b;
import p041F.AbstractC0400a;
import p111O.AbstractC1030Z;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.h */
/* JADX INFO: loaded from: classes.dex */
class C2355h {

    /* JADX INFO: renamed from: a */
    private final CheckedTextView f8238a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f8239b = null;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f8240c = null;

    /* JADX INFO: renamed from: d */
    private boolean f8241d = false;

    /* JADX INFO: renamed from: e */
    private boolean f8242e = false;

    /* JADX INFO: renamed from: f */
    private boolean f8243f;

    C2355h(CheckedTextView checkedTextView) {
        this.f8238a = checkedTextView;
    }

    /* JADX INFO: renamed from: a */
    void m10058a() {
        Drawable drawableM10713a = AbstractC2451b.m10713a(this.f8238a);
        if (drawableM10713a != null) {
            if (this.f8241d || this.f8242e) {
                Drawable drawableMutate = AbstractC0400a.m1712r(drawableM10713a).mutate();
                if (this.f8241d) {
                    AbstractC0400a.m1709o(drawableMutate, this.f8239b);
                }
                if (this.f8242e) {
                    AbstractC0400a.m1710p(drawableMutate, this.f8240c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f8238a.getDrawableState());
                }
                this.f8238a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    ColorStateList m10059b() {
        return this.f8239b;
    }

    /* JADX INFO: renamed from: c */
    PorterDuff.Mode m10060c() {
        return this.f8240c;
    }

    /* JADX INFO: renamed from: d */
    void m10061d(AttributeSet attributeSet, int i7) {
        int i8;
        int iM10039n;
        int iM10039n2;
        Context context = this.f8238a.getContext();
        int[] iArr = AbstractC5529j.f21182P0;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, iArr, i7, 0);
        CheckedTextView checkedTextView = this.f8238a;
        AbstractC1030Z.m4470h0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        try {
            int i9 = AbstractC5529j.f21190R0;
            if (!c2348d0M10025v.m10044s(i9) || (iM10039n2 = c2348d0M10025v.m10039n(i9, 0)) == 0) {
                i8 = AbstractC5529j.f21186Q0;
                if (c2348d0M10025v.m10044s(i8) && (iM10039n = c2348d0M10025v.m10039n(i8, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f8238a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC5659a.m25175b(checkedTextView2.getContext(), iM10039n));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f8238a;
                    checkedTextView3.setCheckMarkDrawable(AbstractC5659a.m25175b(checkedTextView3.getContext(), iM10039n2));
                } catch (Resources.NotFoundException unused) {
                    i8 = AbstractC5529j.f21186Q0;
                    if (c2348d0M10025v.m10044s(i8)) {
                        CheckedTextView checkedTextView4 = this.f8238a;
                        checkedTextView4.setCheckMarkDrawable(AbstractC5659a.m25175b(checkedTextView4.getContext(), iM10039n));
                    }
                }
            }
            int i10 = AbstractC5529j.f21194S0;
            if (c2348d0M10025v.m10044s(i10)) {
                AbstractC2451b.m10714b(this.f8238a, c2348d0M10025v.m10028c(i10));
            }
            int i11 = AbstractC5529j.f21198T0;
            if (c2348d0M10025v.m10044s(i11)) {
                AbstractC2451b.m10715c(this.f8238a, AbstractC2315M.m9771e(c2348d0M10025v.m10036k(i11, -1), null));
            }
        } finally {
            c2348d0M10025v.m10046x();
        }
    }

    /* JADX INFO: renamed from: e */
    void m10062e() {
        if (this.f8243f) {
            this.f8243f = false;
        } else {
            this.f8243f = true;
            m10058a();
        }
    }

    /* JADX INFO: renamed from: f */
    void m10063f(ColorStateList colorStateList) {
        this.f8239b = colorStateList;
        this.f8241d = true;
        m10058a();
    }

    /* JADX INFO: renamed from: g */
    void m10064g(PorterDuff.Mode mode) {
        this.f8240c = mode;
        this.f8242e = true;
        m10058a();
    }
}

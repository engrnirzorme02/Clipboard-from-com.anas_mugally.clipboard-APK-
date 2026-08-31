package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p065I.AbstractC0577a;
import p373v3.InterfaceC7227a;

/* JADX INFO: renamed from: com.google.android.material.carousel.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C4453g extends AbstractC4449c {

    /* JADX INFO: renamed from: d */
    private static final int[] f16731d = {1};

    /* JADX INFO: renamed from: e */
    private static final int[] f16732e = {1, 0};

    /* JADX INFO: renamed from: c */
    private int f16733c = 0;

    @Override // com.google.android.material.carousel.AbstractC4449c
    /* JADX INFO: renamed from: g */
    public C4451e mo19965g(InterfaceC7227a interfaceC7227a, View view) {
        boolean z7;
        int iMo19933b = interfaceC7227a.mo19933b();
        if (interfaceC7227a.mo19935g()) {
            iMo19933b = interfaceC7227a.mo19932a();
        }
        RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) c2766q).topMargin + ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC7227a.mo19935g()) {
            f7 = ((ViewGroup.MarginLayoutParams) c2766q).leftMargin + ((ViewGroup.MarginLayoutParams) c2766q).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fM19962d = m19962d() + f7;
        float fMax = Math.max(m19961c() + f7, fM19962d);
        float f8 = iMo19933b;
        float fMin = Math.min(measuredHeight + f7, f8);
        float fM2540a = AbstractC0577a.m2540a((measuredHeight / 3.0f) + f7, fM19962d + f7, fMax + f7);
        float f9 = (fMin + fM2540a) / 2.0f;
        int[] iArrM19959a = f16731d;
        float f10 = 2.0f * fM19962d;
        if (f8 <= f10) {
            iArrM19959a = new int[]{0};
        }
        int[] iArrM19959a2 = f16732e;
        if (interfaceC7227a.mo19934e() == 1) {
            iArrM19959a = AbstractC4449c.m19959a(iArrM19959a);
            iArrM19959a2 = AbstractC4449c.m19959a(iArrM19959a2);
        }
        int[] iArr = iArrM19959a2;
        int[] iArr2 = iArrM19959a;
        float f11 = f7;
        int iMax = (int) Math.max(1.0d, Math.floor(((f8 - (AbstractC4450d.m19976i(iArr) * f9)) - (AbstractC4450d.m19976i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f8 / fMin);
        int i7 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr3[i8] = iCeil - i8;
        }
        C4447a c4447aM19942c = C4447a.m19942c(f8, fM2540a, fM19962d, fMax, iArr2, f9, iArr, fMin, iArr3);
        this.f16733c = c4447aM19942c.m19946e();
        boolean zM20029i = m20029i(c4447aM19942c, interfaceC7227a.m31880f());
        int i9 = c4447aM19942c.f16687d;
        if (i9 == 0 && c4447aM19942c.f16686c == 0 && f8 > f10) {
            c4447aM19942c.f16686c = 1;
            z7 = true;
        } else {
            z7 = zM20029i;
        }
        if (z7) {
            c4447aM19942c = C4447a.m19942c(f8, fM2540a, fM19962d, fMax, new int[]{c4447aM19942c.f16686c}, f9, new int[]{i9}, fMin, new int[]{c4447aM19942c.f16690g});
        }
        return AbstractC4450d.m19971d(view.getContext(), f11, iMo19933b, c4447aM19942c, interfaceC7227a.mo19934e());
    }

    @Override // com.google.android.material.carousel.AbstractC4449c
    /* JADX INFO: renamed from: h */
    public boolean mo19966h(InterfaceC7227a interfaceC7227a, int i7) {
        if (i7 >= this.f16733c || interfaceC7227a.m31880f() < this.f16733c) {
            return i7 >= this.f16733c && interfaceC7227a.m31880f() < this.f16733c;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    boolean m20029i(C4447a c4447a, int i7) {
        int iM19946e = c4447a.m19946e() - i7;
        boolean z7 = iM19946e > 0 && (c4447a.f16686c > 0 || c4447a.f16687d > 1);
        while (iM19946e > 0) {
            int i8 = c4447a.f16686c;
            if (i8 > 0) {
                c4447a.f16686c = i8 - 1;
            } else {
                int i9 = c4447a.f16687d;
                if (i9 > 1) {
                    c4447a.f16687d = i9 - 1;
                }
            }
            iM19946e--;
        }
        return z7;
    }
}

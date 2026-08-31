package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.H */
/* JADX INFO: loaded from: classes.dex */
public final class C3434H {

    /* JADX INFO: renamed from: a */
    private final String[] f14195a;

    /* JADX INFO: renamed from: b */
    private final double[] f14196b;

    /* JADX INFO: renamed from: c */
    private final double[] f14197c;

    /* JADX INFO: renamed from: d */
    private final int[] f14198d;

    /* JADX INFO: renamed from: e */
    private int f14199e;

    /* synthetic */ C3434H(C3432G c3432g, byte[] bArr) {
        int size = c3432g.m17450d().size();
        this.f14195a = (String[]) c3432g.m17449c().toArray(new String[size]);
        this.f14196b = m17454c(c3432g.m17450d());
        this.f14197c = m17454c(c3432g.m17451e());
        this.f14198d = new int[size];
        this.f14199e = 0;
    }

    /* JADX INFO: renamed from: c */
    private static final double[] m17454c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) list.get(i7)).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m17455a(double d7) {
        this.f14199e++;
        int i7 = 0;
        while (true) {
            double[] dArr = this.f14197c;
            if (i7 >= dArr.length) {
                return;
            }
            double d8 = dArr[i7];
            if (d8 <= d7 && d7 < this.f14196b[i7]) {
                int[] iArr = this.f14198d;
                iArr[i7] = iArr[i7] + 1;
            }
            if (d7 < d8) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final List m17456b() {
        String[] strArr = this.f14195a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            double[] dArr = this.f14197c;
            double[] dArr2 = this.f14196b;
            int[] iArr = this.f14198d;
            double d7 = dArr[i7];
            double d8 = dArr2[i7];
            int i8 = iArr[i7];
            arrayList.add(new C3430F(str, d7, d8, ((double) i8) / ((double) this.f14199e), i8));
        }
        return arrayList;
    }
}

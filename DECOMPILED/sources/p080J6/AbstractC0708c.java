package p080J6;

import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0668y;

/* JADX INFO: renamed from: J6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0708c {
    /* JADX INFO: renamed from: a */
    public static final int m3448a(int[] iArr, int i7, int i8, int i9) {
        AbstractC6118n.m27187e(iArr, "<this>");
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i7) {
                i8 = i11 + 1;
            } else {
                if (i12 <= i7) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return (-i8) - 1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m3449b(C0668y c0668y, int i7) {
        AbstractC6118n.m27187e(c0668y, "<this>");
        int iM3448a = m3448a(c0668y.m3181P(), i7 + 1, 0, c0668y.m3182T().length);
        return iM3448a >= 0 ? iM3448a : ~iM3448a;
    }
}

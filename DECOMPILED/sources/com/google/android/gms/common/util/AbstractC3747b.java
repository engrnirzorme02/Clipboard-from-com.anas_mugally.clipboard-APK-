package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: renamed from: com.google.android.gms.common.util.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3747b {
    /* JADX INFO: renamed from: a */
    public static boolean m18144a(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18145b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (AbstractC3714q.m18053b(objArr[i7], obj)) {
                if (i7 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m18146c(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(dArr[i7]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18147d(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(fArr[i7]);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18148e(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(iArr[i7]);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m18149f(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(jArr[i7]);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m18150g(StringBuilder sb, Object[] objArr) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(objArr[i7]);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m18151h(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(zArr[i7]);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m18152i(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i7]);
            sb.append("\"");
        }
    }
}

package p262h6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: h6.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5658d {
    /* JADX INFO: renamed from: a */
    public static final String m25170a(Object from, Object until) {
        AbstractC6118n.m27187e(from, "from");
        AbstractC6118n.m27187e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    /* JADX INFO: renamed from: b */
    public static final void m25171b(int i7, int i8) {
        if (i8 <= i7) {
            throw new IllegalArgumentException(m25170a(Integer.valueOf(i7), Integer.valueOf(i8)).toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m25172c(int i7) {
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    /* JADX INFO: renamed from: d */
    public static final int m25173d(int i7, int i8) {
        return (i7 >>> (32 - i8)) & ((-i8) >> 31);
    }
}

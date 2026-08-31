package androidx.collection;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC6118n;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2393d {
    /* JADX INFO: renamed from: a */
    public static final void m10272a(C2391b c2391b, int i7) {
        AbstractC6118n.m27187e(c2391b, "<this>");
        c2391b.m10268p(new int[i7]);
        c2391b.m10267n(new Object[i7]);
    }

    /* JADX INFO: renamed from: b */
    public static final int m10273b(C2391b c2391b, int i7) {
        AbstractC6118n.m27187e(c2391b, "<this>");
        try {
            return AbstractC7065a.m31154a(c2391b.m10263e(), c2391b.m10265k(), i7);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m10274c(C2391b c2391b, Object obj, int i7) {
        AbstractC6118n.m27187e(c2391b, "<this>");
        int iM10265k = c2391b.m10265k();
        if (iM10265k == 0) {
            return -1;
        }
        int iM10273b = m10273b(c2391b, i7);
        if (iM10273b < 0 || AbstractC6118n.m27183a(obj, c2391b.m10262b()[iM10273b])) {
            return iM10273b;
        }
        int i8 = iM10273b + 1;
        while (i8 < iM10265k && c2391b.m10263e()[i8] == i7) {
            if (AbstractC6118n.m27183a(obj, c2391b.m10262b()[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iM10273b - 1; i9 >= 0 && c2391b.m10263e()[i9] == i7; i9--) {
            if (AbstractC6118n.m27183a(obj, c2391b.m10262b()[i9])) {
                return i9;
            }
        }
        return ~i8;
    }

    /* JADX INFO: renamed from: d */
    public static final int m10275d(C2391b c2391b) {
        AbstractC6118n.m27187e(c2391b, "<this>");
        return m10274c(c2391b, null, 0);
    }
}

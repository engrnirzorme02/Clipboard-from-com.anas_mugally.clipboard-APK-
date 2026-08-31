package androidx.collection;

import kotlin.jvm.internal.AbstractC6118n;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2402m {

    /* JADX INFO: renamed from: a */
    private static final Object f8483a = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object m10313c(C2401l c2401l, int i7) {
        Object obj;
        AbstractC6118n.m27187e(c2401l, "<this>");
        int iM31154a = AbstractC7065a.m31154a(c2401l.f8480b, c2401l.f8482d, i7);
        if (iM31154a < 0 || (obj = c2401l.f8481c[iM31154a]) == f8483a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m10314d(C2401l c2401l) {
        int i7 = c2401l.f8482d;
        int[] iArr = c2401l.f8480b;
        Object[] objArr = c2401l.f8481c;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f8483a) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        c2401l.f8479a = false;
        c2401l.f8482d = i8;
    }
}

package p063H5;

import java.util.List;

/* JADX INFO: renamed from: H5.B */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0507B {

    /* JADX INFO: renamed from: a */
    private static List f1890a;

    /* JADX INFO: renamed from: b */
    private static boolean f1891b;

    /* JADX INFO: renamed from: a */
    static synchronized List m2124a() {
        f1891b = true;
        return f1890a;
    }
}

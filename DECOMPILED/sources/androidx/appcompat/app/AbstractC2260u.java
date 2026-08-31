package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;
import p081K.C0718j;

/* JADX INFO: renamed from: androidx.appcompat.app.u */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2260u {
    /* JADX INFO: renamed from: a */
    private static C0718j m9318a(C0718j c0718j, C0718j c0718j2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i7 = 0;
        while (i7 < c0718j.m3477f() + c0718j2.m3477f()) {
            Locale localeM3475c = i7 < c0718j.m3477f() ? c0718j.m3475c(i7) : c0718j2.m3475c(i7 - c0718j.m3477f());
            if (localeM3475c != null) {
                linkedHashSet.add(localeM3475c);
            }
            i7++;
        }
        return C0718j.m3471a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: b */
    static C0718j m9319b(C0718j c0718j, C0718j c0718j2) {
        return (c0718j == null || c0718j.m3476e()) ? C0718j.m3473d() : m9318a(c0718j, c0718j2);
    }
}

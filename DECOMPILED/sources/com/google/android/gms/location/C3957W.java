package com.google.android.gms.location;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.location.W */
/* JADX INFO: loaded from: classes2.dex */
final class C3957W implements Comparator {
    C3957W() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C3964c c3964c = (C3964c) obj;
        C3964c c3964c2 = (C3964c) obj2;
        AbstractC3718s.m18083l(c3964c);
        AbstractC3718s.m18083l(c3964c2);
        int iM18389T = c3964c.m18389T();
        int iM18389T2 = c3964c2.m18389T();
        if (iM18389T != iM18389T2) {
            return iM18389T >= iM18389T2 ? 1 : -1;
        }
        int iM18390U = c3964c.m18390U();
        int iM18390U2 = c3964c2.m18390U();
        if (iM18390U == iM18390U2) {
            return 0;
        }
        return iM18390U < iM18390U2 ? -1 : 1;
    }
}

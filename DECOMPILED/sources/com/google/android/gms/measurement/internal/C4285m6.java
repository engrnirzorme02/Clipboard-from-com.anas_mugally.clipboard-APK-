package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4285m6 {

    /* JADX INFO: renamed from: a */
    zzid f15891a;

    /* JADX INFO: renamed from: b */
    List f15892b;

    /* JADX INFO: renamed from: c */
    List f15893c;

    /* JADX INFO: renamed from: d */
    long f15894d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4317q6 f15895e;

    /* synthetic */ C4285m6(C4317q6 c4317q6, byte[] bArr) {
        Objects.requireNonNull(c4317q6);
        this.f15895e = c4317q6;
    }

    /* JADX INFO: renamed from: b */
    private static final long m18826b(zzhs zzhsVar) {
        return ((zzhsVar.zzf() / 1000) / 60) / 60;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18827a(long j7, zzhs zzhsVar) {
        AbstractC3718s.m18083l(zzhsVar);
        if (this.f15893c == null) {
            this.f15893c = new ArrayList();
        }
        if (this.f15892b == null) {
            this.f15892b = new ArrayList();
        }
        if (!this.f15893c.isEmpty() && m18826b((zzhs) this.f15893c.get(0)) != m18826b(zzhsVar)) {
            return false;
        }
        long jZzcn = this.f15894d + ((long) zzhsVar.zzcn());
        C4317q6 c4317q6 = this.f15895e;
        if (!c4317q6.m18891B0().m18800H(null, AbstractC4209d2.f15662e1)) {
            c4317q6.m18891B0();
            if (jZzcn >= C4278m.m18788o()) {
                return false;
            }
        } else if (!this.f15893c.isEmpty()) {
            c4317q6.m18891B0();
            if (jZzcn >= C4278m.m18788o()) {
                return false;
            }
        }
        this.f15894d = jZzcn;
        this.f15893c.add(zzhsVar);
        this.f15892b.add(Long.valueOf(j7));
        int size = this.f15893c.size();
        c4317q6.m18891B0();
        return size < Math.max(1, ((Integer) AbstractC4209d2.f15678k.m18706b(null)).intValue());
    }
}

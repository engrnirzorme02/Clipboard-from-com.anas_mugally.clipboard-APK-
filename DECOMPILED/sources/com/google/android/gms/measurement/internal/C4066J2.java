package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.J2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4066J2 implements zzr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4109P2 f15270a;

    C4066J2(C4109P2 c4109p2) {
        Objects.requireNonNull(c4109p2);
        this.f15270a = c4109p2;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i7, String str, List list, boolean z7, boolean z8) {
        C4297o2 c4297o2M18858v;
        int i8 = i7 - 1;
        if (i8 == 0) {
            c4297o2M18858v = this.f15270a.f15066a.mo18421a().m18858v();
        } else if (i8 != 1) {
            if (i8 == 3) {
                c4297o2M18858v = this.f15270a.f15066a.mo18421a().m18859w();
            } else if (i8 != 4) {
                c4297o2M18858v = this.f15270a.f15066a.mo18421a().m18857u();
            } else if (z7) {
                c4297o2M18858v = this.f15270a.f15066a.mo18421a().m18855s();
            } else {
                c4297o2M18858v = !z8 ? this.f15270a.f15066a.mo18421a().m18856t() : this.f15270a.f15066a.mo18421a().m18854r();
            }
        } else if (z7) {
            c4297o2M18858v = this.f15270a.f15066a.mo18421a().m18852p();
        } else {
            c4297o2M18858v = !z8 ? this.f15270a.f15066a.mo18421a().m18853q() : this.f15270a.f15066a.mo18421a().m18851o();
        }
        int size = list.size();
        if (size == 1) {
            c4297o2M18858v.m18835b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c4297o2M18858v.m18836c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c4297o2M18858v.m18834a(str);
        } else {
            c4297o2M18858v.m18837d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

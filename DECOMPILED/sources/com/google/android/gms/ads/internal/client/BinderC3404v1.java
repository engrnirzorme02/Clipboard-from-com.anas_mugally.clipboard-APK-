package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzblq;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p372v2.InterfaceC7225b;
import p372v2.InterfaceC7226c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.v1 */
/* JADX INFO: loaded from: classes.dex */
final class BinderC3404v1 extends zzblq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3407w1 f14100a;

    /* synthetic */ BinderC3404v1(C3407w1 c3407w1, byte[] bArr) {
        Objects.requireNonNull(c3407w1);
        this.f14100a = c3407w1;
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzb(List list) {
        int i7;
        ArrayList arrayList;
        C3407w1 c3407w1 = this.f14100a;
        synchronized (c3407w1.m17340o()) {
            c3407w1.m17342q(false);
            c3407w1.m17343r(true);
            arrayList = new ArrayList(c3407w1.m17341p());
            c3407w1.m17341p().clear();
        }
        InterfaceC7225b interfaceC7225bM17326a = C3407w1.m17326a(list);
        int size = arrayList.size();
        for (i7 = 0; i7 < size; i7++) {
            ((InterfaceC7226c) arrayList.get(i7)).mo29535a(interfaceC7225bM17326a);
        }
    }
}

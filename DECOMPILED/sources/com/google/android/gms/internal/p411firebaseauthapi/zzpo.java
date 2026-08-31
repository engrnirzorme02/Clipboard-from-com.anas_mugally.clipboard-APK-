package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpo implements Iterable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ List zzb;

    zzpo(zzpl zzplVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzplVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzpq(this.zza.iterator(), this.zzb.iterator());
    }
}

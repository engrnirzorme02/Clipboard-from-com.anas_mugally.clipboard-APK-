package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyw implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    zzgyw(zzgyz zzgyzVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzgyzVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgyy(this.zza.iterator(), this.zzb.iterator(), null);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgig implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzgih zzc;

    zzgig(zzgih zzgihVar) {
        Objects.requireNonNull(zzgihVar);
        this.zzc = zzgihVar;
        this.zza = zzgihVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzghc.zzi(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgiu zzgiuVar = this.zzc.zzb;
        zzgiuVar.zzq(zzgiuVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}

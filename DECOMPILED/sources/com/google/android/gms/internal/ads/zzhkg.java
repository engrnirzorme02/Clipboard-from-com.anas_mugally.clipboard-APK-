package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkg extends zzhgu {
    final zzhki zza;
    zzhgw zzb;
    final /* synthetic */ zzhkj zzc;

    zzhkg(zzhkj zzhkjVar) {
        Objects.requireNonNull(zzhkjVar);
        this.zzc = zzhkjVar;
        this.zza = new zzhki(zzhkjVar, null);
        this.zzb = zzb();
    }

    private final zzhgw zzb() {
        zzhki zzhkiVar = this.zza;
        if (zzhkiVar.hasNext()) {
            return zzhkiVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzhgw
    public final byte zza() {
        zzhgw zzhgwVar = this.zzb;
        if (zzhgwVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzhgwVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}

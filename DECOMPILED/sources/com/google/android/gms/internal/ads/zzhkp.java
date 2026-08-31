package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkp implements Iterator {
    final /* synthetic */ zzhkr zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzhkp(zzhkr zzhkrVar, byte[] bArr) {
        Objects.requireNonNull(zzhkrVar);
        this.zza = zzhkrVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zzb + 1;
        zzhkr zzhkrVar = this.zza;
        if (i7 >= zzhkrVar.zzj()) {
            return !zzhkrVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i7 = this.zzb + 1;
        this.zzb = i7;
        zzhkr zzhkrVar = this.zza;
        return i7 < zzhkrVar.zzj() ? (zzhko) zzhkrVar.zzi()[i7] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhkr zzhkrVar = this.zza;
        zzhkrVar.zzh();
        int i7 = this.zzb;
        if (i7 >= zzhkrVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i7 - 1;
            zzhkrVar.zzg(i7);
        }
    }
}

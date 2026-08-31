package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzhgt extends zzhgu {
    final /* synthetic */ zzhhb zza;
    private int zzb;
    private final int zzc;

    zzhgt(zzhhb zzhhbVar) {
        Objects.requireNonNull(zzhhbVar);
        this.zza = zzhhbVar;
        this.zzb = 0;
        this.zzc = zzhhbVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhgw
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}

package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzajy extends zzaka {
    private int zza;
    private final int zzb;
    private final /* synthetic */ zzajv zzc;

    zzajy(zzajv zzajvVar) {
        Objects.requireNonNull(zzajvVar);
        this.zzc = zzajvVar;
        this.zza = 0;
        this.zzb = zzajvVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakb
    public final byte zza() {
        int i7 = this.zza;
        if (i7 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i7 + 1;
        return this.zzc.zzb(i7);
    }
}

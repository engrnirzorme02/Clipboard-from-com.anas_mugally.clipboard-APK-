package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgjg implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgjk zze;

    /* synthetic */ zzgjg(zzgjk zzgjkVar, byte[] bArr) {
        Objects.requireNonNull(zzgjkVar);
        this.zze = zzgjkVar;
        this.zzb = zzgjkVar.zzs();
        this.zzc = zzgjkVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.zzc;
        this.zzd = i7;
        Object objZza = zza(i7);
        this.zzc = this.zze.zzg(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzghc.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i7 = this.zzd;
        zzgjk zzgjkVar = this.zze;
        zzgjkVar.remove(zzgjkVar.zzo(i7));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i7);
}

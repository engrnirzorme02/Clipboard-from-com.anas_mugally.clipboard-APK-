package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzas zza;
    private int zzb;

    zzar(zzas zzasVar) {
        Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzas zzasVar = this.zza;
        String strZzb = zzasVar.zzb();
        int i7 = this.zzb;
        if (i7 >= strZzb.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return new zzas(String.valueOf(zzasVar.zzb().charAt(i7)));
    }
}

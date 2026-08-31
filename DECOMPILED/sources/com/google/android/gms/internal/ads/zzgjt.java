package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class zzgjt extends zzgju {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzgjt(int i7) {
        zzgiz.zzb(i7, "initialCapacity");
        this.zza = new Object[i7];
        this.zzb = 0;
    }

    private final void zzf(int i7) {
        int length = this.zza.length;
        int iZze = zzgju.zze(length, this.zzb + i7);
        if (iZze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    public final zzgjt zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }

    final void zzb(Object[] objArr, int i7) {
        zzgli.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzgju zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgjv) {
                this.zzb = ((zzgjv) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgju
    public /* bridge */ /* synthetic */ zzgju zzd(Object obj) {
        throw null;
    }
}

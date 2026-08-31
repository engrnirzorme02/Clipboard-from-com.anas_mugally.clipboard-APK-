package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkb {
    Object[] zza;
    int zzb;
    zzgka zzc;

    public zzgkb() {
        this(4);
    }

    private final void zzd(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            this.zza = Arrays.copyOf(objArr, zzgju.zze(length, i8));
        }
    }

    public final zzgkb zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzgiz.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        int i8 = i7 + i7;
        objArr[i8] = obj;
        objArr[i8 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    public final zzgkb zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgkc zzc() {
        zzgka zzgkaVar = this.zzc;
        if (zzgkaVar != null) {
            throw zzgkaVar.zza();
        }
        zzglp zzglpVarZzj = zzglp.zzj(this.zzb, this.zza, this);
        zzgka zzgkaVar2 = this.zzc;
        if (zzgkaVar2 == null) {
            return zzglpVarZzj;
        }
        throw zzgkaVar2.zza();
    }

    zzgkb(int i7) {
        this.zza = new Object[i7 + i7];
        this.zzb = 0;
    }
}

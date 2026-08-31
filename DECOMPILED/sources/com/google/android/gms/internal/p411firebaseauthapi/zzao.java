package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao<K, V> {
    zzan zza;
    private Object[] zzb;
    private int zzc;

    public zzao() {
        this(4);
    }

    public final zzao<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzae.zza(key, value);
            Object[] objArr = this.zzb;
            int i7 = this.zzc;
            objArr[i7 * 2] = key;
            objArr[(i7 * 2) + 1] = value;
            this.zzc = i7 + 1;
        }
        return this;
    }

    zzao(int i7) {
        this.zzb = new Object[i7 * 2];
        this.zzc = 0;
    }

    public final zzal<K, V> zza() {
        zzan zzanVar = this.zza;
        if (zzanVar == null) {
            zzas zzasVarZza = zzas.zza(this.zzc, this.zzb, this);
            zzan zzanVar2 = this.zza;
            if (zzanVar2 == null) {
                return zzasVarZza;
            }
            throw zzanVar2.zza();
        }
        throw zzanVar.zza();
    }

    private final void zza(int i7) {
        int i8 = i7 << 1;
        Object[] objArr = this.zzb;
        if (i8 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzai.zza(objArr.length, i8));
        }
    }
}

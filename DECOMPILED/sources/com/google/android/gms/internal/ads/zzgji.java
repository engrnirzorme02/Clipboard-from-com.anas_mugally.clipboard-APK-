package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgji extends zzgiv {
    final /* synthetic */ zzgjk zza;
    private final Object zzb;
    private int zzc;

    zzgji(zzgjk zzgjkVar, int i7) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
        this.zzb = zzgjkVar.zzo(i7);
        this.zzc = i7;
    }

    private final void zza() {
        int i7 = this.zzc;
        if (i7 != -1) {
            zzgjk zzgjkVar = this.zza;
            if (i7 < zzgjkVar.size() && Objects.equals(this.zzb, zzgjkVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgiv, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgiv, java.util.Map.Entry
    public final Object getValue() {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            return null;
        }
        return zzgjkVar.zzp(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgiv, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            zzgjkVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgjkVar.zzp(i7);
        zzgjkVar.zzq(this.zzc, obj);
        return objZzp;
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhs {
    public final String zza;
    public final zzu zzb;
    public final zzu zzc;
    public final int zzd;
    public final int zze;

    public zzhs(String str, zzu zzuVar, zzu zzuVar2, int i7, int i8) {
        boolean z7;
        if (i7 != 0) {
            z7 = false;
            if (i8 == 0) {
                i8 = 0;
                z7 = true;
            }
        } else {
            z7 = true;
        }
        zzghc.zza(z7);
        zzghc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzuVar;
        zzuVar2.getClass();
        this.zzc = zzuVar2;
        this.zzd = i7;
        this.zze = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhs.class == obj.getClass()) {
            zzhs zzhsVar = (zzhs) obj;
            if (this.zzd == zzhsVar.zzd && this.zze == zzhsVar.zze && this.zza.equals(zzhsVar.zza) && this.zzb.equals(zzhsVar.zzb) && this.zzc.equals(zzhsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}

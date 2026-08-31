package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zztc {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztc(String str, boolean z7, boolean z8) {
        this.zza = str;
        this.zzb = z7;
        this.zzc = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zztc.class) {
            zztc zztcVar = (zztc) obj;
            if (TextUtils.equals(this.zza, zztcVar.zza) && this.zzb == zztcVar.zzb && this.zzc == zztcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}

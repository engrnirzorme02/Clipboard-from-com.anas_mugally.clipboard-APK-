package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zznv {
    zznv() {
    }

    public static final List zza(Object obj, long j7) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j7);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zznkVarZzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j7, zznkVarZzd);
        return zznkVarZzd;
    }
}

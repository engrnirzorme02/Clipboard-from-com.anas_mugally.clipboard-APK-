package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzod {
    zzod() {
    }

    public static final boolean zza(Object obj) {
        return !((zzoc) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzoc zzocVarZzb = (zzoc) obj;
        zzoc zzocVar = (zzoc) obj2;
        if (!zzocVar.isEmpty()) {
            if (!zzocVarZzb.zze()) {
                zzocVarZzb = zzocVarZzb.zzb();
            }
            zzocVarZzb.zzd(zzocVar);
        }
        return zzocVarZzb;
    }
}

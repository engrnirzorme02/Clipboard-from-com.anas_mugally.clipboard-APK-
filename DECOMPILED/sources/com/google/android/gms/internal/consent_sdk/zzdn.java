package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdn implements zzdr {
    private static final Object zza = new Object();
    private volatile zzdr zzb;
    private volatile Object zzc = zza;

    private zzdn(zzdr zzdrVar) {
        this.zzb = zzdrVar;
    }

    public static zzdr zzb(zzdr zzdrVar) {
        return zzdrVar instanceof zzdn ? zzdrVar : new zzdn(zzdrVar);
    }

    private final synchronized Object zzc() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZza = this.zzb.zza();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZza) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZza;
            this.zzb = null;
            return objZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}

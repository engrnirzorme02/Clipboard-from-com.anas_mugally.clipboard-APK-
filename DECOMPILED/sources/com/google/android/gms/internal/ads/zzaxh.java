package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxh extends zzaxl {
    public zzaxh(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", zzarwVar, i7, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        zzarw zzarwVar = this.zzd;
        zzarwVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzarwVar) {
            try {
                if (zBooleanValue) {
                    zzarwVar.zzae(2);
                } else {
                    zzarwVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawm extends zzaxl {
    public zzawm(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", zzarwVar, i7, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        zzarw zzarwVar = this.zzd;
        zzarwVar.zzd(-1L);
        zzarwVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzd(iArr[0]);
                zzarwVar.zze(iArr[1]);
                int i7 = iArr[2];
                if (i7 != Integer.MIN_VALUE) {
                    zzarwVar.zzO(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

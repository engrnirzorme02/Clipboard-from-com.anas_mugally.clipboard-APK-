package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxc extends zzaxl {
    private final boolean zzh;

    public zzaxc(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", zzarwVar, i7, 61);
        this.zzh = zzavxVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzQ(jLongValue);
        }
    }
}

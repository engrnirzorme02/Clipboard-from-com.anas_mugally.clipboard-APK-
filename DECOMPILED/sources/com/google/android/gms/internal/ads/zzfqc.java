package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqc {
    final /* synthetic */ zzfqd zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfqc(zzfqd zzfqdVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfqdVar);
        this.zza = zzfqdVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfqd zzfqdVar = this.zza;
            if (zzfqdVar.zzb) {
                zzfqg zzfqgVar = zzfqdVar.zza;
                zzfqgVar.zzg(this.zzb);
                zzfqgVar.zzh(this.zzc);
                zzfqgVar.zzi(this.zzd);
                zzfqgVar.zzf(null);
                zzfqgVar.zze();
            }
        } catch (RemoteException e7) {
            Log.d("GASS", "Clearcut log failed", e7);
        }
    }

    public final zzfqc zzb(int i7) {
        this.zzc = i7;
        return this;
    }

    public final zzfqc zzc(int i7) {
        this.zzd = i7;
        return this;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqm {
    private final zzcf[] zza;
    private final zzri zzb;
    private final zzci zzc;

    public zzqm(zzcf... zzcfVarArr) {
        zzri zzriVar = new zzri();
        zzci zzciVar = new zzci();
        zzcf[] zzcfVarArr2 = {zzriVar, zzciVar};
        this.zza = zzcfVarArr2;
        System.arraycopy(zzcfVarArr, 0, zzcfVarArr2, 0, 0);
        this.zzb = zzriVar;
        this.zzc = zzciVar;
    }

    public final zzcf[] zza() {
        return this.zza;
    }

    public final zzau zzb(zzau zzauVar) {
        zzci zzciVar = this.zzc;
        zzciVar.zzk(zzauVar.zzb);
        zzciVar.zzl(zzauVar.zzc);
        return zzauVar;
    }

    public final boolean zzc(boolean z7) {
        this.zzb.zzq(z7);
        return z7;
    }

    public final long zzd(long j7) {
        zzci zzciVar = this.zzc;
        return zzciVar.zzc() ? zzciVar.zzm(j7) : j7;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}

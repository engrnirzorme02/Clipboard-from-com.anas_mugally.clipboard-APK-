package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpg {
    public static final zzpg zza = new zzpf().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzpg(zzpf zzpfVar, byte[] bArr) {
        this.zzb = zzpfVar.zze();
        this.zzc = zzpfVar.zzf();
        this.zzd = zzpfVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpg.class == obj.getClass()) {
            zzpg zzpgVar = (zzpg) obj;
            if (this.zzb == zzpgVar.zzb && this.zzc == zzpgVar.zzc && this.zzd == zzpgVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z7 = this.zzb;
        boolean z8 = this.zzc;
        return ((z7 ? 1 : 0) << 2) + (z8 ? 1 : 0) + (z8 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}

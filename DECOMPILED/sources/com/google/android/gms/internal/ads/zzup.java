package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzup {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzup(Object obj, int i7, int i8, long j7, int i9) {
        this.zza = obj;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = j7;
        this.zze = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzup)) {
            return false;
        }
        zzup zzupVar = (zzup) obj;
        return this.zza.equals(zzupVar.zza) && this.zzb == zzupVar.zzb && this.zzc == zzupVar.zzc && this.zzd == zzupVar.zzd && this.zze == zzupVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzup zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzup(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzup(Object obj, int i7, int i8, long j7) {
        this(obj, i7, i8, j7, -1);
    }

    public zzup(Object obj, long j7) {
        this(obj, -1, -1, j7, -1);
    }

    public zzup(Object obj, long j7, int i7) {
        this(obj, -1, -1, j7, i7);
    }
}

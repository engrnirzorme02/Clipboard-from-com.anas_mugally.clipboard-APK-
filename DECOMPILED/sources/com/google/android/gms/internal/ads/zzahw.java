package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahw implements zzahs {
    private final zzef zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzahw(zzeu zzeuVar) {
        zzef zzefVar = zzeuVar.zza;
        this.zza = zzefVar;
        zzefVar.zzh(12);
        this.zzc = zzefVar.zzH() & 255;
        this.zzb = zzefVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzc() {
        int i7 = this.zzc;
        if (i7 == 8) {
            return this.zza.zzs();
        }
        if (i7 == 16) {
            return this.zza.zzt();
        }
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        if (i8 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & 240) >> 4;
    }
}

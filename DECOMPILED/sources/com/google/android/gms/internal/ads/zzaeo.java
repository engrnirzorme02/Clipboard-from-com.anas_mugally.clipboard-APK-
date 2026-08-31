package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeo implements zzaek {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeo(int i7, int i8, int i9, int i10) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    public static zzaeo zzb(zzef zzefVar) {
        int iZzC = zzefVar.zzC();
        zzefVar.zzk(8);
        int iZzC2 = zzefVar.zzC();
        int iZzC3 = zzefVar.zzC();
        zzefVar.zzk(4);
        int iZzC4 = zzefVar.zzC();
        zzefVar.zzk(12);
        return new zzaeo(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return 1751742049;
    }
}

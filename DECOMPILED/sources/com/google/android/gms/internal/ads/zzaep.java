package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzaep implements zzaek {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzaep(int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.zza = i7;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
    }

    public static zzaep zzb(zzef zzefVar) {
        int iZzC = zzefVar.zzC();
        zzefVar.zzk(12);
        int iZzC2 = zzefVar.zzC();
        int iZzC3 = zzefVar.zzC();
        int iZzC4 = zzefVar.zzC();
        zzefVar.zzk(4);
        int iZzC5 = zzefVar.zzC();
        int iZzC6 = zzefVar.zzC();
        zzefVar.zzk(4);
        return new zzaep(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzefVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i7 = this.zza;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        zzds.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i7))));
        return -1;
    }

    public final long zzd() {
        return zzeo.zzt(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }
}

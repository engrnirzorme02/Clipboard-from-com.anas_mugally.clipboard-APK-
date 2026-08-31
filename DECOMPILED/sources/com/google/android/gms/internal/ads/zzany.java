package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzany implements zzanx {
    private final zzacx zza;
    private final zzaeb zzb;
    private final zzaob zzc;
    private final zzu zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzany(zzacx zzacxVar, zzaeb zzaebVar, zzaob zzaobVar, String str, int i7) throws zzas {
        this.zza = zzacxVar;
        this.zzb = zzaebVar;
        this.zzc = zzaobVar;
        int i8 = zzaobVar.zzb * zzaobVar.zze;
        int i9 = zzaobVar.zzd;
        int i10 = i8 / 8;
        if (i9 != i10) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 28 + String.valueOf(i9).length());
            sb.append("Expected block size: ");
            sb.append(i10);
            sb.append("; got: ");
            sb.append(i9);
            throw zzas.zzb(sb.toString(), null);
        }
        int i11 = zzaobVar.zzc * i10;
        int i12 = i11 * 8;
        int iMax = Math.max(i10, i11 / 10);
        this.zze = iMax;
        zzs zzsVar = new zzs();
        zzsVar.zzl("audio/wav");
        zzsVar.zzm(str);
        zzsVar.zzh(i12);
        zzsVar.zzi(i12);
        zzsVar.zzn(iMax);
        zzsVar.zzE(zzaobVar.zzb);
        zzsVar.zzF(zzaobVar.zzc);
        zzsVar.zzG(i7);
        this.zzd = zzsVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zza(long j7) {
        this.zzf = j7;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(int i7, long j7) {
        this.zza.zzw(new zzaoe(this.zzc, 1, i7, j7));
        this.zzb.zzu(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final boolean zzc(zzacv zzacvVar, long j7) {
        int i7;
        int i8;
        long j8 = j7;
        while (j8 > 0 && (i7 = this.zzg) < (i8 = this.zze)) {
            int iZzy = this.zzb.zzy(zzacvVar, (int) Math.min(i8 - i7, j8), true);
            if (iZzy == -1) {
                j8 = 0;
            } else {
                this.zzg += iZzy;
                j8 -= (long) iZzy;
            }
        }
        zzaob zzaobVar = this.zzc;
        int i9 = this.zzg;
        int i10 = zzaobVar.zzd;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long jZzt = this.zzf + zzeo.zzt(this.zzh, 1000000L, zzaobVar.zzc, RoundingMode.DOWN);
            int i12 = i11 * i10;
            int i13 = this.zzg - i12;
            this.zzb.zzx(jZzt, 1, i12, i13, null);
            this.zzh += (long) i11;
            this.zzg = i13;
        }
        return j8 <= 0;
    }
}

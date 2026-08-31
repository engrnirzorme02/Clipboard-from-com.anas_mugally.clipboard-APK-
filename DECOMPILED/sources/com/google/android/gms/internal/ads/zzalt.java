package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalt implements zzamd {
    private final zzee zza;
    private final zzef zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaeb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzu zzl;
    private int zzm;
    private long zzn;

    public zzalt(String str, int i7, String str2) {
        zzee zzeeVar = new zzee(new byte[128], 128);
        this.zza = zzeeVar;
        this.zzb = new zzef(zzeeVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i7;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzn = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i7 = this.zzh;
            if (i7 == 0) {
                while (zzefVar.zzd() > 0) {
                    if (this.zzj) {
                        int iZzs = zzefVar.zzs();
                        if (iZzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzef zzefVar2 = this.zzb;
                            zzefVar2.zzi()[0] = 11;
                            zzefVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzs == 11;
                    } else {
                        this.zzj = zzefVar.zzs() == 11;
                    }
                }
            } else if (i7 != 1) {
                int iMin = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzz(zzefVar, iMin);
                int i8 = this.zzi + iMin;
                this.zzi = i8;
                if (i8 == this.zzm) {
                    zzghc.zzh(this.zzn != -9223372036854775807L);
                    this.zzg.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzef zzefVar3 = this.zzb;
                byte[] bArrZzi = zzefVar3.zzi();
                int iMin2 = Math.min(zzefVar.zzd(), 128 - this.zzi);
                zzefVar.zzm(bArrZzi, this.zzi, iMin2);
                int i9 = this.zzi + iMin2;
                this.zzi = i9;
                if (i9 == 128) {
                    zzee zzeeVar = this.zza;
                    zzeeVar.zzf(0);
                    zzabu zzabuVarZzc = zzabv.zzc(zzeeVar);
                    zzu zzuVar = this.zzl;
                    if (zzuVar == null || zzabuVarZzc.zzc != zzuVar.zzG || zzabuVarZzc.zzb != zzuVar.zzH || !Objects.equals(zzabuVarZzc.zza, zzuVar.zzo)) {
                        zzs zzsVar = new zzs();
                        zzsVar.zza(this.zzf);
                        zzsVar.zzl(this.zze);
                        String str = zzabuVarZzc.zza;
                        zzsVar.zzm(str);
                        zzsVar.zzE(zzabuVarZzc.zzc);
                        zzsVar.zzF(zzabuVarZzc.zzb);
                        zzsVar.zze(this.zzc);
                        zzsVar.zzg(this.zzd);
                        int i10 = zzabuVarZzc.zzf;
                        zzsVar.zzi(i10);
                        if ("audio/ac3".equals(str)) {
                            zzsVar.zzh(i10);
                        }
                        zzu zzuVarZzM = zzsVar.zzM();
                        this.zzl = zzuVarZzM;
                        this.zzg.zzu(zzuVarZzM);
                    }
                    this.zzm = zzabuVarZzc.zzd;
                    this.zzk = (((long) zzabuVarZzc.zze) * 1000000) / ((long) this.zzl.zzH);
                    zzefVar3.zzh(0);
                    this.zzg.zzz(zzefVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
    }
}

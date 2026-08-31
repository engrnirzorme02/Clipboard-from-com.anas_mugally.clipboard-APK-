package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamm implements zzamd {
    private final zzang zza;
    private String zzb;
    private zzaeb zzc;
    private zzaml zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamu zzg = new zzamu(32, 128);
    private final zzamu zzh = new zzamu(33, 128);
    private final zzamu zzi = new zzamu(34, 128);
    private final zzamu zzj = new zzamu(39, 128);
    private final zzamu zzk = new zzamu(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzef zzn = new zzef();

    public zzamm(zzang zzangVar, String str) {
        this.zza = zzangVar;
    }

    private final void zzf(long j7, int i7, int i8, long j8) {
        this.zzd.zzb(j7, i7, i8, j8, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i8);
            this.zzh.zzc(i8);
            this.zzi.zzc(i8);
        }
        this.zzj.zzc(i8);
        this.zzk.zzc(i8);
    }

    private final void zzg(byte[] bArr, int i7, int i8) {
        this.zzd.zzc(bArr, i7, i8);
        if (!this.zze) {
            this.zzg.zzd(bArr, i7, i8);
            this.zzh.zzd(bArr, i7, i8);
            this.zzi.zzd(bArr, i7, i8);
        }
        this.zzj.zzd(bArr, i7, i8);
        this.zzk.zzd(bArr, i7, i8);
    }

    private final void zzh(long j7, int i7, int i8, long j8) {
        this.zzd.zzd(j7, i7, this.zze);
        if (!this.zze) {
            zzamu zzamuVar = this.zzg;
            zzamuVar.zze(i8);
            zzamu zzamuVar2 = this.zzh;
            zzamuVar2.zze(i8);
            zzamu zzamuVar3 = this.zzi;
            zzamuVar3.zze(i8);
            if (zzamuVar.zzb() && zzamuVar2.zzb() && zzamuVar3.zzb()) {
                String str = this.zzb;
                int i9 = zzamuVar.zzb;
                byte[] bArr = new byte[zzamuVar2.zzb + i9 + zzamuVar3.zzb];
                System.arraycopy(zzamuVar.zza, 0, bArr, 0, i9);
                System.arraycopy(zzamuVar2.zza, 0, bArr, zzamuVar.zzb, zzamuVar2.zzb);
                System.arraycopy(zzamuVar3.zza, 0, bArr, zzamuVar.zzb + zzamuVar2.zzb, zzamuVar3.zzb);
                String strZzc = null;
                zzff zzffVarZzf = zzfl.zzf(zzamuVar2.zza, 3, zzamuVar2.zzb, null);
                zzfa zzfaVar = zzffVarZzf.zzb;
                if (zzfaVar != null) {
                    int i10 = zzfaVar.zzf;
                    int[] iArr = zzfaVar.zze;
                    int i11 = zzfaVar.zzd;
                    strZzc = zzdc.zzc(zzfaVar.zza, zzfaVar.zzb, zzfaVar.zzc, i11, iArr, i10);
                }
                zzs zzsVar = new zzs();
                zzsVar.zza(str);
                zzsVar.zzl("video/mp2t");
                zzsVar.zzm("video/hevc");
                zzsVar.zzj(strZzc);
                zzsVar.zzt(zzffVarZzf.zze);
                zzsVar.zzu(zzffVarZzf.zzf);
                zzsVar.zzv(zzffVarZzf.zzg);
                zzsVar.zzw(zzffVarZzf.zzh);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzffVarZzf.zzk);
                zzgVar.zzb(zzffVarZzf.zzl);
                zzgVar.zzc(zzffVarZzf.zzm);
                zzgVar.zze(zzffVarZzf.zzc + 8);
                zzgVar.zzf(zzffVarZzf.zzd + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzffVarZzf.zzi);
                zzsVar.zzo(zzffVarZzf.zzj);
                zzsVar.zzD(zzffVarZzf.zza + 1);
                zzsVar.zzp(Collections.singletonList(bArr));
                zzu zzuVarZzM = zzsVar.zzM();
                this.zzc.zzu(zzuVarZzM);
                int i12 = zzuVarZzM.zzq;
                zzghc.zzh(i12 != -1);
                this.zza.zzb(i12);
                this.zze = true;
            }
        }
        zzamu zzamuVar4 = this.zzj;
        if (zzamuVar4.zze(i8)) {
            int iZza = zzfl.zza(zzamuVar4.zza, zzamuVar4.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar4.zza, iZza);
            zzefVar.zzk(5);
            this.zza.zzc(j8, zzefVar);
        }
        zzamu zzamuVar5 = this.zzk;
        if (zzamuVar5.zze(i8)) {
            int iZza2 = zzfl.zza(zzamuVar5.zza, zzamuVar5.zzb);
            zzef zzefVar2 = this.zzn;
            zzefVar2.zzb(zzamuVar5.zza, iZza2);
            zzefVar2.zzk(5);
            this.zza.zzc(j8, zzefVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfl.zzi(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaml zzamlVar = this.zzd;
        if (zzamlVar != null) {
            zzamlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzb = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzc = zzaebVarZzu;
        this.zzd = new zzaml(zzaebVarZzu);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzm = j7;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        int i7;
        int i8;
        this.zzc.getClass();
        String str = zzeo.zza;
        while (zzefVar.zzd() > 0) {
            int iZzg = zzefVar.zzg();
            int iZze = zzefVar.zze();
            byte[] bArrZzi = zzefVar.zzi();
            this.zzl += (long) zzefVar.zzd();
            this.zzc.zzz(zzefVar, zzefVar.zzd());
            while (iZzg < iZze) {
                int iZzh = zzfl.zzh(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzh == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i9 = bArrZzi[iZzh + 3] & 126;
                if (iZzh > 0) {
                    int i10 = iZzh - 1;
                    if (bArrZzi[i10] == 0) {
                        i8 = 4;
                        i7 = i10;
                    } else {
                        i7 = iZzh;
                        i8 = 3;
                    }
                } else {
                    i7 = iZzh;
                    i8 = 3;
                }
                int i11 = i7 - iZzg;
                if (i11 > 0) {
                    zzg(bArrZzi, iZzg, i7);
                }
                int i12 = iZze - i7;
                long j7 = this.zzl - ((long) i12);
                zzh(j7, i12, i11 < 0 ? -i11 : 0, this.zzm);
                zzf(j7, i12, i9 >> 1, this.zzm);
                iZzg = i7 + i8;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
        this.zzc.getClass();
        String str = zzeo.zza;
        if (z7) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}

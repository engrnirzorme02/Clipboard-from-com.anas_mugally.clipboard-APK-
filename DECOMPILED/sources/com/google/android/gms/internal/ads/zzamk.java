package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamk implements zzamd {
    private final zzang zza;
    private long zzf;
    private String zzh;
    private zzaeb zzi;
    private zzamj zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzamu zzc = new zzamu(7, 128);
    private final zzamu zzd = new zzamu(8, 128);
    private final zzamu zze = new zzamu(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzef zzn = new zzef();

    public zzamk(zzang zzangVar, boolean z7, boolean z8, String str) {
        this.zza = zzangVar;
    }

    private final void zzf(long j7, int i7, long j8) {
        if (!this.zzk) {
            this.zzc.zzc(i7);
            this.zzd.zzc(i7);
        }
        this.zze.zzc(i7);
        this.zzj.zzd(j7, i7, j8, this.zzm);
    }

    private final void zzg(byte[] bArr, int i7, int i8) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i7, i8);
            this.zzd.zzd(bArr, i7, i8);
        }
        this.zze.zzd(bArr, i7, i8);
    }

    private final void zzh(long j7, int i7, int i8, long j8) {
        if (!this.zzk) {
            zzamu zzamuVar = this.zzc;
            zzamuVar.zze(i8);
            zzamu zzamuVar2 = this.zzd;
            zzamuVar2.zze(i8);
            if (this.zzk) {
                if (zzamuVar.zzb()) {
                    zzfk zzfkVarZzd = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                    this.zza.zzb(zzfkVarZzd.zzm);
                    this.zzj.zza(zzfkVarZzd);
                    zzamuVar.zza();
                } else if (zzamuVar2.zzb()) {
                    this.zzj.zzb(zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb));
                    zzamuVar2.zza();
                }
            } else if (zzamuVar.zzb() && zzamuVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzamuVar.zza, zzamuVar.zzb));
                arrayList.add(Arrays.copyOf(zzamuVar2.zza, zzamuVar2.zzb));
                zzfk zzfkVarZzd2 = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                zzfj zzfjVarZzg = zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb);
                String strZzb = zzdc.zzb(zzfkVarZzd2.zza, zzfkVarZzd2.zzb, zzfkVarZzd2.zzc);
                zzaeb zzaebVar = this.zzi;
                zzs zzsVar = new zzs();
                zzsVar.zza(this.zzh);
                zzsVar.zzl(this.zzb);
                zzsVar.zzm("video/avc");
                zzsVar.zzj(strZzb);
                zzsVar.zzt(zzfkVarZzd2.zze);
                zzsVar.zzu(zzfkVarZzd2.zzf);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzfkVarZzd2.zzj);
                zzgVar.zzb(zzfkVarZzd2.zzk);
                zzgVar.zzc(zzfkVarZzd2.zzl);
                zzgVar.zze(zzfkVarZzd2.zzh + 8);
                zzgVar.zzf(zzfkVarZzd2.zzi + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzfkVarZzd2.zzg);
                zzsVar.zzp(arrayList);
                int i9 = zzfkVarZzd2.zzm;
                zzsVar.zzo(i9);
                zzaebVar.zzu(zzsVar.zzM());
                this.zzk = true;
                this.zza.zzb(i9);
                this.zzj.zza(zzfkVarZzd2);
                this.zzj.zzb(zzfjVarZzg);
                zzamuVar.zza();
                zzamuVar2.zza();
            }
        }
        zzamu zzamuVar3 = this.zze;
        if (zzamuVar3.zze(i8)) {
            int iZza = zzfl.zza(zzamuVar3.zza, zzamuVar3.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar3.zza, iZza);
            zzefVar.zzh(4);
            this.zza.zzc(j8, zzefVar);
        }
        if (this.zzj.zze(j7, i7, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfl.zzi(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzamj zzamjVar = this.zzj;
        if (zzamjVar != null) {
            zzamjVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzi = zzaebVarZzu;
        this.zzj = new zzamj(zzaebVarZzu, false, false);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzl = j7;
        int i8 = i7 & 2;
        this.zzm = (i8 != 0) | this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        int i7;
        int i8;
        this.zzi.getClass();
        String str = zzeo.zza;
        int iZzg = zzefVar.zzg();
        int iZze = zzefVar.zze();
        byte[] bArrZzi = zzefVar.zzi();
        this.zzf += (long) zzefVar.zzd();
        this.zzi.zzz(zzefVar, zzefVar.zzd());
        while (true) {
            int iZzh = zzfl.zzh(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzh == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i9 = bArrZzi[iZzh + 3] & 31;
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
            long j7 = this.zzf - ((long) i12);
            zzh(j7, i12, i11 < 0 ? -i11 : 0, this.zzl);
            zzf(j7, i9, this.zzl);
            iZzg = i7 + i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
        this.zzi.getClass();
        String str = zzeo.zza;
        if (z7) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}

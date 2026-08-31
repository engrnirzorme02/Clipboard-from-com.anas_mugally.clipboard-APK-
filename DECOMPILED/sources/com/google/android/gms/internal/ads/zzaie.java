package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaie {
    public final zzaeb zza;
    public zzaiv zzd;
    public zzahz zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzu zzj;
    private boolean zzm;
    public final zzaiu zzb = new zzaiu();
    public final zzef zzc = new zzef();
    private final zzef zzk = new zzef(1);
    private final zzef zzl = new zzef();

    public zzaie(zzaeb zzaebVar, zzaiv zzaivVar, zzahz zzahzVar, zzu zzuVar) {
        this.zza = zzaebVar;
        this.zzd = zzaivVar;
        this.zze = zzahzVar;
        this.zzj = zzuVar;
        zza(zzaivVar, zzahzVar);
    }

    public final void zza(zzaiv zzaivVar, zzahz zzahzVar) {
        this.zzd = zzaivVar;
        this.zze = zzahzVar;
        this.zza.zzu(this.zzj);
        zzc();
    }

    public final void zzb(zzp zzpVar) {
        zzais zzaisVar = this.zzd.zza;
        zzahz zzahzVar = this.zzb.zza;
        String str = zzeo.zza;
        zzait zzaitVarZza = zzaisVar.zza(zzahzVar.zza);
        zzp zzpVarZzb = zzpVar.zzb(zzaitVarZza != null ? zzaitVarZza.zzb : null);
        zzs zzsVarZza = this.zzj.zza();
        zzsVarZza.zzq(zzpVarZzb);
        this.zza.zzu(zzsVarZza.zzM());
    }

    public final void zzc() {
        zzaiu zzaiuVar = this.zzb;
        zzaiuVar.zzd = 0;
        zzaiuVar.zzp = 0L;
        zzaiuVar.zzq = false;
        zzaiuVar.zzk = false;
        zzaiuVar.zzo = false;
        zzaiuVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzaiu zzaiuVar = this.zzb;
        return zzaiuVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i7;
        if (this.zzm) {
            i7 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i7 = this.zzd.zzg[this.zzf];
        }
        return zzj() != null ? i7 | 1073741824 : i7;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i7 = this.zzg + 1;
        this.zzg = i7;
        int[] iArr = this.zzb.zzg;
        int i8 = this.zzh;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.zzh = i8 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i7, int i8) {
        zzef zzefVar;
        zzait zzaitVarZzj = zzj();
        if (zzaitVarZzj == null) {
            return 0;
        }
        int i9 = zzaitVarZzj.zzd;
        if (i9 != 0) {
            zzefVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzaitVarZzj.zze;
            String str = zzeo.zza;
            zzef zzefVar2 = this.zzl;
            int length = bArr.length;
            zzefVar2.zzb(bArr, length);
            zzefVar = zzefVar2;
            i9 = length;
        }
        zzaiu zzaiuVar = this.zzb;
        boolean zZzb = zzaiuVar.zzb(this.zzf);
        boolean z7 = zZzb || i8 != 0;
        zzef zzefVar3 = this.zzk;
        zzefVar3.zzi()[0] = (byte) ((true != z7 ? 0 : 128) | i9);
        zzefVar3.zzh(0);
        zzaeb zzaebVar = this.zza;
        zzaebVar.zzw(zzefVar3, 1, 1);
        zzaebVar.zzw(zzefVar, i9, 1);
        if (!z7) {
            return i9 + 1;
        }
        if (!zZzb) {
            zzef zzefVar4 = this.zzc;
            zzefVar4.zza(8);
            byte[] bArrZzi = zzefVar4.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i8;
            bArrZzi[4] = (byte) ((i7 >> 24) & 255);
            bArrZzi[5] = (byte) ((i7 >> 16) & 255);
            bArrZzi[6] = (byte) ((i7 >> 8) & 255);
            bArrZzi[7] = (byte) (i7 & 255);
            zzaebVar.zzw(zzefVar4, 8, 1);
            return i9 + 9;
        }
        int i10 = i9 + 1;
        zzef zzefVar5 = zzaiuVar.zzn;
        int iZzt = zzefVar5.zzt();
        zzefVar5.zzk(-2);
        int i11 = (iZzt * 6) + 2;
        if (i8 != 0) {
            zzef zzefVar6 = this.zzc;
            zzefVar6.zza(i11);
            byte[] bArrZzi2 = zzefVar6.zzi();
            zzefVar5.zzm(bArrZzi2, 0, i11);
            int i12 = (((bArrZzi2[2] & 255) << 8) | (bArrZzi2[3] & 255)) + i8;
            bArrZzi2[2] = (byte) ((i12 >> 8) & 255);
            bArrZzi2[3] = (byte) (i12 & 255);
            zzefVar5 = zzefVar6;
        }
        zzaebVar.zzw(zzefVar5, i11, 1);
        return i10 + i11;
    }

    public final zzait zzj() {
        if (!this.zzm) {
            return null;
        }
        zzaiu zzaiuVar = this.zzb;
        zzahz zzahzVar = zzaiuVar.zza;
        String str = zzeo.zza;
        int i7 = zzahzVar.zza;
        zzait zzaitVarZza = zzaiuVar.zzm;
        if (zzaitVarZza == null) {
            zzaitVarZza = this.zzd.zza.zza(i7);
        }
        if (zzaitVarZza == null || !zzaitVarZza.zza) {
            return null;
        }
        return zzaitVarZza;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    final /* synthetic */ void zzl(boolean z7) {
        this.zzm = true;
    }
}

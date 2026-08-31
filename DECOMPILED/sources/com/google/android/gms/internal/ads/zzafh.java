package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzafh extends zzafg {
    private final zzef zzb;
    private final zzef zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafh(zzaeb zzaebVar) {
        super(zzaebVar);
        this.zzb = new zzef(zzfl.zza);
        this.zzc = new zzef(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzef zzefVar) throws zzaff {
        int iZzs = zzefVar.zzs();
        int i7 = iZzs >> 4;
        int i8 = iZzs & 15;
        if (i8 == 7) {
            this.zzg = i7;
            return i7 != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i8);
        throw new zzaff(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzef zzefVar, long j7) throws zzas {
        int i7;
        int iZzs = zzefVar.zzs();
        long jZzy = zzefVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzef zzefVar2 = new zzef(new byte[zzefVar.zzd()]);
                zzefVar.zzm(zzefVar2.zzi(), 0, zzefVar.zzd());
                zzabz zzabzVarZza = zzabz.zza(zzefVar2);
                this.zzd = zzabzVarZza.zzb;
                zzs zzsVar = new zzs();
                zzsVar.zzl("video/x-flv");
                zzsVar.zzm("video/avc");
                zzsVar.zzj(zzabzVarZza.zzl);
                zzsVar.zzt(zzabzVarZza.zzc);
                zzsVar.zzu(zzabzVarZza.zzd);
                zzsVar.zzz(zzabzVarZza.zzk);
                zzsVar.zzp(zzabzVarZza.zza);
                this.zza.zzu(zzsVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i8 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i7 = i8;
            } else if (i8 != 0) {
                i7 = 1;
            }
            zzef zzefVar3 = this.zzc;
            byte[] bArrZzi = zzefVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i9 = 4 - this.zzd;
            int i10 = 0;
            while (zzefVar.zzd() > 0) {
                zzefVar.zzm(zzefVar3.zzi(), i9, this.zzd);
                zzefVar3.zzh(0);
                zzef zzefVar4 = this.zzb;
                int iZzH = zzefVar3.zzH();
                zzefVar4.zzh(0);
                zzaeb zzaebVar = this.zza;
                zzaebVar.zzz(zzefVar4, 4);
                zzaebVar.zzz(zzefVar, iZzH);
                i10 = i10 + 4 + iZzH;
            }
            this.zza.zzx(j7 + (jZzy * 1000), i7, i10, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}

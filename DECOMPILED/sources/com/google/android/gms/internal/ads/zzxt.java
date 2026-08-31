package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzxt extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzxt(int i7, zzbf zzbfVar, int i8, zzxo zzxoVar, int i9, String str, String str2) {
        int iZzj;
        super(i7, zzbfVar, i8);
        int i10 = 0;
        this.zzf = zzln.zzZ(i9, false);
        int i11 = this.zzd.zze;
        int i12 = zzxoVar.zzC;
        this.zzg = 1 == (i11 & 1);
        this.zzh = (i11 & 2) != 0;
        zzgjz zzgjzVarZzj = str2 != null ? zzgjz.zzj(str2) : zzxoVar.zzy.isEmpty() ? zzgjz.zzj("") : zzxoVar.zzy;
        int i13 = 0;
        while (true) {
            if (i13 >= zzgjzVarZzj.size()) {
                iZzj = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyd.zzj(this.zzd, (String) zzgjzVarZzj.get(i13), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.zzi = i13;
        this.zzj = iZzj;
        int iZzm = zzyd.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzu zzuVar = this.zzd;
        this.zzn = (1088 & zzuVar.zzf) != 0;
        int iZzn = zzyd.zzn(zzuVar, zzxoVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z7 = iZzj > 0 || (zzxoVar.zzy.isEmpty() && iZzm > 0) || ((zzxoVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (zzln.zzZ(i9, zzxoVar.zzV) && z7) {
            i10 = 1;
        }
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxt zzxtVar) {
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(this.zzf, zzxtVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzxtVar.zzi), zzglj.zzb().zza());
        int i7 = this.zzj;
        zzgjp zzgjpVarZzb = zzgjpVarZza.zzb(i7, zzxtVar.zzj);
        int i8 = this.zzk;
        zzgjp zzgjpVarZzb2 = zzgjpVarZzb.zzb(i8, zzxtVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzxtVar.zzl), zzglj.zzb().zza()).zzd(this.zzg, zzxtVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxtVar.zzh), i7 == 0 ? zzglj.zzb() : zzglj.zzb().zza()).zzb(this.zzm, zzxtVar.zzm);
        if (i8 == 0) {
            zzgjpVarZzb2 = zzgjpVarZzb2.zzc(this.zzn, zzxtVar.zzn);
        }
        return zzgjpVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        return false;
    }
}

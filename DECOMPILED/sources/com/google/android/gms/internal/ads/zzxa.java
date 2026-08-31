package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.C3553a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzxa extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxo zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    public zzxa(int i7, zzbf zzbfVar, int i8, zzxo zzxoVar, int i9, boolean z7, zzghd zzghdVar, int i10) {
        int i11;
        int iZzj;
        byte b7;
        boolean z8;
        int iZzj2;
        boolean z9;
        super(i7, zzbfVar, i8);
        this.zzh = zzxoVar;
        int i12 = 1;
        int i13 = true != zzxoVar.zzT ? 16 : 24;
        this.zzg = zzyd.zzi(this.zzd.zzd);
        this.zzi = zzln.zzZ(i9, false);
        int i14 = 0;
        while (true) {
            int size = zzxoVar.zzq.size();
            i11 = C3553a.e.API_PRIORITY_OTHER;
            if (i14 >= size) {
                iZzj = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyd.zzj(this.zzd, (String) zzxoVar.zzq.get(i14), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = iZzj;
        this.zzl = zzyd.zzm(this.zzd.zzf, 0);
        this.zzm = zzyd.zzn(this.zzd, zzxoVar.zzr);
        zzu zzuVar = this.zzd;
        int i15 = zzuVar.zzf;
        this.zzn = i15 == 0 || (i15 & 1) != 0;
        this.zzq = 1 == (zzuVar.zze & 1);
        String str = zzuVar.zzo;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
            if (b7 == 0 || b7 == 1 || b7 == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        this.zzx = z8;
        int i16 = zzuVar.zzG;
        this.zzr = i16;
        this.zzs = zzuVar.zzH;
        int i17 = zzuVar.zzj;
        this.zzt = i17;
        this.zzf = (i17 == -1 || i17 <= zzxoVar.zzu) && (i16 == -1 || i16 <= zzxoVar.zzt) && zzghdVar.zza(zzuVar);
        String str2 = zzeo.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = zzeo.zzh(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                iZzj2 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzyd.zzj(this.zzd, strArrSplit[i19], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.zzo = i19;
        this.zzp = iZzj2;
        for (int i20 = 0; i20 < zzxoVar.zzv.size(); i20++) {
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzxoVar.zzv.get(i20))) {
                i11 = i20;
                break;
            }
        }
        this.zzu = i11;
        this.zzv = (i9 & 384) == 128;
        this.zzw = (i9 & 64) == 64;
        zzxo zzxoVar2 = this.zzh;
        if (zzln.zzZ(i9, zzxoVar2.zzV) && ((z9 = this.zzf) || zzxoVar2.zzO)) {
            int i21 = zzxoVar2.zzw.zzb;
            if (zzln.zzZ(i9, false) && z9 && this.zzd.zzj != -1 && ((zzxoVar2.zzX || !z7) && (i13 & i9) != 0)) {
                i12 = 2;
            }
        } else {
            i12 = 0;
        }
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxa zzxaVar) {
        boolean z7 = this.zzf;
        zzglj zzgljVarZza = (z7 && this.zzi) ? zzyd.zzc : zzyd.zzc.zza();
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(this.zzi, zzxaVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzxaVar.zzk), zzglj.zzb().zza()).zzb(this.zzj, zzxaVar.zzj).zzb(this.zzl, zzxaVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzxaVar.zzm), zzglj.zzb().zza()).zzd(this.zzq, zzxaVar.zzq).zzd(this.zzn, zzxaVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzxaVar.zzo), zzglj.zzb().zza()).zzb(this.zzp, zzxaVar.zzp).zzd(z7, zzxaVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzxaVar.zzu), zzglj.zzb().zza());
        boolean z8 = this.zzh.zzF;
        zzgjp zzgjpVarZza2 = zzgjpVarZza.zzd(this.zzv, zzxaVar.zzv).zzd(this.zzw, zzxaVar.zzw).zzd(this.zzx, zzxaVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzxaVar.zzr), zzgljVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzxaVar.zzs), zzgljVarZza);
        if (Objects.equals(this.zzg, zzxaVar.zzg)) {
            zzgjpVarZza2 = zzgjpVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzxaVar.zzt), zzgljVarZza);
        }
        return zzgjpVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        String str;
        int i7;
        zzxa zzxaVar = (zzxa) zzxvVar;
        boolean z7 = this.zzh.zzR;
        zzu zzuVar = this.zzd;
        int i8 = zzuVar.zzG;
        if (i8 == -1) {
            return false;
        }
        zzu zzuVar2 = zzxaVar.zzd;
        return i8 == zzuVar2.zzG && (str = zzuVar.zzo) != null && TextUtils.equals(str, zzuVar2.zzo) && (i7 = zzuVar.zzH) != -1 && i7 == zzuVar2.zzH && this.zzv == zzxaVar.zzv && this.zzw == zzxaVar.zzw;
    }
}

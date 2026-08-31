package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzyc extends zzxv {
    private final boolean zze;
    private final zzxo zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Code duplicated, block: B:120:0x017e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    public zzyc(int i7, zzbf zzbfVar, int i8, zzxo zzxoVar, int i9, String str, int i10, boolean z7) {
        boolean z8;
        boolean z9;
        int i11;
        int iZzj;
        int i12;
        byte b7;
        boolean z10;
        zzu zzuVar;
        int i13;
        int i14;
        int i15;
        zzu zzuVar2;
        int i16;
        int i17;
        int i18;
        super(i7, zzbfVar, i8);
        this.zzf = zzxoVar;
        int i19 = 1;
        int i20 = true != zzxoVar.zzM ? 16 : 24;
        if (!z7 || (((i16 = (zzuVar2 = this.zzd).zzv) != -1 && i16 > zzxoVar.zza) || ((i17 = zzuVar2.zzw) != -1 && i17 > zzxoVar.zzb))) {
            z8 = false;
        } else {
            float f7 = zzuVar2.zzz;
            if ((f7 == -1.0f || f7 <= zzxoVar.zzc) && ((i18 = zzuVar2.zzj) == -1 || i18 <= zzxoVar.zzd)) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        this.zze = z8;
        if (!z7 || (((i13 = (zzuVar = this.zzd).zzv) != -1 && i13 < 0) || ((i14 = zzuVar.zzw) != -1 && i14 < 0))) {
            z9 = false;
        } else {
            float f8 = zzuVar.zzz;
            if ((f8 == -1.0f || f8 >= 0.0f) && ((i15 = zzuVar.zzj) == -1 || i15 >= 0)) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        this.zzg = z9;
        this.zzh = zzln.zzZ(i9, false);
        zzu zzuVar3 = this.zzd;
        float f9 = zzuVar3.zzz;
        this.zzi = f9 != -1.0f && f9 >= 10.0f;
        this.zzj = zzuVar3.zzj;
        this.zzk = zzuVar3.zzc();
        int i21 = 0;
        while (true) {
            int size = zzxoVar.zzo.size();
            i11 = C3553a.e.API_PRIORITY_OTHER;
            if (i21 >= size) {
                iZzj = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyd.zzj(this.zzd, (String) zzxoVar.zzo.get(i21), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.zzm = i21;
        this.zzn = iZzj;
        this.zzo = zzyd.zzm(this.zzd.zzf, 0);
        int i22 = this.zzd.zzf;
        this.zzq = i22 == 0 || (i22 & 1) != 0;
        this.zzr = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
        for (int i23 = 0; i23 < zzxoVar.zzm.size(); i23++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxoVar.zzm.get(i23))) {
                i11 = i23;
                break;
            }
        }
        this.zzl = i11;
        this.zzp = zzyd.zzn(this.zzd, zzxoVar.zzn);
        this.zzt = (i9 & 384) == 128;
        this.zzu = (i9 & 64) == 64;
        zzu zzuVar4 = this.zzd;
        String str3 = zzuVar4.zzo;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b7 = 0;
                    break;
                case "video/av01":
                    b7 = 1;
                    break;
                case "video/hevc":
                    b7 = 2;
                    break;
                case "video/avc":
                    b7 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                i12 = 5;
            } else if (b7 != 1) {
                if (b7 == 2) {
                    i12 = 3;
                } else if (b7 == 3) {
                    i12 = 2;
                } else if (b7 != 4) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
            }
        }
        this.zzv = i12;
        if ((zzuVar4.zzf & 16384) != 0) {
            i19 = 0;
        } else {
            zzxo zzxoVar2 = this.zzf;
            if (!zzln.zzZ(i9, zzxoVar2.zzV) || (!(z10 = this.zze) && !zzxoVar2.zzK)) {
                i19 = 0;
            } else if (zzln.zzZ(i9, false) && this.zzg && z10 && zzuVar4.zzj != -1 && (i20 & i9) != 0) {
                i19 = 2;
            }
        }
        this.zzs = i19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzyc zzycVar, zzyc zzycVar2) {
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(zzycVar.zzh, zzycVar2.zzh).zza(Integer.valueOf(zzycVar.zzm), Integer.valueOf(zzycVar2.zzm), zzglj.zzb().zza()).zzb(zzycVar.zzn, zzycVar2.zzn).zzb(zzycVar.zzo, zzycVar2.zzo).zza(Integer.valueOf(zzycVar.zzp), Integer.valueOf(zzycVar2.zzp), zzglj.zzb().zza()).zzd(zzycVar.zzq, zzycVar2.zzq).zzb(zzycVar.zzr, zzycVar2.zzr).zzd(zzycVar.zzi, zzycVar2.zzi).zzd(zzycVar.zze, zzycVar2.zze).zzd(zzycVar.zzg, zzycVar2.zzg).zza(Integer.valueOf(zzycVar.zzl), Integer.valueOf(zzycVar2.zzl), zzglj.zzb().zza());
        boolean z7 = zzycVar.zzt;
        zzgjp zzgjpVarZzd = zzgjpVarZza.zzd(z7, zzycVar2.zzt);
        boolean z8 = zzycVar.zzu;
        zzgjp zzgjpVarZzd2 = zzgjpVarZzd.zzd(z8, zzycVar2.zzu);
        if (z7 && z8) {
            zzgjpVarZzd2 = zzgjpVarZzd2.zzb(zzycVar.zzv, zzycVar2.zzv);
        }
        return zzgjpVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzyc zzycVar, zzyc zzycVar2) {
        zzglj zzgljVarZza = (zzycVar.zze && zzycVar.zzh) ? zzyd.zzc : zzyd.zzc.zza();
        zzgjp zzgjpVarZzg = zzgjp.zzg();
        boolean z7 = zzycVar.zzf.zzF;
        return zzgjpVarZzg.zza(Integer.valueOf(zzycVar.zzk), Integer.valueOf(zzycVar2.zzk), zzgljVarZza).zza(Integer.valueOf(zzycVar.zzj), Integer.valueOf(zzycVar2.zzj), zzgljVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        zzyc zzycVar = (zzyc) zzxvVar;
        if (!Objects.equals(this.zzd.zzo, zzycVar.zzd.zzo)) {
            return false;
        }
        boolean z7 = this.zzf.zzN;
        return this.zzt == zzycVar.zzt && this.zzu == zzycVar.zzu;
    }
}

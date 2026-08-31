package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzhht extends zzhhs {
    zzhht() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhs
    final void zza(Object obj) {
        ((zzhid) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhhs
    final void zzb(zzhlk zzhlkVar, Map.Entry entry) {
        zzhie zzhieVar = (zzhie) entry.getKey();
        if (!zzhieVar.zzc) {
            zzhli zzhliVar = zzhli.zza;
            switch (zzhieVar.zzb.ordinal()) {
                case 0:
                    zzhlkVar.zzf(zzhieVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzhlkVar.zze(zzhieVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzhlkVar.zzc(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzhlkVar.zzh(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzhlkVar.zzi(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzhlkVar.zzj(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzhlkVar.zzk(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzhlkVar.zzl(zzhieVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzhlkVar.zzm(zzhieVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzhlkVar.zzs(zzhieVar.zza, entry.getValue(), zzhkc.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzhlkVar.zzr(zzhieVar.zza, entry.getValue(), zzhkc.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzhlkVar.zzn(zzhieVar.zza, (zzhhb) entry.getValue());
                    break;
                case 12:
                    zzhlkVar.zzo(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzhlkVar.zzi(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzhlkVar.zzb(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzhlkVar.zzd(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzhlkVar.zzp(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzhlkVar.zzq(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhli zzhliVar2 = zzhli.zza;
        switch (zzhieVar.zzb.ordinal()) {
            case 0:
                zzhkm.zza(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 1:
                zzhkm.zzb(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 2:
                zzhkm.zzc(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 3:
                zzhkm.zzd(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 4:
                zzhkm.zzh(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 5:
                zzhkm.zzf(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 6:
                zzhkm.zzk(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 7:
                zzhkm.zzn(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 8:
                zzhkm.zzo(zzhieVar.zza, (List) entry.getValue(), zzhlkVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhkm.zzr(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhkc.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhkm.zzq(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhkc.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzhkm.zzp(zzhieVar.zza, (List) entry.getValue(), zzhlkVar);
                break;
            case 12:
                zzhkm.zzi(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 13:
                zzhkm.zzh(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 14:
                zzhkm.zzl(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 15:
                zzhkm.zzg(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 16:
                zzhkm.zzj(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case 17:
                zzhkm.zze(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
        }
    }
}

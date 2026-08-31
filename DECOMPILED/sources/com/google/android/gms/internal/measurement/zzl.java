package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends zzal {
    private final zzab zzb;

    public zzl(zzab zzabVar) {
        this.zzb = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        byte b7;
        switch (str) {
            case "getEventName":
                b7 = 0;
                break;
            case "getTimestamp":
                b7 = 3;
                break;
            case "getParamValue":
                b7 = 1;
                break;
            case "getParams":
                b7 = 2;
                break;
            case "setParamValue":
                b7 = 5;
                break;
            case "setEventName":
                b7 = 4;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0) {
            zzh.zza("getEventName", 0, list);
            return new zzas(this.zzb.zzc().zzb());
        }
        if (b7 == 1) {
            zzh.zza("getParamValue", 1, list);
            return zzi.zza(this.zzb.zzc().zze(zzgVar.zza((zzao) list.get(0)).zzc()));
        }
        if (b7 == 2) {
            zzh.zza("getParams", 0, list);
            Map mapZzf = this.zzb.zzc().zzf();
            zzal zzalVar = new zzal();
            for (String str2 : mapZzf.keySet()) {
                zzalVar.zzm(str2, zzi.zza(mapZzf.get(str2)));
            }
            return zzalVar;
        }
        if (b7 == 3) {
            zzh.zza("getTimestamp", 0, list);
            return new zzah(Double.valueOf(this.zzb.zzc().zza()));
        }
        if (b7 != 4) {
            if (b7 != 5) {
                return super.zzcA(str, zzgVar, list);
            }
            zzh.zza("setParamValue", 2, list);
            String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(1));
            this.zzb.zzc().zzd(strZzc, zzh.zzj(zzaoVarZza));
            return zzaoVarZza;
        }
        zzh.zza("setEventName", 1, list);
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
        if (zzao.zzf.equals(zzaoVarZza2) || zzao.zzg.equals(zzaoVarZza2)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.zzb.zzc().zzc(zzaoVarZza2.zzc());
        return new zzas(zzaoVarZza2.zzc());
    }
}

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z7, boolean z8) {
        super("log");
        Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z7;
        this.zzb = z8;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        int i7;
        int i8;
        String strZzc;
        ArrayList arrayList;
        zzh.zzb("log", 1, list);
        if (list.size() == 1) {
            zzt zztVar = this.zzc;
            zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzao.zzf;
        }
        int iZzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
        if (iZzg != 2) {
            i7 = 3;
            if (iZzg == 3) {
                i8 = 1;
            } else if (iZzg == 5) {
                i8 = 5;
            } else if (iZzg == 6) {
                i8 = 2;
            }
            strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
            if (list.size() == 2) {
                zzt zztVar2 = this.zzc;
                zztVar2.zzb().zza(i8, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
                return zzao.zzf;
            }
            arrayList = new ArrayList();
            for (int i9 = 2; i9 < Math.min(list.size(), 5); i9++) {
                arrayList.add(zzgVar.zza((zzao) list.get(i9)).zzc());
            }
            this.zzc.zzb().zza(i8, strZzc, arrayList, this.zza, this.zzb);
            return zzao.zzf;
        }
        i7 = 4;
        i8 = i7;
        strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            zzt zztVar3 = this.zzc;
            zztVar3.zzb().zza(i8, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzao.zzf;
        }
        arrayList = new ArrayList();
        while (i9 < Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zza((zzao) list.get(i9)).zzc());
        }
        this.zzc.zzb().zza(i8, strZzc, arrayList, this.zza, this.zzb);
        return zzao.zzf;
    }
}

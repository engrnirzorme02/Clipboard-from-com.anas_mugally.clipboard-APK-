package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcj {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbds.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbef.zza);
        zzc(arrayList, zzbef.zzb);
        zzc(arrayList, zzbef.zzc);
        zzc(arrayList, zzbef.zzd);
        zzc(arrayList, zzbef.zze);
        zzc(arrayList, zzbef.zzu);
        zzc(arrayList, zzbef.zzf);
        zzc(arrayList, zzbef.zzm);
        zzc(arrayList, zzbef.zzn);
        zzc(arrayList, zzbef.zzo);
        zzc(arrayList, zzbef.zzp);
        zzc(arrayList, zzbef.zzq);
        zzc(arrayList, zzbef.zzr);
        zzc(arrayList, zzbef.zzs);
        zzc(arrayList, zzbef.zzt);
        zzc(arrayList, zzbef.zzg);
        zzc(arrayList, zzbef.zzh);
        zzc(arrayList, zzbef.zzi);
        zzc(arrayList, zzbef.zzj);
        zzc(arrayList, zzbef.zzk);
        zzc(arrayList, zzbef.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbeu.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbds zzbdsVar) {
        String str = (String) zzbdsVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}

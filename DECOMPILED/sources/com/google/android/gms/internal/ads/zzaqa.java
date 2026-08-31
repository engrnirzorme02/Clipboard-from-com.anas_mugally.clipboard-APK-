package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqa {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzaqa(String str, zzaoq zzaoqVar) {
        String str2 = zzaoqVar.zzb;
        long j7 = zzaoqVar.zzc;
        long j8 = zzaoqVar.zzd;
        long j9 = zzaoqVar.zze;
        long j10 = zzaoqVar.zzf;
        List arrayList = zzaoqVar.zzh;
        if (arrayList == null) {
            Map map = zzaoqVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j7, j8, j9, j10, arrayList);
    }

    static zzaqa zza(zzaqb zzaqbVar) throws IOException {
        if (zzaqd.zzi(zzaqbVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzaqd.zzm(zzaqbVar);
        String strZzm2 = zzaqd.zzm(zzaqbVar);
        long jZzk = zzaqd.zzk(zzaqbVar);
        long jZzk2 = zzaqd.zzk(zzaqbVar);
        long jZzk3 = zzaqd.zzk(zzaqbVar);
        long jZzk4 = zzaqd.zzk(zzaqbVar);
        int iZzi = zzaqd.zzi(zzaqbVar);
        if (iZzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(iZzi);
            throw new IOException(sb.toString());
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i7 = 0; i7 < iZzi; i7++) {
            arrayList.add(new zzaoz(zzaqd.zzm(zzaqbVar).intern(), zzaqd.zzm(zzaqbVar).intern()));
        }
        return new zzaqa(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    private zzaqa(String str, String str2, long j7, long j8, long j9, long j10, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j7;
        this.zze = j8;
        this.zzf = j9;
        this.zzg = j10;
        this.zzh = list;
    }
}

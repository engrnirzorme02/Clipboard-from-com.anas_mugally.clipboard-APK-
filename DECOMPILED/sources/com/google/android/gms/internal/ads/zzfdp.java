package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdp {
    private final zzfcj zza;
    private final zzfcm zzb;
    private final zzfjv zzc;
    private final zzfjn zzd;
    private final zzfib zze;
    private final zzcmi zzf;

    public zzfdp(zzfjv zzfjvVar, zzfjn zzfjnVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar, zzfib zzfibVar) {
        this.zza = zzfcjVar;
        this.zzb = zzfcmVar;
        this.zzc = zzfjvVar;
        this.zzd = zzfjnVar;
        this.zzf = zzcmiVar;
        this.zze = zzfibVar;
    }

    public final void zza(List list, zzcyh zzcyhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzcyhVar);
        }
    }

    public final void zzb(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgot.zzq((((Boolean) C3250D.m17200c().zzd(zzbci.zzkQ)).booleanValue() && zzcmi.zzc(str)) ? this.zzf.zzb(str, C3244B.m17194e()) : zzgot.zza(str), new zzfdo(this, i7), zzbzh.zza);
        }
    }

    public final void zzc(String str, int i7, zzcyh zzcyhVar) {
        zzfcj zzfcjVar = this.zza;
        if (zzfcjVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i7);
            return;
        }
        this.zzc.zzb(str, zzfcjVar.zzax, this.zze, zzcyhVar);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import p380w2.C7332a;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpi {
    private final Context zza;
    private final zzauu zzb;
    private final zzbdp zzc;
    private final C7584a zzd;
    private final C7332a zze;
    private final zzbbh zzf;
    private final zzcyt zzg;
    private final zzecy zzh;
    private final zzfdg zzi;
    private final zzdsm zzj;
    private final zzcgj zzk;

    public zzdpi(zzcfa zzcfaVar, Context context, zzauu zzauuVar, zzbdp zzbdpVar, C7584a c7584a, C7332a c7332a, zzbbh zzbbhVar, zzcyt zzcytVar, zzecy zzecyVar, zzfdg zzfdgVar, zzdsm zzdsmVar, zzcgj zzcgjVar) {
        this.zza = context;
        this.zzb = zzauuVar;
        this.zzc = zzbdpVar;
        this.zzd = c7584a;
        this.zze = c7332a;
        this.zzf = zzbbhVar;
        this.zzg = zzcytVar;
        this.zzh = zzecyVar;
        this.zzi = zzfdgVar;
        this.zzj = zzdsmVar;
        this.zzk = zzcgjVar;
    }

    public final zzcek zza(C3369m2 c3369m2, zzfcj zzfcjVar, zzfcm zzfcmVar) throws zzcez {
        zzcgt zzcgtVarZza = zzcgt.zza(c3369m2);
        String str = c3369m2.f14022a;
        zzdox zzdoxVar = new zzdox(this);
        zzauu zzauuVar = this.zzb;
        zzecy zzecyVar = this.zzh;
        zzcek zzcekVarZza = zzcfa.zza(this.zza, zzcgtVarZza, str, false, false, zzauuVar, this.zzc, this.zzd, null, zzdoxVar, this.zze, this.zzf, zzfcjVar, zzfcmVar, zzecyVar, this.zzi, this.zzj);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoF)).booleanValue()) {
            this.zzk.zze(zzcekVarZza.zzD());
        }
        return zzcekVarZza;
    }

    final /* synthetic */ zzcyt zzb() {
        return this.zzg;
    }
}

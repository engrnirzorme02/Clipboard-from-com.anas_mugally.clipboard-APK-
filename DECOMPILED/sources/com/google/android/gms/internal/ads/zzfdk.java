package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import p380w2.C7351t;
import p404z2.C7606w;

/* JADX INFO: loaded from: classes2.dex */
final class zzfdk implements zzgoq {
    final /* synthetic */ zzcek zza;
    final /* synthetic */ zzcmi zzb;
    final /* synthetic */ zzfjv zzc;
    final /* synthetic */ zzecn zzd;

    zzfdk(zzcek zzcekVar, zzcmi zzcmiVar, zzfjv zzfjvVar, zzecn zzecnVar) {
        this.zza = zzcekVar;
        this.zzb = zzcmiVar;
        this.zzc = zzfjvVar;
        this.zzd = zzecnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmi zzcmiVar;
        String str = (String) obj;
        zzcek zzcekVar = this.zza;
        zzfcj zzfcjVarZzC = zzcekVar.zzC();
        if (zzfcjVarZzC != null && !zzfcjVarZzC.zzai) {
            C7606w c7606w = zzfcjVarZzC.zzax;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar = this.zzb) != null && zzcmi.zzc(str)) {
                zzcmiVar.zza(str, this.zzc, C3244B.m17194e(), c7606w);
                return;
            } else {
                this.zzc.zzb(str, c7606w, null, null);
                return;
            }
        }
        zzfcm zzfcmVarZzaC = zzcekVar.zzaC();
        if (zzfcmVarZzaC == null) {
            C7351t.m32354l().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jMo18159a = C7351t.m32357o().mo18159a();
        boolean zZzs = C7351t.m32354l().zzs(zzcekVar.getContext());
        boolean z7 = false;
        boolean z8 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzgH)).booleanValue() && zzfcjVarZzC != null && zzfcjVarZzC.zzS;
        if (zzfcjVarZzC != null && zzfcjVarZzC.zzad != null) {
            z7 = true;
        }
        this.zzd.zze(new zzecp(jMo18159a, zzfcmVarZzaC.zzb, str, (zZzs || z8 || z7) ? 2 : 1));
    }
}

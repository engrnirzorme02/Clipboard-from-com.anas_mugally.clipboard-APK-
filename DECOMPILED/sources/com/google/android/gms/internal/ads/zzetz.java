package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetz implements zzeup {
    private final zzbxr zza;
    private final zzgpd zzb;
    private final Context zzc;

    public zzetz(zzbxr zzbxrVar, zzgpd zzgpdVar, Context context) {
        this.zza = zzbxrVar;
        this.zzb = zzgpdVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 34;
    }

    final /* synthetic */ zzeua zzc() {
        zzbxr zzbxrVar = this.zza;
        Context context = this.zzc;
        if (!zzbxrVar.zza(context)) {
            return new zzeua(null, null, null, null, null);
        }
        String strZzh = zzbxrVar.zzh(context);
        String str = strZzh == null ? "" : strZzh;
        String strZzi = zzbxrVar.zzi(context);
        String str2 = strZzi == null ? "" : strZzi;
        String strZzj = zzbxrVar.zzj(context);
        String str3 = strZzj == null ? "" : strZzj;
        boolean zZza = zzbxrVar.zza(context);
        Long l7 = null;
        String str4 = true != zZza ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l7 = (Long) C3250D.m17200c().zzd(zzbci.zzaA);
        }
        return new zzeua(str, str2, str3, str4 == null ? "" : str4, l7);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.Map;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeof implements zzeup {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsi zze;
    private final zzfek zzf;
    private final zzfdc zzg;
    private final InterfaceC3494q0 zzh = C7351t.m32354l().zzo();
    private final zzdsg zzi;
    private final zzcsw zzj;

    public zzeof(Context context, String str, String str2, zzcsi zzcsiVar, zzfek zzfekVar, zzfdc zzfdcVar, zzdsg zzdsgVar, zzcsw zzcswVar, long j7) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcsiVar;
        this.zzf = zzfekVar;
        this.zzg = zzfdcVar;
        this.zzi = zzdsgVar;
        this.zzj = zzcswVar;
        this.zzd = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        Bundle bundle = new Bundle();
        zzdsg zzdsgVar = this.zzi;
        Map mapZzc = zzdsgVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue()) {
            zzdsgVar.zzd("tsacc", String.valueOf(C7351t.m32357o().mo18159a() - this.zzd));
            C7351t.m32349g();
            zzdsgVar.zzd("foreground", true != C3431F0.m17420k(this.zza) ? "1" : "0");
        }
        zzcsi zzcsiVar = this.zze;
        zzfdc zzfdcVar = this.zzg;
        zzcsiVar.zzi(zzfdcVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzgot.zza(new zzeog(this.zza, bundle, str, this.zzc, this.zzh, zzfdcVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 12;
    }
}

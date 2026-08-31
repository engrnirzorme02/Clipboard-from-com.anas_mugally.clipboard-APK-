package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeog implements zzeun {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final InterfaceC3494q0 zze;
    private final String zzf;
    private final zzcsw zzg;

    public zzeog(Context context, Bundle bundle, String str, String str2, InterfaceC3494q0 interfaceC3494q0, String str3, zzcsw zzcswVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = interfaceC3494q0;
        this.zzf = str3;
        this.zzg = zzcswVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzge)).booleanValue()) {
            try {
                C7351t.m32349g();
                bundle.putString("_app_id", C3431F0.m17407d0(this.zza));
            } catch (RemoteException | RuntimeException e7) {
                C7351t.m32354l().zzg(e7, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        InterfaceC3494q0 interfaceC3494q0 = this.zze;
        if (!interfaceC3494q0.zzx()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !interfaceC3494q0.zzx());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcsw zzcswVar = this.zzg;
            bundle2.putLong("dload", zzcswVar.zzc(str));
            bundle2.putInt("pcc", zzcswVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkA)).booleanValue() || C7351t.m32354l().zzn() <= 0) {
            return;
        }
        bundle.putInt("nrwv", C7351t.m32354l().zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }
}

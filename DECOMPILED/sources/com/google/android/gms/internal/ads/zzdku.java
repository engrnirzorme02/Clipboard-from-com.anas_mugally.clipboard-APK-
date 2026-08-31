package com.google.android.gms.internal.ads;

import androidx.collection.C2390a;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdku implements zzcwm {
    private final zzdiu zza;
    private final zzdiz zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdku(zzdiu zzdiuVar, zzdiz zzdizVar, Executor executor, Executor executor2) {
        this.zza = zzdiuVar;
        this.zzb = zzdizVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcek zzcekVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcekVar.zze("onSdkImpression", new C2390a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (this.zzb.zzd()) {
            zzdiu zzdiuVar = this.zza;
            zzedu zzeduVarZzZ = zzdiuVar.zzZ();
            if (zzeduVarZzZ == null && zzdiuVar.zzX() != null && ((Boolean) C3250D.m17200c().zzd(zzbci.zzfQ)).booleanValue()) {
                InterfaceFutureC1673e interfaceFutureC1673eZzX = zzdiuVar.zzX();
                zzbzm zzbzmVarZzY = zzdiuVar.zzY();
                if (interfaceFutureC1673eZzX == null || zzbzmVarZzY == null) {
                    return;
                }
                zzgot.zzq(zzgot.zzp(interfaceFutureC1673eZzX, zzbzmVarZzY), new zzdks(this), this.zzd);
                return;
            }
            if (zzeduVarZzZ != null) {
                zzcek zzcekVarZzW = zzdiuVar.zzW();
                zzcek zzcekVarZzT = zzdiuVar.zzT();
                if (zzcekVarZzW == null) {
                    zzcekVarZzW = zzcekVarZzT == null ? null : zzcekVarZzT;
                }
                if (zzcekVarZzW != null) {
                    zza(zzcekVarZzW);
                }
            }
        }
    }
}

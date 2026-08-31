package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenh implements zzeup {
    private final zzgpd zza;
    private final zzdqc zzb;
    private final zzdux zzc;
    private final zzenj zzd;

    public zzenh(zzgpd zzgpdVar, zzdqc zzdqcVar, zzdux zzduxVar, zzenj zzenjVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdqcVar;
        this.zzc = zzduxVar;
        this.zzd = zzenjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        zzbbz zzbbzVar = zzbci.zzmu;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            zzenj zzenjVar = this.zzd;
            if (zzenjVar.zzd() != null) {
                zzeni zzeniVarZzd = zzenjVar.zzd();
                zzeniVarZzd.getClass();
                return zzgot.zza(zzeniVarZzd);
            }
        }
        if (zzghs.zzc((String) C3250D.m17200c().zzd(zzbci.zzbE)) || (!((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgot.zza(new zzeni(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzeni zzc() {
        List<String> listAsList = Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzbE)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfea zzfeaVarZza = this.zzb.zza(str, new JSONObject());
                zzfeaVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmu)).booleanValue() || zZze) {
                    try {
                        zzbrl zzbrlVarZzC = zzfeaVarZza.zzC();
                        if (zzbrlVarZzC != null) {
                            bundle2.putString("sdk_version", zzbrlVarZzC.toString());
                        }
                    } catch (zzfdj unused) {
                    }
                }
                try {
                    zzbrl zzbrlVarZzB = zzfeaVarZza.zzB();
                    if (zzbrlVarZzB != null) {
                        bundle2.putString("adapter_version", zzbrlVarZzB.toString());
                    }
                } catch (zzfdj unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfdj unused3) {
            }
        }
        zzeni zzeniVar = new zzeni(bundle);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmu)).booleanValue()) {
            this.zzd.zzc(zzeniVar);
        }
        return zzeniVar;
    }
}

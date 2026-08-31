package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejb implements zzedz {
    private final zzeeb zza;
    private final zzeef zzb;
    private final zzfhh zzc;
    private final zzgpd zzd;

    public zzejb(zzfhh zzfhhVar, zzgpd zzgpdVar, zzeeb zzeebVar, zzeef zzeefVar) {
        this.zzc = zzfhhVar;
        this.zzd = zzgpdVar;
        this.zzb = zzeefVar;
        this.zza = zzeebVar;
    }

    static final String zze(String str, int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i7).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i7);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return !zzfcjVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        final zzeec zzeecVarZza;
        Iterator it = zzfcjVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeecVarZza = null;
                break;
            }
            try {
                zzeecVarZza = this.zza.zza((String) it.next(), zzfcjVar.zzv);
                break;
            } catch (zzfdj unused) {
            }
        }
        if (zzeecVarZza == null) {
            return zzgot.zzc(new zzegs("Unable to instantiate mediation adapter class."));
        }
        zzbzm zzbzmVar = new zzbzm();
        zzeecVarZza.zzc.zza(new zzeiy(this, zzeecVarZza, zzbzmVar));
        if (zzfcjVar.zzM) {
            Bundle bundle = zzfcuVar.zza.zza.zzd.f13961x;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfhh zzfhhVar = this.zzc;
        zzfhb zzfhbVar = zzfhb.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zzd(new zzfgn() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // com.google.android.gms.internal.ads.zzfgn
            public final /* synthetic */ void zza() {
                this.zza.zzc(zzfcuVar, zzfcjVar, zzeecVarZza);
            }
        }, this.zzd, zzfhbVar, zzfhhVar).zzj(zzfhb.ADAPTER_LOAD_AD_ACK).zze(zzbzmVar).zzj(zzfhb.ADAPTER_WRAP_ADAPTER).zzb(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                return this.zza.zzd(zzfcuVar, zzfcjVar, zzeecVarZza, (Void) obj);
            }
        }).zzi();
    }

    final /* synthetic */ void zzc(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        this.zzb.zza(zzfcuVar, zzfcjVar, zzeecVar);
    }

    final /* synthetic */ Object zzd(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar, Void r7) {
        return this.zzb.zzb(zzfcuVar, zzfcjVar, zzeecVar);
    }
}

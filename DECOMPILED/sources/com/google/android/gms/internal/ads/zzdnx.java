package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7332a;
import p380w2.C7333b;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnx {
    private final C7332a zzb;
    private final Context zzc;
    private final zzdsm zzd;
    private final Executor zze;
    private final zzauu zzf;
    private final C7584a zzg;
    private final zzecn zzi;
    private final zzfjv zzj;
    private final zzecy zzk;
    private final zzfdg zzl;
    private InterfaceFutureC1673e zzm;
    private final zzdnl zza = new zzdnl();
    private final zzbkc zzh = new zzbkc();

    zzdnx(zzdnv zzdnvVar) {
        this.zzc = zzdnvVar.zzb();
        this.zze = zzdnvVar.zze();
        this.zzf = zzdnvVar.zzf();
        this.zzg = zzdnvVar.zzg();
        this.zzb = zzdnvVar.zza();
        this.zzi = zzdnvVar.zzd();
        this.zzj = zzdnvVar.zzh();
        this.zzd = zzdnvVar.zzc();
        this.zzk = zzdnvVar.zzi();
        this.zzl = zzdnvVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) C3250D.m17200c().zzd(zzbci.zzei);
        zzauu zzauuVar = this.zzf;
        C7332a c7332a = this.zzb;
        zzecy zzecyVar = this.zzk;
        InterfaceFutureC1673e interfaceFutureC1673eZzk = zzgot.zzk(zzcfa.zzb(this.zzc, this.zzg, str, zzauuVar, c7332a, zzecyVar, this.zzl, this.zzd), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzcek zzcekVar = (zzcek) obj;
                this.zza.zzi(zzcekVar);
                return zzcekVar;
            }
        }, this.zze);
        this.zzm = interfaceFutureC1673eZzk;
        zzbzk.zza(interfaceFutureC1673eZzk, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
        if (interfaceFutureC1673e == null) {
            return;
        }
        zzgot.zzq(interfaceFutureC1673e, new zzdnm(this), this.zze);
        this.zzm = null;
    }

    public final synchronized InterfaceFutureC1673e zzc(final String str, final JSONObject jSONObject) {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
        if (interfaceFutureC1673e == null) {
            return zzgot.zza(null);
        }
        return zzgot.zzj(interfaceFutureC1673e, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdnt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzcek) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbjl zzbjlVar) {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
        if (interfaceFutureC1673e == null) {
            return;
        }
        zzgot.zzq(interfaceFutureC1673e, new zzdnn(this, str, zzbjlVar), this.zze);
    }

    public final synchronized void zze(String str, zzbjl zzbjlVar) {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
        if (interfaceFutureC1673e == null) {
            return;
        }
        zzgot.zzq(interfaceFutureC1673e, new zzdno(this, str, zzbjlVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
        if (interfaceFutureC1673e == null) {
            return;
        }
        zzgot.zzq(interfaceFutureC1673e, new zzdnp(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar) {
        InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
        if (interfaceFutureC1673e == null) {
            return;
        }
        zzgot.zzq(interfaceFutureC1673e, new zzdnq(this, zzfcjVar, zzfcmVar, zzcmiVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbjl zzbjlVar) {
        zzd(str, new zzdnw(this, weakReference, str, zzbjlVar, null));
    }

    final /* synthetic */ zzcek zzi(zzcek zzcekVar) {
        zzcekVar.zzab("/result", this.zzh);
        zzcgi zzcgiVarZzP = zzcekVar.zzP();
        C7333b c7333b = new C7333b(this.zzc, null, null);
        zzecn zzecnVar = this.zzi;
        zzfjv zzfjvVar = this.zzj;
        zzdsm zzdsmVar = this.zzd;
        zzdnl zzdnlVar = this.zza;
        zzcgiVarZzP.zzZ(null, zzdnlVar, zzdnlVar, zzdnlVar, zzdnlVar, false, null, c7333b, null, null, zzecnVar, zzfjvVar, zzdsmVar, null, null, null, null, null, null, null, null);
        return zzcekVar;
    }

    final /* synthetic */ InterfaceFutureC1673e zzj(String str, JSONObject jSONObject, zzcek zzcekVar) {
        return this.zzh.zzc(zzcekVar, str, jSONObject);
    }

    final /* synthetic */ zzdnl zzk() {
        return this.zza;
    }

    final /* synthetic */ zzdsm zzl() {
        return this.zzd;
    }

    final /* synthetic */ zzecn zzm() {
        return this.zzi;
    }

    final /* synthetic */ zzfjv zzn() {
        return this.zzj;
    }
}

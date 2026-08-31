package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7333b;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegl implements zzegf {
    private final zzdhd zza;
    private final zzgpd zzb;
    private final zzdln zzc;
    private final zzfeb zzd;
    private final zzdod zze;
    private final zzdsg zzf;
    private final C7584a zzg;
    private final Context zzh;
    private final zzbxb zzi;

    public zzegl(zzdhd zzdhdVar, zzgpd zzgpdVar, zzdln zzdlnVar, zzfeb zzfebVar, zzdod zzdodVar, zzdsg zzdsgVar, C7584a c7584a, Context context, zzbxb zzbxbVar) {
        this.zzg = c7584a;
        this.zzh = context;
        this.zzi = zzbxbVar;
        this.zza = zzdhdVar;
        this.zzb = zzgpdVar;
        this.zzc = zzdlnVar;
        this.zzd = zzfebVar;
        this.zze = zzdodVar;
        this.zzf = zzdsgVar;
    }

    private final InterfaceFutureC1673e zzg(final zzfcu zzfcuVar, final zzfcj zzfcjVar, final JSONObject jSONObject) {
        C7333b c7333b;
        zzbxf zzbxfVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcu)).booleanValue()) {
            this.zzf.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_START.zza(), C7351t.m32357o().mo18159a());
        }
        final InterfaceFutureC1673e interfaceFutureC1673eZzb = this.zzd.zzb();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoq)).booleanValue()) {
            Context context = this.zzh;
            zzbxf zzbxfVarZza = zzcvn.zza(context, this.zzg, zzfcjVar, this.zzi);
            c7333b = new C7333b(context, zzbxfVarZza, null);
            zzbxfVar = zzbxfVarZza;
        } else {
            c7333b = new C7333b(this.zzh, null, null);
            zzbxfVar = null;
        }
        final C7333b c7333b2 = c7333b;
        final zzbxf zzbxfVar2 = zzbxfVar;
        final InterfaceFutureC1673e interfaceFutureC1673eZza = this.zzc.zza(zzfcuVar, zzfcjVar, jSONObject, c7333b2, zzbxfVar2);
        return zzgot.zzn(interfaceFutureC1673eZzb, interfaceFutureC1673eZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(interfaceFutureC1673eZza, interfaceFutureC1673eZzb, zzfcuVar, zzfcjVar, jSONObject, c7333b2, zzbxfVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzf.zze().putLong(zzdru.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), C7351t.m32357o().mo18159a());
        }
        InterfaceFutureC1673e interfaceFutureC1673eZzb = this.zzd.zzb();
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(zzfcjVar, (zzdnx) obj);
            }
        };
        zzgpd zzgpdVar = this.zzb;
        return zzgot.zzj(zzgot.zzj(interfaceFutureC1673eZzb, zzgobVar, zzgpdVar), new zzgob() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzd(zzfcuVar, zzfcjVar, (JSONArray) obj);
            }
        }, zzgpdVar);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(zzfcj zzfcjVar, final zzdnx zzdnxVar) throws JSONException {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzf.zze().putLong(zzdru.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), C7351t.m32357o().mo18159a());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzju)).booleanValue() && AbstractC3760o.m18202j()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfcjVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgot.zzj(zzdnxVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgob() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zze(zzdnxVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ InterfaceFutureC1673e zzd(zzfcu zzfcuVar, zzfcj zzfcjVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgot.zzc(new zzdwz(3));
        }
        int i7 = zzfcuVar.zza.zza.zzl;
        if (i7 <= 1) {
            return zzgot.zzk(zzg(zzfcuVar, zzfcjVar, jSONArray.getJSONObject(0)), zzegi.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcv)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i7));
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 < length) {
                arrayList.add(zzg(zzfcuVar, zzfcjVar, jSONArray.getJSONObject(i8)));
            } else {
                arrayList.add(zzgot.zzc(new zzdwz(3)));
            }
        }
        return zzgot.zza(arrayList);
    }

    final /* synthetic */ InterfaceFutureC1673e zze(zzdnx zzdnxVar, JSONObject jSONObject) throws zzbns {
        this.zzd.zzc(zzgot.zza(zzdnxVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbns("process json failed");
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            this.zzf.zze().putLong(zzdru.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), C7351t.m32357o().mo18159a());
        }
        return zzgot.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    final /* synthetic */ zzdip zzf(InterfaceFutureC1673e interfaceFutureC1673e, InterfaceFutureC1673e interfaceFutureC1673e2, zzfcu zzfcuVar, zzfcj zzfcjVar, JSONObject jSONObject, C7333b c7333b, zzbxf zzbxfVar) throws Throwable {
        zzdiu zzdiuVar = (zzdiu) interfaceFutureC1673e.get();
        zzdnx zzdnxVar = (zzdnx) interfaceFutureC1673e2.get();
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), C7351t.m32357o().mo18159a());
        }
        zzdiv zzdivVarZzd = this.zza.zzd(new zzcri(zzfcuVar, zzfcjVar, null), new zzdjf(zzdiuVar), new zzdhq(jSONObject, zzdnxVar, c7333b, zzbxfVar));
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            long jMo18159a = C7351t.m32357o().mo18159a();
            zzdsg zzdsgVar = this.zzf;
            zzdsgVar.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), jMo18159a);
            zzdsgVar.zze().putLong(zzdru.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jMo18159a);
        }
        zzdivVarZzd.zzi().zzb();
        zzdivVarZzd.zzj().zza(zzdnxVar);
        zzdivVarZzd.zzk().zza(zzdiuVar.zzT());
        zzdivVarZzd.zzl().zza(this.zze, zzdiuVar.zzU());
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdru.RENDERING_CONFIGURE_WEBVIEW_END.zza(), C7351t.m32357o().mo18159a());
        }
        return zzdivVarZzd.zzh();
    }
}

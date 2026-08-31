package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.AbstractC2379b;
import androidx.browser.customtabs.AbstractC2380c;
import androidx.browser.customtabs.C2383f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p036E2.AbstractC0335c;
import p036E2.C0334b0;
import p036E2.C0352k0;
import p060H2.C0496a;
import p314o2.C6555g;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdn {
    private final ScheduledExecutorService zza;
    private final C0352k0 zzb;
    private final C0334b0 zzc;
    private final zzdsr zzd;
    private Runnable zze;
    private zzbdk zzf;
    private C2383f zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbdn(ScheduledExecutorService scheduledExecutorService, C0352k0 c0352k0, C0334b0 c0334b0, zzdsr zzdsrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = c0352k0;
        this.zzc = c0334b0;
        this.zzd = zzdsrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.C3250D.m17200c().zzd(com.google.android.gms.internal.ads.zzbci.zzkG)).booleanValue() != false) goto L23;
     */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        ScheduledExecutorService scheduledExecutorService;
        zzbdk zzbdkVar = this.zzf;
        if (zzbdkVar == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbdkVar.zza().booleanValue()) {
            return;
        }
        if (this.zzh != null && this.zzg != null && (scheduledExecutorService = this.zza) != null) {
            if (this.zzi == 0 || C7351t.m32357o().mo18161c() > this.zzi) {
            }
            this.zzg.m10217h(Uri.parse(this.zzh));
            scheduledExecutorService.schedule(this.zze, ((Long) C3250D.m17200c().zzd(zzbci.zzkH)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        AbstractC3490o0.m17545k("PACT max retry connection duration timed out");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) C3250D.m17200c().zzd(zzbci.zzkJ));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error fetching the PACT active eids JSON: ", e7);
        }
    }

    public final void zza(Context context, AbstractC2380c abstractC2380c, String str, AbstractC2379b abstractC2379b) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (abstractC2380c == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdsr zzdsrVar = this.zzd;
        zzbdk zzbdkVar = new zzbdk(this, abstractC2379b, zzdsrVar);
        this.zzf = zzbdkVar;
        C2383f c2383fM10188e = abstractC2380c.m10188e(zzbdkVar);
        this.zzg = c2383fM10188e;
        if (c2383fM10188e == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("CustomTabsClient failed to create new session.");
        }
        AbstractC0335c.m1523e(zzdsrVar, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final C2383f zzb() {
        return this.zzg;
    }

    final void zzc() {
        this.zzi = C7351t.m32357o().mo18161c() + ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzkF)).intValue());
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            };
        }
        zzh();
    }

    final void zzd(String str) {
        try {
            C2383f c2383f = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzben.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.m1518b());
            }
            c2383f.m10216g(jSONObject.toString(), null);
            zzbdl zzbdlVar = new zzbdl(this, str);
            if (((Boolean) zzben.zze.zze()).booleanValue()) {
                this.zzb.m1535b(this.zzg, zzbdlVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            C0496a.m2107a(this.zzl, EnumC6551c.BANNER, ((C6555g.a) new C6555g.a().m27799c(AdMobAdapter.class, bundle)).m27825k(), zzbdlVar);
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error creating JSON: ", e7);
        }
    }

    final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.m1518b());
        }
        return jSONObject;
    }

    final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.m1518b());
        }
        return jSONObject;
    }

    public final void zzg(long j7) {
        this.zzj = j7;
    }

    final /* synthetic */ C2383f zzi() {
        return this.zzg;
    }
}

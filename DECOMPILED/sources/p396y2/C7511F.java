package p396y2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzgeq;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzget;
import com.google.android.gms.internal.ads.zzgfm;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgfq;
import com.google.android.gms.internal.ads.zzgfr;
import com.google.android.gms.internal.ads.zzgge;
import java.util.HashMap;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: renamed from: y2.F */
/* JADX INFO: loaded from: classes.dex */
public final class C7511F {

    /* JADX INFO: renamed from: f */
    private zzgfp f30117f;

    /* JADX INFO: renamed from: c */
    private zzcek f30114c = null;

    /* JADX INFO: renamed from: e */
    private boolean f30116e = false;

    /* JADX INFO: renamed from: a */
    private String f30112a = null;

    /* JADX INFO: renamed from: d */
    private zzges f30115d = null;

    /* JADX INFO: renamed from: b */
    private String f30113b = null;

    /* JADX INFO: renamed from: l */
    private final void m33139l() {
        if (this.f30117f == null) {
            this.f30117f = new C7509D(this);
        }
    }

    /* JADX INFO: renamed from: m */
    private final zzgfr m33140m() {
        zzgfq zzgfqVarZzc = zzgfr.zzc();
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmn)).booleanValue() || TextUtils.isEmpty(this.f30113b)) {
            String str = this.f30112a;
            if (str != null) {
                zzgfqVarZzc.zza(str);
            } else {
                m33147g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgfqVarZzc.zzb(this.f30113b);
        }
        return zzgfqVarZzc.zzc();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m33141a(zzcek zzcekVar, Context context) {
        this.f30114c = zzcekVar;
        if (!m33142b(context)) {
            m33147g("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        m33149i("on_play_store_bind", map);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m33142b(Context context) {
        if (!zzgge.zza(context)) {
            return false;
        }
        try {
            this.f30115d = zzget.zza(context);
        } catch (NullPointerException e7) {
            AbstractC3490o0.m17545k("Error connecting LMD Overlay service");
            C7351t.m32354l().zzg(e7, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f30115d == null) {
            this.f30116e = false;
            return false;
        }
        m33139l();
        this.f30116e = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m33143c(zzcek zzcekVar, zzgfm zzgfmVar) {
        if (zzcekVar == null) {
            m33147g("adWebview missing", "onLMDShow");
            return;
        }
        this.f30114c = zzcekVar;
        if (!this.f30116e && !m33142b(zzcekVar.getContext())) {
            m33147g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmn)).booleanValue()) {
            this.f30113b = zzgfmVar.zzb();
        }
        m33139l();
        zzges zzgesVar = this.f30115d;
        if (zzgesVar != null) {
            zzgesVar.zza(zzgfmVar, this.f30117f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m33144d() {
        zzges zzgesVar;
        if (!this.f30116e || (zzgesVar = this.f30115d) == null) {
            AbstractC3490o0.m17545k("LastMileDelivery not connected");
        } else {
            zzgesVar.zzd(m33140m(), this.f30117f);
            m33148h("onLMDOverlayExpand");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m33145e() {
        zzges zzgesVar;
        if (!this.f30116e || (zzgesVar = this.f30115d) == null) {
            AbstractC3490o0.m17545k("LastMileDelivery not connected");
        } else {
            zzgesVar.zzc(m33140m(), this.f30117f);
            m33148h("onLMDOverlayCollapse");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33146f() {
        zzges zzgesVar;
        if (!this.f30116e || (zzgesVar = this.f30115d) == null) {
            AbstractC3490o0.m17545k("LastMileDelivery not connected");
            return;
        }
        zzgeq zzgeqVarZzc = zzger.zzc();
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmn)).booleanValue() || TextUtils.isEmpty(this.f30113b)) {
            String str = this.f30112a;
            if (str != null) {
                zzgeqVarZzc.zza(str);
            } else {
                m33147g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgeqVarZzc.zzb(this.f30113b);
        }
        zzgesVar.zzb(zzgeqVarZzc.zzc(), this.f30117f);
    }

    /* JADX INFO: renamed from: g */
    final void m33147g(String str, String str2) {
        AbstractC3490o0.m17545k(str);
        if (this.f30114c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            m33149i("onError", map);
        }
    }

    /* JADX INFO: renamed from: h */
    final void m33148h(String str) {
        m33149i(str, new HashMap());
    }

    /* JADX INFO: renamed from: i */
    final void m33149i(final String str, final Map map) {
        zzbzh.zzf.execute(new Runnable() { // from class: y2.E
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30109a.m33151k(str, map);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    final void m33150j(zzgfo zzgfoVar) {
        if (!TextUtils.isEmpty(zzgfoVar.zzb())) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmn)).booleanValue()) {
                this.f30112a = zzgfoVar.zzb();
            }
        }
        switch (zzgfoVar.zza()) {
            case 8152:
                m33148h("onLMDOverlayOpened");
                break;
            case 8153:
                m33148h("onLMDOverlayClicked");
                break;
            case 8155:
                m33148h("onLMDOverlayClose");
                break;
            case 8157:
                this.f30112a = null;
                this.f30113b = null;
                this.f30116e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzgfoVar.zza()));
                m33149i("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    final /* synthetic */ void m33151k(String str, Map map) {
        zzcek zzcekVar = this.f30114c;
        if (zzcekVar != null) {
            zzcekVar.zze(str, map);
        }
    }
}

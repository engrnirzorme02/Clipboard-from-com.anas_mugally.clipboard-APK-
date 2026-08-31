package p036E2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3451P0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p060H2.AbstractC0497b;
import p060H2.C0496a;
import p314o2.C6555g;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: E2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0331a {

    /* JADX INFO: renamed from: a */
    private final Context f1353a;

    /* JADX INFO: renamed from: b */
    private final WebView f1354b;

    /* JADX INFO: renamed from: c */
    private final zzauu f1355c;

    /* JADX INFO: renamed from: d */
    private final zzfdg f1356d;

    /* JADX INFO: renamed from: e */
    private final int f1357e;

    /* JADX INFO: renamed from: f */
    private final zzdsr f1358f;

    /* JADX INFO: renamed from: g */
    private final boolean f1359g;

    /* JADX INFO: renamed from: h */
    private final zzgpd f1360h = zzbzh.zzf;

    /* JADX INFO: renamed from: i */
    private final zzfjv f1361i;

    /* JADX INFO: renamed from: j */
    private final C0352k0 f1362j;

    /* JADX INFO: renamed from: k */
    private final C0334b0 f1363k;

    /* JADX INFO: renamed from: l */
    private final C0342f0 f1364l;

    C0331a(WebView webView, zzauu zzauuVar, zzdsr zzdsrVar, zzfjv zzfjvVar, zzfdg zzfdgVar, C0352k0 c0352k0, C0334b0 c0334b0, C0342f0 c0342f0) {
        this.f1354b = webView;
        Context context = webView.getContext();
        this.f1353a = context;
        this.f1355c = zzauuVar;
        this.f1358f = zzdsrVar;
        zzbci.zza(context);
        this.f1357e = ((Integer) C3250D.m17200c().zzd(zzbci.zzks)).intValue();
        this.f1359g = ((Boolean) C3250D.m17200c().zzd(zzbci.zzkt)).booleanValue();
        this.f1361i = zzfjvVar;
        this.f1356d = zzfdgVar;
        this.f1362j = c0352k0;
        this.f1363k = c0334b0;
        this.f1364l = c0342f0;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m1510a(Bundle bundle, AbstractC0497b abstractC0497b) {
        AbstractC3451P0 abstractC3451P0M32352j = C7351t.m32352j();
        Context context = this.f1353a;
        CookieManager cookieManagerMo17452a = abstractC3451P0M32352j.mo17452a(context);
        bundle.putBoolean("accept_3p_cookie", cookieManagerMo17452a != null ? cookieManagerMo17452a.acceptThirdPartyCookies(this.f1354b) : false);
        C0496a.m2107a(context, EnumC6551c.BANNER, ((C6555g.a) new C6555g.a().m27799c(AdMobAdapter.class, bundle)).m27825k(), abstractC0497b);
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ void m1511b(String str) {
        zzfdg zzfdgVar;
        Uri uriZzd = Uri.parse(str);
        try {
            uriZzd = (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmN)).booleanValue() || (zzfdgVar = this.f1356d) == null) ? this.f1355c.zzd(uriZzd, this.f1353a, this.f1354b, null) : zzfdgVar.zza(uriZzd, this.f1353a, this.f1354b, null);
        } catch (zzauv e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Failed to append the click signal to URL: ", e7);
            C7351t.m32354l().zzg(e7, "TaggingLibraryJsInterface.recordClick");
        }
        this.f1361i.zzb(uriZzd.toString(), null, null, null);
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ WebView m1512c() {
        return this.f1354b;
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ zzgpd m1513d() {
        return this.f1360h;
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C0334b0 m1514e() {
        return this.f1363k;
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C0342f0 m1515f() {
        return this.f1364l;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long jMo18159a = C7351t.m32357o().mo18159a();
            String strZzg = this.f1355c.zzb().zzg(this.f1353a, str, this.f1354b);
            if (!this.f1359g) {
                return strZzg;
            }
            AbstractC0335c.m1523e(this.f1358f, null, "csg", new Pair("clat", String.valueOf(C7351t.m32357o().mo18159a() - jMo18159a)));
            return strZzg;
        } catch (RuntimeException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Exception getting click signals. ", e7);
            C7351t.m32354l().zzg(e7, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i7) {
        if (i7 <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i7);
            String string = sb.toString();
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c(string);
            return "";
        }
        try {
            return (String) zzbzh.zza.submit(new Callable() { // from class: E2.V
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f1337a.getClickSignals(str);
                }
            }).get(Math.min(i7, this.f1357e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Exception getting click signals with timeout. ", e7);
            C7351t.m32354l().zzg(e7, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e7 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        C7351t.m32349g();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final C0324T c0324t = new C0324T(this, string);
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            this.f1362j.m1535b(this.f1354b, c0324t);
            return string;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkv)).booleanValue()) {
            this.f1360h.execute(new Runnable() { // from class: E2.X
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f1341a.m1510a(bundle, c0324t);
                }
            });
            return string;
        }
        C0496a.m2107a(this.f1353a, EnumC6551c.BANNER, ((C6555g.a) new C6555g.a().m27799c(AdMobAdapter.class, bundle)).m27825k(), c0324t);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long jMo18159a = C7351t.m32357o().mo18159a();
            String strZzj = this.f1355c.zzb().zzj(this.f1353a, this.f1354b, null);
            if (!this.f1359g) {
                return strZzj;
            }
            AbstractC0335c.m1523e(this.f1358f, null, "vsg", new Pair("vlat", String.valueOf(C7351t.m32357o().mo18159a() - jMo18159a)));
            return strZzj;
        } catch (RuntimeException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Exception getting view signals. ", e7);
            C7351t.m32354l().zzg(e7, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i7) {
        if (i7 <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i7);
            String string = sb.toString();
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c(string);
            return "";
        }
        try {
            return (String) zzbzh.zza.submit(new Callable() { // from class: E2.U
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f1336a.getViewSignals();
                }
            }).get(Math.min(i7, this.f1357e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Exception getting view signals with timeout. ", e7);
            C7351t.m32354l().zzg(e7, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e7 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkx)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbzh.zza.execute(new Runnable() { // from class: E2.W
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f1339a.m1511b(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i7;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i8 = jSONObject.getInt("x");
            int i9 = jSONObject.getInt("y");
            int i10 = jSONObject.getInt("duration_ms");
            float f7 = (float) jSONObject.getDouble("force");
            int i11 = jSONObject.getInt("type");
            if (i11 != 0) {
                i7 = 1;
                if (i11 != 1) {
                    i7 = 2;
                    if (i11 != 2) {
                        i7 = 3;
                        if (i11 != 3) {
                            i7 = -1;
                        }
                    }
                }
            } else {
                i7 = 0;
            }
            try {
                this.f1355c.zzc(MotionEvent.obtain(0L, i10, i7, i8, i9, f7, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e7) {
                e = e7;
                int i12 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Failed to parse the touch string. ", e);
                C7351t.m32354l().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e8) {
                e = e8;
                int i13 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Failed to parse the touch string. ", e);
                C7351t.m32354l().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e9) {
            e = e9;
        }
    }
}

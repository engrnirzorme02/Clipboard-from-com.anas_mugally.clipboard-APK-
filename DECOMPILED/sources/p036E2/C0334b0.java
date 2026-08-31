package p036E2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzgke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p098M0.AbstractC0880j;
import p098M0.AbstractC0881k;
import p227d3.C5228d;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: renamed from: E2.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0334b0 {

    /* JADX INFO: renamed from: a */
    private final Context f1370a;

    /* JADX INFO: renamed from: b */
    private final ApplicationInfo f1371b;

    /* JADX INFO: renamed from: c */
    private final List f1372c;

    /* JADX INFO: renamed from: d */
    private final C7584a f1373d;

    /* JADX INFO: renamed from: e */
    private final JSONObject f1374e = new JSONObject();

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f1375f = new AtomicBoolean(false);

    C0334b0(Context context, zzbbs zzbbsVar, List list, C7584a c7584a) {
        this.f1370a = context;
        this.f1371b = context.getApplicationInfo();
        this.f1372c = list;
        this.f1373d = c7584a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1517a(WebView webView) {
        if (this.f1375f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoM24152f = null;
        try {
            ApplicationInfo applicationInfo = this.f1371b;
            if (applicationInfo != null) {
                packageInfoM24152f = C5228d.m24155a(this.f1370a).m24152f(applicationInfo.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfoM24152f != null) {
            try {
                JSONObject jSONObject = this.f1374e;
                jSONObject.put("vc", packageInfoM24152f.versionCode);
                jSONObject.put("vnm", packageInfoM24152f.versionName);
            } catch (JSONException e7) {
                C7351t.m32354l().zzg(e7, "PawAppSignalGenerator.initialize");
            }
        }
        ApplicationInfo applicationInfo2 = this.f1371b;
        if (applicationInfo2 != null) {
            this.f1374e.put("pn", applicationInfo2.packageName);
        }
        JSONObject jSONObject2 = this.f1374e;
        List list = this.f1372c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) C3250D.m17200c().zzd(zzbci.zzkD)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.f1373d.f30226a);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if (obj != null) {
                jSONObject2.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzben.zzb.zze()).booleanValue() && AbstractC0881k.m4035a("DOCUMENT_START_SCRIPT") && webView != null) {
            AbstractC0880j.m4023e(webView, String.format(Locale.getDefault(), (String) C3250D.m17200c().zzd(zzbci.zzkC), m1518b()), zzgke.zzi("*"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m1518b() {
        if (!this.f1375f.get()) {
            m1517a(null);
        }
        return this.f1374e;
    }
}

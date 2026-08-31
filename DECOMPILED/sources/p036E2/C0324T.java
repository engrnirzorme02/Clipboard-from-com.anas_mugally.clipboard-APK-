package p036E2;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzben;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p060H2.AbstractC0497b;
import p060H2.C0496a;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: E2.T */
/* JADX INFO: loaded from: classes.dex */
final class C0324T extends AbstractC0497b {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f1334a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0331a f1335b;

    C0324T(C0331a c0331a, String str) {
        this.f1334a = str;
        Objects.requireNonNull(c0331a);
        this.f1335b = c0331a;
    }

    @Override // p060H2.AbstractC0497b
    public final void onFailure(String str) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String strConcat = ((Boolean) zzben.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.f1335b.m1514e().m1518b().toString()) : "";
        String str2 = this.f1334a;
        Locale locale = Locale.getDefault();
        zzbds zzbdsVar = zzben.zze;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) zzbdsVar.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L), strConcat);
        if (((Boolean) zzbdsVar.zze()).booleanValue()) {
            try {
                this.f1335b.m1513d().execute(new Runnable() { // from class: E2.Q
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f1330a.f1335b.m1512c().evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e7) {
                C7351t.m32354l().zzh(e7, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.f1335b.m1512c().evaluateJavascript(str3, null);
        }
        if (((Boolean) zzben.zzc.zze()).booleanValue() && ((Boolean) zzben.zzd.zze()).booleanValue()) {
            this.f1335b.m1515f().zza();
        }
    }

    @Override // p060H2.AbstractC0497b
    public final void onSuccess(C0496a c0496a) {
        final String str;
        String strM2109b = c0496a.m2109b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f1334a);
            if (((Boolean) zzben.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.f1335b.m1514e().m1518b());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
            jSONObject.put("signal", strM2109b);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String strConcat = ((Boolean) zzben.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.f1335b.m1514e().m1518b().toString()) : "";
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f1334a, c0496a.m2109b(), Long.valueOf(((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L), strConcat);
        }
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            try {
                this.f1335b.m1513d().execute(new Runnable() { // from class: E2.S
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f1332a.f1335b.m1512c().evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e7) {
                C7351t.m32354l().zzh(e7, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.f1335b.m1512c().evaluateJavascript(str, null);
        }
        if (((Boolean) zzben.zzc.zze()).booleanValue() && ((Boolean) zzben.zzd.zze()).booleanValue()) {
            this.f1335b.m1515f().zza();
        }
    }
}

package p036E2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzdru;
import com.google.android.gms.internal.ads.zzfti;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzftn;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7590g;

/* JADX INFO: renamed from: E2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0308C {

    /* JADX INFO: renamed from: a */
    private final Context f1289a;

    /* JADX INFO: renamed from: b */
    private final C0330Z f1290b;

    /* JADX INFO: renamed from: c */
    private final long f1291c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f1292d;

    /* JADX INFO: renamed from: e */
    private final PackageInfo f1293e;

    C0308C(Context context, long j7, PackageInfo packageInfo, C0330Z c0330z, ScheduledExecutorService scheduledExecutorService) {
        this.f1289a = context;
        this.f1291c = j7;
        this.f1293e = packageInfo;
        this.f1290b = c0330z;
        this.f1292d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public static String m1481c(String str) {
        return str == null ? "" : C3431F0.m17398V(str, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
    }

    /* JADX INFO: renamed from: e */
    private final boolean m1482e() {
        return this.f1290b.m1509j().size() >= ((Integer) C3250D.m17200c().zzd(zzbci.zzic)).intValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m1483f(Bundle bundle, zzdru zzdruVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzid)).booleanValue()) {
            bundle.putLong(zzdruVar.zza(), C7351t.m32357o().mo18159a());
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m1484g(Bundle bundle, int i7) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i7 - 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m1485a(String str, C0318M c0318m) {
        String string;
        if (TextUtils.isEmpty(str) || m1482e()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", c0318m.f1314a);
            jSONObject2.put("signal_dictionary", C3244B.m17190a().m33298u(c0318m.f1319f));
            jSONObject.put("sr", jSONObject2);
            String str2 = c0318m.f1316c;
            if (TextUtils.isEmpty(str2)) {
                string = "";
            } else {
                jSONObject.put("rs", Base64.encodeToString(m1481c(str2).getBytes(StandardCharsets.UTF_8), 10));
                jSONObject.put("ts_ms", C7351t.m32357o().mo18159a());
                string = jSONObject.toString();
            }
        } catch (JSONException e7) {
            C7351t.m32354l().zzg(e7, "DiskCachingManager.createStringToWrite");
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f1290b.m1500a(str, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C0318M m1486b(zzbyi zzbyiVar, final BinderC0375w binderC0375w, Bundle bundle) {
        C0318M c0318m;
        C0318M c0318m2;
        m1483f(bundle, zzdru.SIGNAL_ON_DISK_VALIDATION_START);
        C0318M c0318m3 = null;
        if (C7351t.m32354l().zzo().zzx()) {
            this.f1290b.m1508i();
            m1484g(bundle, 7);
        } else {
            PackageInfo packageInfo = this.f1293e;
            if (packageInfo != null) {
                C0330Z c0330z = this.f1290b;
                Context context = this.f1289a;
                String strM1504e = c0330z.m1504e();
                int iM1505f = c0330z.m1505f();
                String strM1506g = c0330z.m1506g();
                int iM1507h = c0330z.m1507h();
                if (TextUtils.equals(context.getApplicationInfo().packageName, strM1504e) && iM1505f == packageInfo.versionCode && TextUtils.equals(Build.MODEL, strM1506g) && iM1507h == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : c0330z.m1509j().entrySet()) {
                        try {
                            long j7 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                            try {
                                if (C7351t.m32357o().mo18159a() - j7 > ((Long) C3250D.m17200c().zzd(zzbci.zzib)).longValue()) {
                                    c0318m2 = c0318m3;
                                } else {
                                    zzfti zzftiVarZzi = zzftm.zzh(context).zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdG)).longValue(), C7351t.m32354l().zzo().zzx());
                                    c0318m2 = c0318m3;
                                    zzfti zzftiVarZzi2 = zzftn.zzh(context).zzi(((Long) C3250D.m17200c().zzd(zzbci.zzdH)).longValue(), C7351t.m32354l().zzo().zzx());
                                    if ((zzftiVarZzi.zzb() == -1 || zzftiVarZzi.zzb() <= j7) && (zzftiVarZzi2.zzb() == -1 || zzftiVarZzi2.zzb() <= j7)) {
                                    }
                                    c0318m3 = c0318m2;
                                }
                                c0330z.m1501b((String) entry.getKey());
                            } catch (IOException | JSONException unused) {
                            }
                        } catch (IOException | JSONException unused2) {
                            c0318m2 = c0318m3;
                        }
                        c0318m3 = c0318m2;
                    }
                    c0318m = c0318m3;
                } else {
                    c0318m = null;
                    c0330z.m1508i();
                    c0330z.m1503d(context.getApplicationInfo().packageName, packageInfo.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                m1483f(bundle, zzdru.SIGNAL_ON_DISK_VALIDATION_END);
                if (C7351t.m32357o().mo18159a() - this.f1291c > ((Long) C3250D.m17200c().zzd(zzbci.zzhY)).longValue()) {
                    m1484g(bundle, 2);
                    return c0318m;
                }
                m1483f(bundle, zzdru.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = zzbyiVar.zza;
                String str2 = zzbyiVar.zzb;
                C3349h2 c3349h2 = zzbyiVar.zzd;
                String string = c3349h2.f13962y.toString();
                String string2 = c3349h2.f13951c.toString();
                String str3 = c3349h2.f13957t;
                String str4 = c3349h2.f13936A;
                String strValueOf = String.valueOf(c3349h2.f13963z);
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                int length3 = String.valueOf(string).length();
                int length4 = String.valueOf(string2).length();
                StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + String.valueOf(str3).length() + String.valueOf(str4).length() + strValueOf.length());
                sb.append(str);
                sb.append(str2);
                sb.append(string);
                sb.append(string2);
                sb.append(str3);
                sb.append(str4);
                sb.append(strValueOf);
                final String strM33286p = C7590g.m33286p(sb.toString());
                if (TextUtils.isEmpty(strM33286p)) {
                    m1484g(bundle, 3);
                    return c0318m;
                }
                m1483f(bundle, zzdru.SIGNAL_ON_DISK_CACHE_KEY_END);
                m1483f(bundle, zzdru.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String strM1501b = this.f1290b.m1501b(strM33286p);
                m1483f(bundle, zzdru.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!m1482e()) {
                    final zzbyi zzbyiVar2 = new zzbyi(str, str2, zzbyiVar.zzc, c3349h2, 2, strM33286p);
                    this.f1292d.schedule(new Runnable() { // from class: E2.b
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f1366a.m1487d(strM33286p, binderC0375w, zzbyiVar2);
                        }
                    }, ((Long) C3250D.m17200c().zzd(zzbci.zzia)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(strM1501b)) {
                    m1484g(bundle, 4);
                    return c0318m;
                }
                m1483f(bundle, zzdru.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(strM1501b);
                    String string3 = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string3)) {
                        m1484g(bundle, 8);
                        return c0318m;
                    }
                    String string4 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string4)) {
                        m1484g(bundle, 9);
                        return c0318m;
                    }
                    String strM1481c = m1481c(new String(Base64.decode(string4, 10), StandardCharsets.UTF_8));
                    m1483f(bundle, zzdru.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        C0318M c0318m4 = new C0318M(new JsonReader(new StringReader(string3)), c0318m);
                        c0318m4.f1316c = strM1481c;
                        c0318m4.f1318e = bundle;
                        bundle.putBoolean("sod_h", true);
                        return c0318m4;
                    } catch (IOException e7) {
                        m1484g(bundle, 6);
                        C7351t.m32354l().zzg(e7, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e8) {
                    m1484g(bundle, 5);
                    C7351t.m32354l().zzg(e8, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.f1290b.m1508i();
            m1484g(bundle, 10);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m1487d(String str, BinderC0375w binderC0375w, zzbyi zzbyiVar) {
        if (this.f1290b.m1502c(str) || m1482e()) {
            return;
        }
        binderC0375w.zze(BinderC3773b.m18221N0(this.f1289a), zzbyiVar, null);
    }
}

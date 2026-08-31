package p380w2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.util.AbstractC3467d;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbdu;
import java.util.Map;
import java.util.TreeMap;
import p227d3.C5228d;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: renamed from: w2.r */
/* JADX INFO: loaded from: classes.dex */
final class C7349r {

    /* JADX INFO: renamed from: a */
    private final Context f29231a;

    /* JADX INFO: renamed from: b */
    private final String f29232b;

    /* JADX INFO: renamed from: c */
    private final Map f29233c = new TreeMap();

    /* JADX INFO: renamed from: d */
    private String f29234d;

    /* JADX INFO: renamed from: e */
    private String f29235e;

    /* JADX INFO: renamed from: f */
    private final String f29236f;

    public C7349r(Context context, String str) {
        String strConcat;
        this.f29231a = context.getApplicationContext();
        this.f29232b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = C5228d.m24155a(context).m24152f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            strConcat = sb.toString();
        } catch (PackageManager.NameNotFoundException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Unable to get package version name for reporting", e7);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f29236f = strConcat;
    }

    /* JADX INFO: renamed from: a */
    public final String m32326a() {
        return this.f29235e;
    }

    /* JADX INFO: renamed from: b */
    public final String m32327b() {
        return this.f29234d;
    }

    /* JADX INFO: renamed from: c */
    public final String m32328c() {
        return this.f29232b;
    }

    /* JADX INFO: renamed from: d */
    public final String m32329d() {
        return this.f29236f;
    }

    /* JADX INFO: renamed from: e */
    public final Map m32330e() {
        return this.f29233c;
    }

    /* JADX INFO: renamed from: f */
    public final void m32331f(C3349h2 c3349h2, C7584a c7584a) {
        this.f29234d = c3349h2.f13958u.f13907a;
        Bundle bundle = c3349h2.f13961x;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbdu.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f29235e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f29233c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        Map map = this.f29233c;
        map.put("SDKVersion", c7584a.f30226a);
        if (((Boolean) zzbdu.zza.zze()).booleanValue()) {
            Bundle bundleM17523b = AbstractC3467d.m17523b(this.f29231a, (String) zzbdu.zzb.zze());
            for (String str3 : bundleM17523b.keySet()) {
                map.put(str3, bundleM17523b.get(str3).toString());
            }
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzib;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4353v2 extends AbstractC4197b6 {
    public C4353v2(C4317q6 c4317q6) {
        super(c4317q6);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m19104m() {
        m18696j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f15066a.mo18424e().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: n */
    public final void m19105n(String str, C4205c6 c4205c6, zzib zzibVar, InterfaceC4329s2 interfaceC4329s2) {
        C4353v2 c4353v2;
        String str2;
        mo18427h();
        m18696j();
        try {
            URL url = new URI(c4205c6.m18707a()).toURL();
            this.f15465b.m18903K0();
            byte[] bArrZzcc = zzibVar.zzcc();
            c4353v2 = this;
            str2 = str;
            try {
                this.f15066a.mo18422b().m18642w(new RunnableC4345u2(c4353v2, str2, url, bArrZzcc, c4205c6.m18708b(), interfaceC4329s2));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c4353v2.f15066a.mo18421a().m18851o().m18836c("Failed to parse URL. Not uploading MeasurementBatch. appId", C4313q2.m18846x(str2), c4205c6.m18707a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c4353v2 = this;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m19106o(C4361w2 c4361w2, Map map, InterfaceC4329s2 interfaceC4329s2) {
        C4353v2 c4353v2;
        mo18427h();
        m18696j();
        AbstractC3718s.m18083l(c4361w2);
        AbstractC3718s.m18083l(interfaceC4329s2);
        C4213d6 c4213d6M18893C0 = this.f15465b.m18893C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) AbstractC4209d2.f15663f.m18706b(null)).encodedAuthority((String) AbstractC4209d2.f15666g.m18706b(null)).path("config/app/".concat(String.valueOf(c4361w2.m19180r0()))).appendQueryParameter("platform", "android");
        c4213d6M18893C0.f15066a.m18686w().m18793A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            c4353v2 = this;
            try {
                this.f15066a.mo18422b().m18642w(new RunnableC4345u2(c4353v2, c4361w2.m19174o0(), url, null, map, interfaceC4329s2));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c4353v2.f15066a.mo18421a().m18851o().m18836c("Failed to parse config URL. Not fetching. appId", C4313q2.m18846x(c4361w2.m19174o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c4353v2 = this;
        }
    }
}

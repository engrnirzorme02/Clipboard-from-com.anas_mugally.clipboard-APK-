package com.anas_mugally.clipboard.p221ui.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2615G;
import androidx.lifecycle.InterfaceC2613E;
import androidx.lifecycle.InterfaceC2656r;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.C3521b;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import kotlin.jvm.internal.C6128x;
import p004A2.AbstractC0012a;
import p004A2.AbstractC0013b;
import p068I2.AbstractC0608c;
import p068I2.AbstractC0609d;
import p068I2.InterfaceC0607b;
import p076J2.AbstractC0679a;
import p076J2.AbstractC0680b;
import p145S5.AbstractC1440r;
import p152T5.AbstractC1610H;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p238e6.InterfaceC5356a;
import p314o2.AbstractC6552d;
import p314o2.AbstractC6560l;
import p314o2.C6550b;
import p314o2.C6554f;
import p314o2.C6555g;
import p314o2.C6561m;
import p314o2.C6574z;
import p314o2.InterfaceC6566r;
import p332q2.AbstractC6824a;
import p372v2.InterfaceC7225b;
import p372v2.InterfaceC7226c;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC3130a extends AbstractViewOnClickListenerC3111a implements Application.ActivityLifecycleCallbacks, InterfaceC2656r {

    /* JADX INFO: renamed from: q0 */
    private static long f13031q0;

    /* JADX INFO: renamed from: v0 */
    private static AbstractC6824a f13036v0;

    /* JADX INFO: renamed from: w0 */
    private static long f13037w0;

    /* JADX INFO: renamed from: y0 */
    private static Activity f13039y0;

    /* JADX INFO: renamed from: z0 */
    private static Boolean f13040z0;

    /* JADX INFO: renamed from: f0 */
    private boolean f13041f0;

    /* JADX INFO: renamed from: g0 */
    public static final e f13021g0 = new e(null);

    /* JADX INFO: renamed from: h0 */
    private static String f13022h0 = "ca-app-pub-8204594011340640/8039494086";

    /* JADX INFO: renamed from: i0 */
    private static String f13023i0 = "ca-app-pub-8204594011340640/7139962495";

    /* JADX INFO: renamed from: j0 */
    private static String f13024j0 = "ca-app-pub-8204594011340640/3200717480";

    /* JADX INFO: renamed from: k0 */
    private static String f13025k0 = "ca-app-pub-8204594011340640/2595595714";

    /* JADX INFO: renamed from: l0 */
    private static String f13026l0 = "ca-app-pub-8204594011340640/9707798972";

    /* JADX INFO: renamed from: m0 */
    private static String f13027m0 = "ca-app-pub-8204594011340640/7464779019";

    /* JADX INFO: renamed from: n0 */
    private static String f13028n0 = "ca-app-pub-8204594011340640/8849865641";

    /* JADX INFO: renamed from: o0 */
    private static String f13029o0 = "ca-app-pub-8204594011340640/4934671367";

    /* JADX INFO: renamed from: p0 */
    private static String f13030p0 = "ca-app-pub-8204594011340640/7097800270";

    /* JADX INFO: renamed from: r0 */
    private static final ConcurrentHashMap f13032r0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: s0 */
    private static final ConcurrentHashMap f13033s0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t0 */
    private static final ConcurrentHashMap f13034t0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u0 */
    private static final ConcurrentHashMap f13035u0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x0 */
    private static final ConcurrentHashMap f13038x0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo8536a(boolean z7);
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$b */
    public interface b {

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$b$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static void m16262a(b bVar) {
            }

            /* JADX INFO: renamed from: b */
            public static void m16263b(b bVar) {
            }
        }

        /* JADX INFO: renamed from: a */
        void mo15799a();

        /* JADX INFO: renamed from: b */
        void mo15800b();

        /* JADX INFO: renamed from: c */
        void mo15801c();

        /* JADX INFO: renamed from: d */
        void mo15802d(InterfaceC0607b interfaceC0607b);
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$c */
    public interface c {

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$c$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static void m16264a(c cVar) {
            }

            /* JADX INFO: renamed from: b */
            public static void m16265b(c cVar) {
            }
        }

        /* JADX INFO: renamed from: a */
        void mo15793a();

        /* JADX INFO: renamed from: b */
        void mo15794b();

        /* JADX INFO: renamed from: c */
        void mo15795c();

        /* JADX INFO: renamed from: d */
        void mo15796d(boolean z7);
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$d */
    public enum d {
        INTERSTITIAL,
        REWARDED,
        REWARDED_INTERSTITIAL,
        BANNER,
        NATIVE,
        APP_OPEN;


        /* JADX INFO: renamed from: s */
        private static final /* synthetic */ InterfaceC2059a f13049s = AbstractC2060b.m8524a(m16266c());
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$e */
    public static final class e {
        public /* synthetic */ e(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m16267a() {
            return AbstractActivityC3130a.f13028n0;
        }

        /* JADX INFO: renamed from: b */
        public final String m16268b() {
            return AbstractActivityC3130a.f13029o0;
        }

        /* JADX INFO: renamed from: c */
        public final String m16269c() {
            return AbstractActivityC3130a.f13030p0;
        }

        /* JADX INFO: renamed from: d */
        public final String m16270d() {
            return AbstractActivityC3130a.f13023i0;
        }

        /* JADX INFO: renamed from: e */
        public final String m16271e() {
            return AbstractActivityC3130a.f13024j0;
        }

        /* JADX INFO: renamed from: f */
        public final String m16272f() {
            return AbstractActivityC3130a.f13025k0;
        }

        private e() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$f */
    private static final class f {

        /* JADX INFO: renamed from: a */
        private final AbstractC0012a f13050a;

        /* JADX INFO: renamed from: b */
        private final long f13051b;

        public f(AbstractC0012a ad, long j7) {
            AbstractC6118n.m27187e(ad, "ad");
            this.f13050a = ad;
            this.f13051b = j7;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0012a m16273a() {
            return this.f13050a;
        }

        /* JADX INFO: renamed from: b */
        public final long m16274b() {
            return this.f13051b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC6118n.m27183a(this.f13050a, fVar.f13050a) && this.f13051b == fVar.f13051b;
        }

        public int hashCode() {
            return (this.f13050a.hashCode() * 31) + Long.hashCode(this.f13051b);
        }

        public String toString() {
            return "InterstitialAdData(ad=" + this.f13050a + ", loadTime=" + this.f13051b + ')';
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$g */
    private static final class g {

        /* JADX INFO: renamed from: a */
        private final NativeAd f13052a;

        /* JADX INFO: renamed from: b */
        private final long f13053b;

        public g(NativeAd ad, long j7) {
            AbstractC6118n.m27187e(ad, "ad");
            this.f13052a = ad;
            this.f13053b = j7;
        }

        /* JADX INFO: renamed from: a */
        public final NativeAd m16275a() {
            return this.f13052a;
        }

        /* JADX INFO: renamed from: b */
        public final long m16276b() {
            return this.f13053b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC6118n.m27183a(this.f13052a, gVar.f13052a) && this.f13053b == gVar.f13053b;
        }

        public int hashCode() {
            return (this.f13052a.hashCode() * 31) + Long.hashCode(this.f13053b);
        }

        public String toString() {
            return "NativeAdData(ad=" + this.f13052a + ", loadTime=" + this.f13053b + ')';
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$h */
    private static final class h {

        /* JADX INFO: renamed from: a */
        private final AbstractC0608c f13054a;

        /* JADX INFO: renamed from: b */
        private final long f13055b;

        public h(AbstractC0608c ad, long j7) {
            AbstractC6118n.m27187e(ad, "ad");
            this.f13054a = ad;
            this.f13055b = j7;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0608c m16277a() {
            return this.f13054a;
        }

        /* JADX INFO: renamed from: b */
        public final long m16278b() {
            return this.f13055b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC6118n.m27183a(this.f13054a, hVar.f13054a) && this.f13055b == hVar.f13055b;
        }

        public int hashCode() {
            return (this.f13054a.hashCode() * 31) + Long.hashCode(this.f13055b);
        }

        public String toString() {
            return "RewardedAdData(ad=" + this.f13054a + ", loadTime=" + this.f13055b + ')';
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$i */
    private static final class i {

        /* JADX INFO: renamed from: a */
        private final AbstractC0679a f13056a;

        /* JADX INFO: renamed from: b */
        private final long f13057b;

        public i(AbstractC0679a ad, long j7) {
            AbstractC6118n.m27187e(ad, "ad");
            this.f13056a = ad;
            this.f13057b = j7;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0679a m16279a() {
            return this.f13056a;
        }

        /* JADX INFO: renamed from: b */
        public final long m16280b() {
            return this.f13057b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return AbstractC6118n.m27183a(this.f13056a, iVar.f13056a) && this.f13057b == iVar.f13057b;
        }

        public int hashCode() {
            return (this.f13056a.hashCode() * 31) + Long.hashCode(this.f13057b);
        }

        public String toString() {
            return "RewardedInterstitialAdData(ad=" + this.f13056a + ", loadTime=" + this.f13057b + ')';
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$j */
    public static final class j extends AbstractC6560l {
        j() {
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: b */
        public void mo16281b() {
            AbstractActivityC3130a.this.f13041f0 = false;
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: c */
        public void mo16282c(C6550b adError) {
            AbstractC6118n.m27187e(adError, "adError");
            AbstractActivityC3130a.this.f13041f0 = false;
            AbstractActivityC3130a.f13036v0 = null;
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: e */
        public void mo16283e() {
            AbstractActivityC3130a.this.f13041f0 = true;
            AbstractActivityC3130a.f13031q0 = System.currentTimeMillis();
            AbstractActivityC3130a.f13036v0 = null;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$k */
    public static final class k extends AbstractC6824a.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13059a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f13060b;

        k(String str, a aVar) {
            this.f13059a = str;
            this.f13060b = aVar;
        }

        @Override // p314o2.AbstractC6553e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AbstractC6824a ad) {
            AbstractC6118n.m27187e(ad, "ad");
            AbstractActivityC3130a.f13036v0 = ad;
            AbstractActivityC3130a.f13037w0 = System.currentTimeMillis();
            AbstractActivityC3130a.f13038x0.put(this.f13059a, Boolean.FALSE);
            a aVar = this.f13060b;
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        }

        @Override // p314o2.AbstractC6553e
        public void onAdFailedToLoad(C6561m loadAdError) {
            AbstractC6118n.m27187e(loadAdError, "loadAdError");
            AbstractActivityC3130a.f13038x0.put(this.f13059a, Boolean.FALSE);
            a aVar = this.f13060b;
            if (aVar != null) {
                aVar.mo8536a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$l */
    public static final class l extends AbstractC0013b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13061a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13062b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ a f13063c;

        l(String str, String str2, a aVar) {
            this.f13061a = str;
            this.f13062b = str2;
            this.f13063c = aVar;
        }

        @Override // p314o2.AbstractC6553e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AbstractC0012a interstitialAd) {
            AbstractC6118n.m27187e(interstitialAd, "interstitialAd");
            AbstractActivityC3130a.f13032r0.put(this.f13061a, new f(interstitialAd, System.currentTimeMillis()));
            AbstractActivityC3130a.f13038x0.put(this.f13062b, Boolean.FALSE);
            a aVar = this.f13063c;
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        }

        @Override // p314o2.AbstractC6553e
        public void onAdFailedToLoad(C6561m loadAdError) {
            AbstractC6118n.m27187e(loadAdError, "loadAdError");
            AbstractActivityC3130a.f13038x0.put(this.f13062b, Boolean.FALSE);
            a aVar = this.f13063c;
            if (aVar != null) {
                aVar.mo8536a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$m */
    public static final class m extends AbstractC6552d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13064a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f13065b;

        m(String str, a aVar) {
            this.f13064a = str;
            this.f13065b = aVar;
        }

        @Override // p314o2.AbstractC6552d
        public void onAdFailedToLoad(C6561m loadAdError) {
            AbstractC6118n.m27187e(loadAdError, "loadAdError");
            AbstractActivityC3130a.f13038x0.put(this.f13064a, Boolean.FALSE);
            a aVar = this.f13065b;
            if (aVar != null) {
                aVar.mo8536a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$n */
    public static final class n extends AbstractC0609d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13066a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13067b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ a f13068c;

        n(String str, String str2, a aVar) {
            this.f13066a = str;
            this.f13067b = str2;
            this.f13068c = aVar;
        }

        @Override // p314o2.AbstractC6553e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AbstractC0608c rewardedAd) {
            AbstractC6118n.m27187e(rewardedAd, "rewardedAd");
            AbstractActivityC3130a.f13033s0.put(this.f13066a, new h(rewardedAd, System.currentTimeMillis()));
            AbstractActivityC3130a.f13038x0.put(this.f13067b, Boolean.FALSE);
            a aVar = this.f13068c;
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        }

        @Override // p314o2.AbstractC6553e
        public void onAdFailedToLoad(C6561m loadAdError) {
            AbstractC6118n.m27187e(loadAdError, "loadAdError");
            AbstractActivityC3130a.f13038x0.put(this.f13067b, Boolean.FALSE);
            a aVar = this.f13068c;
            if (aVar != null) {
                aVar.mo8536a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$o */
    public static final class o extends AbstractC0680b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13069a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13070b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ a f13071c;

        o(String str, String str2, a aVar) {
            this.f13069a = str;
            this.f13070b = str2;
            this.f13071c = aVar;
        }

        @Override // p314o2.AbstractC6553e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AbstractC0679a rewardedInterstitialAd) {
            AbstractC6118n.m27187e(rewardedInterstitialAd, "rewardedInterstitialAd");
            AbstractActivityC3130a.f13034t0.put(this.f13069a, new i(rewardedInterstitialAd, System.currentTimeMillis()));
            AbstractActivityC3130a.f13038x0.put(this.f13070b, Boolean.FALSE);
            a aVar = this.f13071c;
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        }

        @Override // p314o2.AbstractC6553e
        public void onAdFailedToLoad(C6561m loadAdError) {
            AbstractC6118n.m27187e(loadAdError, "loadAdError");
            AbstractActivityC3130a.f13038x0.put(this.f13070b, Boolean.FALSE);
            a aVar = this.f13071c;
            if (aVar != null) {
                aVar.mo8536a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$p */
    public static final class p implements InterfaceC2656r {
        p() {
        }

        @InterfaceC2613E(AbstractC2650l.a.ON_STOP)
        public final void onAppBackgrounded() {
            e eVar = AbstractActivityC3130a.f13021g0;
            AbstractActivityC3130a.f13040z0 = Boolean.FALSE;
        }

        @InterfaceC2613E(AbstractC2650l.a.ON_START)
        public final void onAppForegrounded() {
            e eVar = AbstractActivityC3130a.f13021g0;
            AbstractActivityC3130a.f13040z0 = Boolean.TRUE;
            AbstractActivityC3130a.this.m16223c3();
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$q */
    public static final class q extends AbstractC6560l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13074b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ c f13075c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6128x f13076d;

        q(String str, c cVar, C6128x c6128x) {
            this.f13074b = str;
            this.f13075c = cVar;
            this.f13076d = c6128x;
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: b */
        public void mo16281b() {
            AbstractActivityC3130a.this.f13041f0 = false;
            c cVar = this.f13075c;
            if (cVar != null) {
                cVar.mo15796d(this.f13076d.f23885a);
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: c */
        public void mo16282c(C6550b adError) {
            AbstractC6118n.m27187e(adError, "adError");
            AbstractActivityC3130a.this.f13041f0 = false;
            AbstractActivityC3130a.f13032r0.remove(this.f13074b);
            c cVar = this.f13075c;
            if (cVar != null) {
                cVar.mo15795c();
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: d */
        public void mo16288d() {
            this.f13076d.f23885a = true;
            c cVar = this.f13075c;
            if (cVar != null) {
                cVar.mo15794b();
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: e */
        public void mo16283e() {
            AbstractActivityC3130a.this.f13041f0 = true;
            AbstractActivityC3130a.f13031q0 = System.currentTimeMillis();
            AbstractActivityC3130a.f13032r0.remove(this.f13074b);
            c cVar = this.f13075c;
            if (cVar != null) {
                cVar.mo15793a();
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$r */
    public static final class r extends AbstractC6560l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13078b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ b f13079c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6099B f13080d;

        r(String str, b bVar, C6099B c6099b) {
            this.f13078b = str;
            this.f13079c = bVar;
            this.f13080d = c6099b;
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: b */
        public void mo16281b() {
            AbstractActivityC3130a.this.f13041f0 = false;
            b bVar = this.f13079c;
            if (bVar != null) {
                bVar.mo15802d((InterfaceC0607b) this.f13080d.f23859a);
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: c */
        public void mo16282c(C6550b adError) {
            AbstractC6118n.m27187e(adError, "adError");
            AbstractActivityC3130a.this.f13041f0 = false;
            AbstractActivityC3130a.f13033s0.remove(this.f13078b);
            b bVar = this.f13079c;
            if (bVar != null) {
                bVar.mo15801c();
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: d */
        public void mo16288d() {
            b bVar = this.f13079c;
            if (bVar != null) {
                bVar.mo15800b();
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: e */
        public void mo16283e() {
            AbstractActivityC3130a.this.f13041f0 = true;
            AbstractActivityC3130a.f13033s0.remove(this.f13078b);
            b bVar = this.f13079c;
            if (bVar != null) {
                bVar.mo15799a();
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$s */
    public static final class s extends AbstractC6560l {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f13082b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ b f13083c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6099B f13084d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C6128x f13085e;

        s(String str, b bVar, C6099B c6099b, C6128x c6128x) {
            this.f13082b = str;
            this.f13083c = bVar;
            this.f13084d = c6099b;
            this.f13085e = c6128x;
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: b */
        public void mo16281b() {
            AbstractActivityC3130a.this.f13041f0 = false;
            b bVar = this.f13083c;
            if (bVar != null) {
                bVar.mo15802d((InterfaceC0607b) this.f13084d.f23859a);
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: c */
        public void mo16282c(C6550b adError) {
            AbstractC6118n.m27187e(adError, "adError");
            AbstractActivityC3130a.this.f13041f0 = false;
            AbstractActivityC3130a.f13034t0.remove(this.f13082b);
            b bVar = this.f13083c;
            if (bVar != null) {
                bVar.mo15801c();
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: d */
        public void mo16288d() {
            this.f13085e.f23885a = true;
            b bVar = this.f13083c;
            if (bVar != null) {
                bVar.mo15800b();
            }
        }

        @Override // p314o2.AbstractC6560l
        /* JADX INFO: renamed from: e */
        public void mo16283e() {
            AbstractActivityC3130a.this.f13041f0 = true;
            AbstractActivityC3130a.f13034t0.remove(this.f13082b);
            b bVar = this.f13083c;
            if (bVar != null) {
                bVar.mo15799a();
            }
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.a$t */
    public static final class t implements c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5356a f13086a;

        t(InterfaceC5356a interfaceC5356a) {
            this.f13086a = interfaceC5356a;
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: a */
        public void mo15793a() {
            c.a.m16265b(this);
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: b */
        public void mo15794b() {
            c.a.m16264a(this);
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: c */
        public void mo15795c() {
            this.f13086a.invoke();
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.c
        /* JADX INFO: renamed from: d */
        public void mo15796d(boolean z7) {
            this.f13086a.invoke();
        }
    }

    /* JADX INFO: renamed from: B2 */
    private final j m16209B2() {
        return new j();
    }

    /* JADX INFO: renamed from: F2 */
    private final boolean m16210F2(long j7, float f7) {
        return System.currentTimeMillis() - j7 < ((long) (f7 * ((float) 3600000)));
    }

    /* JADX INFO: renamed from: G2 */
    private final boolean m16211G2() {
        return f13036v0 != null && m16210F2(f13037w0, 4.0f);
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ boolean m16212I2(AbstractActivityC3130a abstractActivityC3130a, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInterstitialAdAvailable");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.INTERSTITIAL);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        return abstractActivityC3130a.m16248H2(str);
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ boolean m16213K2(AbstractActivityC3130a abstractActivityC3130a, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isRewardedAdAvailable");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.REWARDED);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        return abstractActivityC3130a.m16249J2(str);
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ boolean m16214M2(AbstractActivityC3130a abstractActivityC3130a, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isRewardedInterstitialAdAvailable");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.REWARDED_INTERSTITIAL);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        return abstractActivityC3130a.m16250L2(str);
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ void m16215O2(AbstractActivityC3130a abstractActivityC3130a, String str, a aVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAppOpenAd");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.APP_OPEN);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        abstractActivityC3130a.m16251N2(str, aVar);
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ void m16216R2(AbstractActivityC3130a abstractActivityC3130a, String str, a aVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadInterstitialAd");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.INTERSTITIAL);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        abstractActivityC3130a.m16253Q2(str, aVar);
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ void m16217T2(AbstractActivityC3130a abstractActivityC3130a, ViewGroup viewGroup, int i7, String str, a aVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadNativeAd");
        }
        if ((i8 & 4) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.NATIVE);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        if ((i8 & 8) != 0) {
            aVar = null;
        }
        abstractActivityC3130a.m16254S2(viewGroup, i7, str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final void m16218U2(String str, String str2, AbstractActivityC3130a abstractActivityC3130a, int i7, ViewGroup viewGroup, a aVar, NativeAd nativeAd) {
        AbstractC6118n.m27187e(nativeAd, "nativeAd");
        try {
            f13038x0.put(str, Boolean.FALSE);
            f13035u0.put(str2, new g(nativeAd, System.currentTimeMillis()));
            View viewInflate = abstractActivityC3130a.getLayoutInflater().inflate(i7, (ViewGroup) null);
            AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
            NativeAdView nativeAdView = (NativeAdView) viewInflate;
            abstractActivityC3130a.m16222a3(nativeAd, nativeAdView);
            viewGroup.removeAllViews();
            viewGroup.addView(nativeAdView);
            viewGroup.setVisibility(0);
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.mo8536a(false);
            }
        }
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m16219W2(AbstractActivityC3130a abstractActivityC3130a, String str, a aVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRewardedAd");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.REWARDED);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        abstractActivityC3130a.m16255V2(str, aVar);
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m16220Y2(AbstractActivityC3130a abstractActivityC3130a, String str, a aVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRewardedInterstitialAd");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.REWARDED_INTERSTITIAL);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        if ((i7 & 2) != 0) {
            aVar = null;
        }
        abstractActivityC3130a.m16256X2(str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public static final void m16221Z2(InterfaceC7225b it) {
        AbstractC6118n.m27187e(it, "it");
    }

    /* JADX INFO: renamed from: a3 */
    private final void m16222a3(NativeAd nativeAd, NativeAdView nativeAdView) {
        TextView textView;
        RatingBar ratingBar;
        TextView textView2;
        TextView textView3;
        ImageView imageView;
        Button button;
        TextView textView4;
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        TextView textView5 = (TextView) nativeAdView.getHeadlineView();
        if (textView5 != null) {
            textView5.setText(nativeAd.getHeadline());
        }
        MediaView mediaView = nativeAdView.getMediaView();
        if (mediaView != null) {
            mediaView.setMediaContent(nativeAd.getMediaContent());
        }
        View bodyView = nativeAdView.getBodyView();
        if (bodyView != null) {
            bodyView.setVisibility(nativeAd.getBody() != null ? 0 : 8);
        }
        if (nativeAd.getBody() != null && (textView4 = (TextView) nativeAdView.getBodyView()) != null) {
            textView4.setText(nativeAd.getBody());
        }
        View callToActionView = nativeAdView.getCallToActionView();
        if (callToActionView != null) {
            callToActionView.setVisibility(nativeAd.getCallToAction() != null ? 0 : 8);
        }
        if (nativeAd.getCallToAction() != null && (button = (Button) nativeAdView.getCallToActionView()) != null) {
            button.setText(nativeAd.getCallToAction());
        }
        View iconView = nativeAdView.getIconView();
        if (iconView != null) {
            iconView.setVisibility(nativeAd.getIcon() != null ? 0 : 8);
        }
        View iconView2 = nativeAdView.getIconView();
        ViewGroup viewGroup = (ViewGroup) (iconView2 != null ? iconView2.getParent() : null);
        if (viewGroup != null) {
            viewGroup.setVisibility(nativeAd.getIcon() != null ? 0 : 8);
        }
        if (nativeAd.getIcon() != null && (imageView = (ImageView) nativeAdView.getIconView()) != null) {
            NativeAd.AbstractC3517b icon = nativeAd.getIcon();
            imageView.setImageDrawable(icon != null ? icon.getDrawable() : null);
        }
        View priceView = nativeAdView.getPriceView();
        if (priceView != null) {
            priceView.setVisibility(nativeAd.getPrice() != null ? 0 : 8);
        }
        if (nativeAd.getPrice() != null && (textView3 = (TextView) nativeAdView.getPriceView()) != null) {
            textView3.setText(nativeAd.getPrice());
        }
        View storeView = nativeAdView.getStoreView();
        if (storeView != null) {
            storeView.setVisibility(nativeAd.getStore() != null ? 0 : 8);
        }
        if (nativeAd.getStore() != null && (textView2 = (TextView) nativeAdView.getStoreView()) != null) {
            textView2.setText(nativeAd.getStore());
        }
        View starRatingView = nativeAdView.getStarRatingView();
        if (starRatingView != null) {
            starRatingView.setVisibility(nativeAd.getStarRating() != null ? 0 : 8);
        }
        if (nativeAd.getStarRating() != null && (ratingBar = (RatingBar) nativeAdView.getStarRatingView()) != null) {
            Double starRating = nativeAd.getStarRating();
            AbstractC6118n.m27184b(starRating);
            ratingBar.setRating((float) starRating.doubleValue());
        }
        View advertiserView = nativeAdView.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setVisibility(nativeAd.getAdvertiser() != null ? 0 : 8);
        }
        if (nativeAd.getAdvertiser() != null && (textView = (TextView) nativeAdView.getAdvertiserView()) != null) {
            textView.setText(nativeAd.getAdvertiser());
        }
        nativeAdView.setNativeAd(nativeAd);
        MediaView mediaView2 = nativeAdView.getMediaView();
        if (mediaView2 != null) {
            mediaView2.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public final void m16223c3() {
        Activity activity = f13039y0;
        if (activity != null && (activity instanceof AbstractActivityC3130a) && ((AbstractActivityC3130a) activity).m16257b3() && !this.f13041f0 && m16211G2()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - f13031q0;
            if (jCurrentTimeMillis < 3600000) {
                Log.d("BaseAdsActivity", "App Open ad blocked: Not enough time passed since last full-screen ad. Need " + ((((long) 3600000) - jCurrentTimeMillis) / ((long) zzbbn.zzq.zzf)) + " more seconds.");
                return;
            }
            AbstractC6824a abstractC6824a = f13036v0;
            if (abstractC6824a != null) {
                abstractC6824a.setFullScreenContentCallback(m16209B2());
                abstractC6824a.show(activity);
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ boolean m16224e3(AbstractActivityC3130a abstractActivityC3130a, String str, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showInterstitialAd");
        }
        if ((i7 & 1) != 0) {
            Object obj2 = abstractActivityC3130a.mo15787C2().get(d.INTERSTITIAL);
            AbstractC6118n.m27184b(obj2);
            str = (String) obj2;
        }
        if ((i7 & 2) != 0) {
            cVar = null;
        }
        return abstractActivityC3130a.m16258d3(str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final void m16226g3(C6099B c6099b, InterfaceC0607b reward) {
        AbstractC6118n.m27187e(reward, "reward");
        c6099b.f23859a = reward;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final void m16229i3(C6099B c6099b, InterfaceC0607b reward) {
        AbstractC6118n.m27187e(reward, "reward");
        c6099b.f23859a = reward;
    }

    /* JADX INFO: renamed from: A2 */
    protected boolean mo15786A2() {
        return true;
    }

    /* JADX INFO: renamed from: C2 */
    protected Map mo15787C2() {
        return AbstractC1610H.m6629k(AbstractC1440r.m6083a(d.INTERSTITIAL, f13023i0), AbstractC1440r.m6083a(d.REWARDED, f13024j0), AbstractC1440r.m6083a(d.REWARDED_INTERSTITIAL, f13025k0), AbstractC1440r.m6083a(d.APP_OPEN, f13027m0), AbstractC1440r.m6083a(d.NATIVE, f13026l0), AbstractC1440r.m6083a(d.BANNER, f13022h0));
    }

    /* JADX INFO: renamed from: D2 */
    protected abstract Set mo15494D2();

    /* JADX INFO: renamed from: E2 */
    protected final boolean m16247E2(d adType) {
        AbstractC6118n.m27187e(adType, "adType");
        Set setMo15494D2 = mo15494D2();
        if (setMo15494D2 == null) {
            return false;
        }
        return setMo15494D2.contains(adType);
    }

    /* JADX INFO: renamed from: H2 */
    public final boolean m16248H2(String adUnitId) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        f fVar = (f) f13032r0.get(adUnitId);
        return fVar != null && m16210F2(fVar.m16274b(), 1.0f);
    }

    /* JADX INFO: renamed from: J2 */
    public final boolean m16249J2(String adUnitId) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        h hVar = (h) f13033s0.get(adUnitId);
        return hVar != null && m16210F2(hVar.m16278b(), 1.0f);
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m16250L2(String adUnitId) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        i iVar = (i) f13034t0.get(adUnitId);
        return iVar != null && m16210F2(iVar.m16280b(), 1.0f);
    }

    /* JADX INFO: renamed from: N2 */
    protected final void m16251N2(String adUnitId, a aVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.APP_OPEN)) {
            if (aVar != null) {
                aVar.mo8536a(false);
                return;
            }
            return;
        }
        if (m16211G2()) {
            if (aVar != null) {
                aVar.mo8536a(true);
                return;
            }
            return;
        }
        String str = "open_" + adUnitId;
        ConcurrentHashMap concurrentHashMap = f13038x0;
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (AbstractC6118n.m27183a(obj, bool)) {
            return;
        }
        concurrentHashMap.put(str, bool);
        C6555g c6555gM27825k = new C6555g.a().m27825k();
        AbstractC6118n.m27186d(c6555gM27825k, "build(...)");
        AbstractC6824a.load(this, adUnitId, c6555gM27825k, new k(str, aVar));
    }

    /* JADX INFO: renamed from: P2 */
    protected final void m16252P2() {
        if (m16247E2(d.INTERSTITIAL) && !m16212I2(this, null, 1, null)) {
            m16216R2(this, null, null, 3, null);
        }
        if (m16247E2(d.REWARDED) && !m16213K2(this, null, 1, null)) {
            m16219W2(this, null, null, 3, null);
        }
        if (m16247E2(d.REWARDED_INTERSTITIAL) && !m16214M2(this, null, 1, null)) {
            m16220Y2(this, null, null, 3, null);
        }
        if (!m16247E2(d.APP_OPEN) || m16211G2()) {
            return;
        }
        m16215O2(this, null, null, 3, null);
    }

    /* JADX INFO: renamed from: Q2 */
    protected final void m16253Q2(String adUnitId, a aVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.INTERSTITIAL)) {
            if (aVar != null) {
                aVar.mo8536a(false);
                return;
            }
            return;
        }
        String str = "interstitial_" + adUnitId;
        if (m16248H2(adUnitId)) {
            if (aVar != null) {
                aVar.mo8536a(true);
                return;
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = f13038x0;
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (AbstractC6118n.m27183a(obj, bool)) {
            return;
        }
        concurrentHashMap.put(str, bool);
        C6555g c6555gM27825k = new C6555g.a().m27825k();
        AbstractC6118n.m27186d(c6555gM27825k, "build(...)");
        AbstractC0012a.load(this, adUnitId, c6555gM27825k, new l(adUnitId, str, aVar));
    }

    /* JADX INFO: renamed from: S2 */
    public final void m16254S2(final ViewGroup container, final int i7, final String adUnitId, final a aVar) {
        AbstractC6118n.m27187e(container, "container");
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.NATIVE)) {
            if (aVar != null) {
                aVar.mo8536a(false);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("native_");
        Activity activity = f13039y0;
        sb.append(activity != null ? activity.getClass().getName() : null);
        sb.append('_');
        sb.append(adUnitId);
        final String string = sb.toString();
        g gVar = (g) f13035u0.get(adUnitId);
        if (gVar != null && m16210F2(gVar.m16276b(), 0.02f)) {
            try {
                View viewInflate = getLayoutInflater().inflate(i7, (ViewGroup) null);
                AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
                NativeAdView nativeAdView = (NativeAdView) viewInflate;
                m16222a3(gVar.m16275a(), nativeAdView);
                container.removeAllViews();
                container.addView(nativeAdView);
                container.setVisibility(0);
                if (aVar != null) {
                    aVar.mo8536a(true);
                    return;
                }
                return;
            } catch (Exception unused) {
            }
        }
        ConcurrentHashMap concurrentHashMap = f13038x0;
        Object obj = concurrentHashMap.get(string);
        Boolean bool = Boolean.TRUE;
        if (AbstractC6118n.m27183a(obj, bool)) {
            return;
        }
        concurrentHashMap.put(string, bool);
        C6554f.a aVar2 = new C6554f.a(this, adUnitId);
        aVar2.m27819c(new m(string, aVar));
        aVar2.m27818b(new NativeAd.InterfaceC3518c() { // from class: p1.d
            @Override // com.google.android.gms.ads.nativead.NativeAd.InterfaceC3518c
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                AbstractActivityC3130a.m16218U2(string, adUnitId, this, i7, container, aVar, nativeAd);
            }
        });
        C6574z c6574zM27874a = new C6574z.a().m27877d(true).m27874a();
        AbstractC6118n.m27186d(c6574zM27874a, "build(...)");
        C3521b c3521bM17619a = new C3521b.a().m17626h(c6574zM27874a).m17619a();
        AbstractC6118n.m27186d(c3521bM17619a, "build(...)");
        aVar2.m27820d(c3521bM17619a);
        aVar2.m27817a().m27815a(new C6555g.a().m27825k());
    }

    /* JADX INFO: renamed from: V2 */
    protected final void m16255V2(String adUnitId, a aVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.REWARDED)) {
            if (aVar != null) {
                aVar.mo8536a(false);
                return;
            }
            return;
        }
        String str = "rewarded_" + adUnitId;
        ConcurrentHashMap concurrentHashMap = f13038x0;
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (AbstractC6118n.m27183a(obj, bool)) {
            return;
        }
        if (m16249J2(adUnitId)) {
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        } else {
            concurrentHashMap.put(str, bool);
            C6555g c6555gM27825k = new C6555g.a().m27825k();
            AbstractC6118n.m27186d(c6555gM27825k, "build(...)");
            AbstractC0608c.load(this, adUnitId, c6555gM27825k, new n(adUnitId, str, aVar));
        }
    }

    /* JADX INFO: renamed from: X2 */
    protected final void m16256X2(String adUnitId, a aVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.REWARDED_INTERSTITIAL)) {
            if (aVar != null) {
                aVar.mo8536a(false);
                return;
            }
            return;
        }
        String str = "rewarded_interstitial_" + adUnitId;
        ConcurrentHashMap concurrentHashMap = f13038x0;
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (AbstractC6118n.m27183a(obj, bool)) {
            return;
        }
        if (m16250L2(adUnitId)) {
            if (aVar != null) {
                aVar.mo8536a(true);
            }
        } else {
            concurrentHashMap.put(str, bool);
            C6555g c6555gM27825k = new C6555g.a().m27825k();
            AbstractC6118n.m27186d(c6555gM27825k, "build(...)");
            AbstractC0679a.load(this, adUnitId, c6555gM27825k, new o(adUnitId, str, aVar));
        }
    }

    /* JADX INFO: renamed from: b3 */
    protected boolean m16257b3() {
        return m16247E2(d.APP_OPEN);
    }

    /* JADX INFO: renamed from: d3 */
    public final boolean m16258d3(String adUnitId, c cVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.INTERSTITIAL)) {
            if (cVar != null) {
                cVar.mo15795c();
            }
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - f13031q0;
        if (jCurrentTimeMillis < 3600000) {
            Log.d("BaseAdsActivity", "Interstitial ad blocked: Not enough time passed since last full-screen ad. Need " + ((((long) 3600000) - jCurrentTimeMillis) / ((long) zzbbn.zzq.zzf)) + " more seconds.");
            if (cVar != null) {
                cVar.mo15795c();
            }
            return false;
        }
        f fVar = (f) f13032r0.get(adUnitId);
        if (fVar == null || !m16210F2(fVar.m16274b(), 1.0f) || this.f13041f0) {
            if (cVar != null) {
                cVar.mo15795c();
            }
            return false;
        }
        AbstractC0012a abstractC0012aM16273a = fVar.m16273a();
        abstractC0012aM16273a.setFullScreenContentCallback(new q(adUnitId, cVar, new C6128x()));
        abstractC0012aM16273a.show(this);
        return true;
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m16259f3(String adUnitId, b bVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.REWARDED)) {
            if (bVar != null) {
                bVar.mo15801c();
            }
            return false;
        }
        h hVar = (h) f13033s0.get(adUnitId);
        if (hVar == null || !m16210F2(hVar.m16278b(), 1.0f) || this.f13041f0) {
            if (bVar != null) {
                bVar.mo15801c();
            }
            return false;
        }
        AbstractC0608c abstractC0608cM16277a = hVar.m16277a();
        final C6099B c6099b = new C6099B();
        abstractC0608cM16277a.setFullScreenContentCallback(new r(adUnitId, bVar, c6099b));
        abstractC0608cM16277a.show(this, new InterfaceC6566r() { // from class: p1.b
            @Override // p314o2.InterfaceC6566r
            public final void onUserEarnedReward(InterfaceC0607b interfaceC0607b) {
                AbstractActivityC3130a.m16226g3(c6099b, interfaceC0607b);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m16260h3(String adUnitId, b bVar) {
        AbstractC6118n.m27187e(adUnitId, "adUnitId");
        if (!m16247E2(d.REWARDED_INTERSTITIAL)) {
            if (bVar != null) {
                bVar.mo15801c();
            }
            return false;
        }
        i iVar = (i) f13034t0.get(adUnitId);
        if (iVar == null || !m16210F2(iVar.m16280b(), 1.0f) || this.f13041f0) {
            if (bVar != null) {
                bVar.mo15801c();
            }
            return false;
        }
        AbstractC0679a abstractC0679aM16279a = iVar.m16279a();
        final C6099B c6099b = new C6099B();
        abstractC0679aM16279a.setFullScreenContentCallback(new s(adUnitId, bVar, c6099b, new C6128x()));
        abstractC0679aM16279a.show(this, new InterfaceC6566r() { // from class: p1.a
            @Override // p314o2.InterfaceC6566r
            public final void onUserEarnedReward(InterfaceC0607b interfaceC0607b) {
                AbstractActivityC3130a.m16229i3(c6099b, interfaceC0607b);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m16261j3(InterfaceC5356a function) {
        AbstractC6118n.m27187e(function, "function");
        m16224e3(this, null, new t(function), 1, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC6118n.m27187e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
        if (AbstractC6118n.m27183a(f13039y0, activity)) {
            f13039y0 = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
        f13039y0 = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC6118n.m27187e(activity, "activity");
        AbstractC6118n.m27187e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
        f13039y0 = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (f13040z0 == null) {
            MobileAds.m17167a(this, new InterfaceC7226c() { // from class: p1.c
                @Override // p372v2.InterfaceC7226c
                /* JADX INFO: renamed from: a */
                public final void mo29535a(InterfaceC7225b interfaceC7225b) {
                    AbstractActivityC3130a.m16221Z2(interfaceC7225b);
                }
            });
            C2615G.f10393t.m12539a().mo419P().mo12625a(new p());
            getApplication().registerActivityLifecycleCallbacks(this);
        }
        super.onCreate(bundle);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        f13039y0 = this;
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (mo15786A2()) {
            m16252P2();
        }
    }
}

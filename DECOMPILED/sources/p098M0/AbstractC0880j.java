package p098M0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p105N0.AbstractC0914b;
import p105N0.AbstractC0928p;
import p105N0.AbstractC0929q;
import p105N0.C0930r;
import p105N0.InterfaceC0931s;

/* JADX INFO: renamed from: M0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0880j {

    /* JADX INFO: renamed from: a */
    private static final Uri f3466a = Uri.parse("*");

    /* JADX INFO: renamed from: b */
    private static final Uri f3467b = Uri.parse("");

    /* JADX INFO: renamed from: c */
    private static boolean f3468c = true;

    /* JADX INFO: renamed from: d */
    private static final WeakHashMap f3469d = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0.j$b */
    static class b implements InterfaceC0883m {
        private b() {
        }

        @Override // p098M0.InterfaceC0883m
        public Long getTotalTimeInUiThreadMillis() {
            return null;
        }
    }

    /* JADX INFO: renamed from: M0.j$c */
    public interface c {
        void onPostMessage(WebView webView, C0874d c0874d, Uri uri, boolean z7, AbstractC0871a abstractC0871a);
    }

    /* JADX INFO: renamed from: M0.j$d */
    public interface d {
        void onSuccess(InterfaceC0883m interfaceC0883m);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4020b(C0882l c0882l, final d dVar, Context context) {
        AbstractC0929q.m4164d();
        if (AbstractC0928p.f3619m0.mo4147d()) {
            m4027i().mo4152b(c0882l, new d() { // from class: M0.g
                @Override // p098M0.AbstractC0880j.d
                public final void onSuccess(InterfaceC0883m interfaceC0883m) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: M0.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.onSuccess(interfaceC0883m);
                        }
                    });
                }
            });
            return;
        }
        if (c0882l.m4037b()) {
            WebSettings.getDefaultUserAgent(context.getApplicationContext());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: M0.h
            @Override // java.lang.Runnable
            public final void run() {
                dVar.onSuccess(new AbstractC0880j.b());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC0873c m4023e(WebView webView, String str, Set set) {
        if (AbstractC0928p.f3590W.mo4147d()) {
            return m4028j(webView).m4166a(str, (String[]) set.toArray(new String[0]));
        }
        throw AbstractC0928p.m4158a();
    }

    /* JADX INFO: renamed from: f */
    public static void m4024f(WebView webView, String str, Set set, c cVar) {
        if (!AbstractC0928p.f3589V.mo4147d()) {
            throw AbstractC0928p.m4158a();
        }
        m4028j(webView).m4167b(str, (String[]) set.toArray(new String[0]), cVar);
    }

    /* JADX INFO: renamed from: g */
    private static WebViewProviderBoundaryInterface m4025g(WebView webView) {
        return m4027i().createWebView(webView);
    }

    /* JADX INFO: renamed from: h */
    public static PackageInfo m4026h() {
        return AbstractC0914b.m4148a();
    }

    /* JADX INFO: renamed from: i */
    private static InterfaceC0931s m4027i() {
        return AbstractC0929q.m4163c();
    }

    /* JADX INFO: renamed from: j */
    private static C0930r m4028j(WebView webView) {
        if (!AbstractC0928p.f3631s0.mo4147d() || !f3468c) {
            return new C0930r(m4025g(webView));
        }
        WeakHashMap weakHashMap = f3469d;
        C0930r c0930r = (C0930r) weakHashMap.get(webView);
        if (c0930r != null) {
            return c0930r;
        }
        C0930r c0930r2 = new C0930r(m4025g(webView));
        weakHashMap.put(webView, c0930r2);
        return c0930r2;
    }

    /* JADX INFO: renamed from: k */
    public static String m4029k() {
        if (AbstractC0928p.f3592Y.mo4147d()) {
            return m4027i().getStatics().getVariationsHeader();
        }
        throw AbstractC0928p.m4158a();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4030l() {
        if (AbstractC0928p.f3586S.mo4147d()) {
            return m4027i().getStatics().isMultiProcessEnabled();
        }
        throw AbstractC0928p.m4158a();
    }

    /* JADX INFO: renamed from: m */
    public static void m4031m(WebView webView, String str) {
        if (!AbstractC0928p.f3589V.mo4147d()) {
            throw AbstractC0928p.m4158a();
        }
        m4028j(webView).m4168c(str);
    }

    /* JADX INFO: renamed from: n */
    public static void m4032n(WebView webView, boolean z7) {
        if (!AbstractC0928p.f3607g0.mo4147d()) {
            throw AbstractC0928p.m4158a();
        }
        m4028j(webView).m4169d(z7);
    }

    /* JADX INFO: renamed from: o */
    public static void m4033o(WebView webView, String str) {
        if (!AbstractC0928p.f3601d0.mo4147d()) {
            throw AbstractC0928p.m4158a();
        }
        m4028j(webView).m4170e(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m4034p(final Context context, final C0882l c0882l, final d dVar) {
        c0882l.m4036a().execute(new Runnable() { // from class: M0.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0880j.m4020b(c0882l, dVar, context);
            }
        });
    }
}

package p105N0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.AbstractC0880j;
import p098M0.C0882l;

/* JADX INFO: renamed from: N0.t */
/* JADX INFO: loaded from: classes.dex */
public class C0932t implements InterfaceC0931s {

    /* JADX INFO: renamed from: a */
    final WebViewProviderFactoryBoundaryInterface f3644a;

    public C0932t(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f3644a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p105N0.InterfaceC0931s
    /* JADX INFO: renamed from: a */
    public String[] mo4151a() {
        return this.f3644a.getSupportedFeatures();
    }

    @Override // p105N0.InterfaceC0931s
    /* JADX INFO: renamed from: b */
    public void mo4152b(C0882l c0882l, AbstractC0880j.d dVar) {
        this.f3644a.startUpWebView(AbstractC0764a.m3596c(new C0934v(c0882l)), AbstractC0764a.m3596c(new C0933u(dVar)));
    }

    @Override // p105N0.InterfaceC0931s
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) AbstractC0764a.m3594a(WebViewProviderBoundaryInterface.class, this.f3644a.createWebView(webView));
    }

    @Override // p105N0.InterfaceC0931s
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) AbstractC0764a.m3594a(ProfileStoreBoundaryInterface.class, this.f3644a.getProfileStore());
    }

    @Override // p105N0.InterfaceC0931s
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) AbstractC0764a.m3594a(StaticsBoundaryInterface.class, this.f3644a.getStatics());
    }
}

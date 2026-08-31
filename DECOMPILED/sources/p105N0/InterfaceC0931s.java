package p105N0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p098M0.AbstractC0880j;
import p098M0.C0882l;

/* JADX INFO: renamed from: N0.s */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0931s {
    /* JADX INFO: renamed from: a */
    String[] mo4151a();

    /* JADX INFO: renamed from: b */
    void mo4152b(C0882l c0882l, AbstractC0880j.d dVar);

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    ProfileStoreBoundaryInterface getProfileStore();

    StaticsBoundaryInterface getStatics();
}

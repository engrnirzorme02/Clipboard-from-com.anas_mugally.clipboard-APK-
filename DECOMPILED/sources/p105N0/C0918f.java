package p105N0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p098M0.AbstractC0880j;
import p098M0.C0882l;

/* JADX INFO: renamed from: N0.f */
/* JADX INFO: loaded from: classes.dex */
public class C0918f implements InterfaceC0931s {

    /* JADX INFO: renamed from: a */
    private static final String[] f3555a = new String[0];

    @Override // p105N0.InterfaceC0931s
    /* JADX INFO: renamed from: a */
    public String[] mo4151a() {
        return f3555a;
    }

    @Override // p105N0.InterfaceC0931s
    /* JADX INFO: renamed from: b */
    public void mo4152b(C0882l c0882l, AbstractC0880j.d dVar) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p105N0.InterfaceC0931s
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p105N0.InterfaceC0931s
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p105N0.InterfaceC0931s
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}

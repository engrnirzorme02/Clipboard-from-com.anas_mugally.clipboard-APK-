package p105N0;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.AbstractC0880j;
import p098M0.C0874d;

/* JADX INFO: renamed from: N0.n */
/* JADX INFO: loaded from: classes.dex */
public class C0926n implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a */
    private final AbstractC0880j.c f3566a;

    public C0926n(AbstractC0880j.c cVar) {
        this.f3566a = cVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z7, InvocationHandler invocationHandler2) {
        C0874d c0874dM4157b = AbstractC0925m.m4157b((WebMessageBoundaryInterface) AbstractC0764a.m3594a(WebMessageBoundaryInterface.class, invocationHandler));
        if (c0874dM4157b != null) {
            this.f3566a.onPostMessage(webView, c0874dM4157b, uri, z7, C0920h.m4154b(invocationHandler2));
        }
    }
}

package p105N0;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.AbstractC0880j;

/* JADX INFO: renamed from: N0.r */
/* JADX INFO: loaded from: classes.dex */
public class C0930r {

    /* JADX INFO: renamed from: a */
    final WebViewProviderBoundaryInterface f3643a;

    public C0930r(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f3643a = webViewProviderBoundaryInterface;
    }

    /* JADX INFO: renamed from: a */
    public C0923k m4166a(String str, String[] strArr) {
        return C0923k.m4155a(this.f3643a.addDocumentStartJavaScript(str, strArr));
    }

    /* JADX INFO: renamed from: b */
    public void m4167b(String str, String[] strArr, AbstractC0880j.c cVar) {
        this.f3643a.addWebMessageListener(str, strArr, AbstractC0764a.m3596c(new C0926n(cVar)));
    }

    /* JADX INFO: renamed from: c */
    public void m4168c(String str) {
        this.f3643a.removeWebMessageListener(str);
    }

    /* JADX INFO: renamed from: d */
    public void m4169d(boolean z7) {
        this.f3643a.setAudioMuted(z7);
    }

    /* JADX INFO: renamed from: e */
    public void m4170e(String str) {
        this.f3643a.setProfile(str);
    }
}

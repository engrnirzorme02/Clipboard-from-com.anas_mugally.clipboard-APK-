package p036E2;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0342f0 extends zzbkh {

    /* JADX INFO: renamed from: a */
    private final WebView f1385a;

    /* JADX INFO: renamed from: b */
    private final C0334b0 f1386b;

    /* JADX INFO: renamed from: c */
    private final Executor f1387c;

    /* JADX INFO: renamed from: d */
    private WebViewClient f1388d;

    public C0342f0(WebView webView, C0334b0 c0334b0, zzgpd zzgpdVar) {
        this.f1385a = webView;
        this.f1386b = c0334b0;
        this.f1387c = zzgpdVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m1528b() {
        this.f1385a.evaluateJavascript(String.format(Locale.getDefault(), (String) C3250D.m17200c().zzd(zzbci.zzkC), this.f1386b.m1518b()), null);
    }

    /* JADX INFO: renamed from: c */
    private final boolean m1529c() {
        if (!((Boolean) zzben.zza.zze()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z7 = false;
        boolean z8 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(C0342f0.class.getName())) {
                if (z7 && z8) {
                    return true;
                }
                z7 = true;
            } else if (z7) {
                z8 = true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m1530a() {
        try {
            C7351t.m32349g();
            WebViewClient webViewClient = this.f1385a.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.f1388d = webViewClient;
            }
            this.f1385a.setWebViewClient(this);
            m1528b();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
        if (m1529c()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh
    protected final WebViewClient getDelegate() {
        return this.f1388d;
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (m1529c()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (m1529c()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (m1529c()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (m1529c()) {
            return;
        }
        m1528b();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (m1529c()) {
            return;
        }
        m1528b();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (m1529c()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        if (m1529c()) {
            return;
        }
        super.onReceivedError(webView, i7, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (m1529c()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (m1529c()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (m1529c()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (m1529c()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (m1529c()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        if (m1529c()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i7, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f7, float f8) {
        if (m1529c()) {
            return;
        }
        super.onScaleChanged(webView, f7, f8);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (m1529c()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (m1529c()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (m1529c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (m1529c()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (m1529c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.f1387c.execute(new Runnable() { // from class: E2.d0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f1378a.m1530a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (m1529c()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (m1529c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (m1529c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}

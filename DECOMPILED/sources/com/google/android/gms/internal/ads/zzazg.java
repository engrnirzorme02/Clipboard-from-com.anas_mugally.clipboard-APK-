package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzazg implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzayy zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzazi zze;

    zzazg(zzazi zzaziVar, final zzayy zzayyVar, final WebView webView, final boolean z7) {
        this.zzb = zzayyVar;
        this.zzc = webView;
        this.zzd = z7;
        Objects.requireNonNull(zzaziVar);
        this.zze = zzaziVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazf
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzayyVar, webView, (String) obj, z7);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmn implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzfmn(zzfmo zzfmoVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzfmoVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfmo.zzk(this.zza, this.zzb);
    }
}

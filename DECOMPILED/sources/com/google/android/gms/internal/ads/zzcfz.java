package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfz extends zzcfy {
    public zzcfz(zzcek zzcekVar, zzbbh zzbbhVar, boolean z7, zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z7, zzecyVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}

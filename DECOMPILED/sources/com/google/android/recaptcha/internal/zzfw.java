package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfw {
    private final WebView zza;
    private final InterfaceC6624N zzb;

    public zzfw(WebView webView, InterfaceC6624N interfaceC6624N) {
        this.zza = webView;
        this.zzb = interfaceC6624N;
    }

    public final void zzb(String str, String... strArr) {
        AbstractC6672k.m28227d(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}

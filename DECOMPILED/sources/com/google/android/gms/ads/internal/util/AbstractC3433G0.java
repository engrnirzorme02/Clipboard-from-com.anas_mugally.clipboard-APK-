package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.G0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3433G0 extends AbstractC3451P0 {
    public AbstractC3433G0() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: a */
    public final CookieManager mo17452a(Context context) {
        C7351t.m32349g();
        if (C3431F0.m17418j()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Failed to obtain CookieManager.", th);
            C7351t.m32354l().zzh(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: c */
    public final WebResourceResponse mo17453c(String str, String str2, int i7, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i7, str3, map, inputStream);
    }
}

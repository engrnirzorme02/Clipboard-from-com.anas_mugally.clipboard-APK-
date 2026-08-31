package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.U */
/* JADX INFO: loaded from: classes.dex */
public final class C3455U {

    /* JADX INFO: renamed from: a */
    final Map f14215a = new ConcurrentHashMap();

    public C3455U() {
        new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m17491a(Integer num) {
        return (Bitmap) this.f14215a.get(num);
    }
}

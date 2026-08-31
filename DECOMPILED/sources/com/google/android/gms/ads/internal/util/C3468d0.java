package com.google.android.gms.ads.internal.util;

import android.content.Context;
import java.io.IOException;
import p170W2.C1842g;
import p170W2.C1843h;
import p356t2.C7073a;
import p404z2.AbstractC7599p;
import p404z2.C7596m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.d0 */
/* JADX INFO: loaded from: classes.dex */
final class C3468d0 extends AbstractC3422B {

    /* JADX INFO: renamed from: a */
    private final Context f14235a;

    C3468d0(Context context) {
        this.f14235a = context;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3422B
    public final void zza() {
        boolean zM31182b;
        try {
            zM31182b = C7073a.m31182b(this.f14235a);
        } catch (C1842g | C1843h | IOException | IllegalStateException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Fail to get isAdIdFakeForDebugLogging", e7);
            zM31182b = false;
        }
        C7596m.m33302h(zM31182b);
        StringBuilder sb = new StringBuilder(String.valueOf(zM31182b).length() + 38);
        sb.append("Update ad debug logging enablement as ");
        sb.append(zM31182b);
        String string = sb.toString();
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(string);
    }
}

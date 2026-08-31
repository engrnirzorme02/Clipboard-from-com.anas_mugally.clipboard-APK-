package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC4778h;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.z */
/* JADX INFO: loaded from: classes2.dex */
final class C4756z {

    /* JADX INFO: renamed from: a */
    private static C4749s f18365a;

    /* JADX INFO: renamed from: a */
    static synchronized C4749s m21884a(Context context) {
        try {
            if (f18365a == null) {
                C4747q c4747q = new C4747q(null);
                c4747q.m21879a(AbstractC4778h.m21922a(context));
                f18365a = c4747q.mo21880b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18365a;
    }
}

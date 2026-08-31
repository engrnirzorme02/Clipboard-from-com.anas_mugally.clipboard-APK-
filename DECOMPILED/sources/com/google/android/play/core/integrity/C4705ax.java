package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC4778h;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ax */
/* JADX INFO: loaded from: classes2.dex */
final class C4705ax {

    /* JADX INFO: renamed from: a */
    private static InterfaceC4704aw f18281a;

    /* JADX INFO: renamed from: a */
    static synchronized InterfaceC4704aw m21850a(Context context) {
        try {
            if (f18281a == null) {
                C4751u c4751u = new C4751u(null);
                c4751u.m21882a(AbstractC4778h.m21922a(context));
                f18281a = c4751u.mo21848b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18281a;
    }
}

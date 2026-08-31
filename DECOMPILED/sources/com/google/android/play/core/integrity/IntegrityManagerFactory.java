package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return C4756z.m21884a(context).m21881a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return C4705ax.m21850a(context).mo21849a();
    }
}

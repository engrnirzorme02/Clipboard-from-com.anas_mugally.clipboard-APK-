package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3554b;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C4737i implements InterfaceC4739k {
    C4737i() {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC4739k
    /* JADX INFO: renamed from: a */
    public final C3554b mo21874a(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        return new IntegrityServiceException(i7, null);
    }
}

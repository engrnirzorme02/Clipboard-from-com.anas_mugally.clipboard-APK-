package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aa */
/* JADX INFO: loaded from: classes2.dex */
final class C4682aa implements IntegrityManager {

    /* JADX INFO: renamed from: a */
    private final C4691aj f18235a;

    C4682aa(C4691aj c4691aj) {
        this.f18235a = c4691aj;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f18235a.m21843c(integrityTokenRequest);
    }
}

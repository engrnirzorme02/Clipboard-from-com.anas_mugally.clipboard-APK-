package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.az */
/* JADX INFO: loaded from: classes2.dex */
final class C4707az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a */
    private final C4722bn f18284a;

    /* JADX INFO: renamed from: b */
    private final C4728bt f18285b;

    C4707az(C4722bn c4722bn, C4728bt c4728bt) {
        this.f18284a = c4722bn;
        this.f18285b = c4728bt;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Task m21851a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l7) {
        final long jMo21825b = prepareIntegrityTokenRequest.mo21825b();
        final long jLongValue = l7.longValue();
        prepareIntegrityTokenRequest.mo21824a();
        final C4728bt c4728bt = this.f18285b;
        final int i7 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jMo21825b, jLongValue, i7) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f18330b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f18331c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f18329a.m21872a(this.f18330b, this.f18331c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jMo21825b = prepareIntegrityTokenRequest.mo21825b();
        prepareIntegrityTokenRequest.mo21824a();
        return this.f18284a.m21871e(jMo21825b, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f18282a.m21851a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}

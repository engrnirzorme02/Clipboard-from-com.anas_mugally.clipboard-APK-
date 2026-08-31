package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.e */
/* JADX INFO: loaded from: classes2.dex */
final class C4733e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final long f18336a;

    /* synthetic */ C4733e(long j7, int i7, C4732d c4732d) {
        this.f18336a = j7;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* JADX INFO: renamed from: a */
    final int mo21824a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* JADX INFO: renamed from: b */
    public final long mo21825b() {
        return this.f18336a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f18336a == prepareIntegrityTokenRequest.mo21825b()) {
                prepareIntegrityTokenRequest.mo21824a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f18336a;
        return (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f18336a + ", webViewRequestMode=0}";
    }
}

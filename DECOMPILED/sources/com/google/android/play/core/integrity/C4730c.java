package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.c */
/* JADX INFO: loaded from: classes2.dex */
final class C4730c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private long f18334a;

    /* JADX INFO: renamed from: b */
    private byte f18335b;

    C4730c() {
    }

    /* JADX INFO: renamed from: a */
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder m21873a(int i7) {
        this.f18335b = (byte) (this.f18335b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f18335b == 3) {
            return new C4733e(this.f18334a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f18335b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f18335b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j7) {
        this.f18334a = j7;
        this.f18335b = (byte) (this.f18335b | 1);
        return this;
    }
}

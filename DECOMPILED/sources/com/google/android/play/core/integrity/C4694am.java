package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.am */
/* JADX INFO: loaded from: classes2.dex */
final class C4694am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    private String f18263a;

    /* JADX INFO: renamed from: b */
    private Long f18264b;

    C4694am() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f18263a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C4695an c4695an = null;
        return new C4696ao(str, this.f18264b, c4695an, c4695an);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j7) {
        this.f18264b = Long.valueOf(j7);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f18263a = str;
        return this;
    }
}

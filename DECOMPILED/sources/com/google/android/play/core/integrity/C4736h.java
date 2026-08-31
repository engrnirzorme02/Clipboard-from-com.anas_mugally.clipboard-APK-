package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.h */
/* JADX INFO: loaded from: classes2.dex */
final class C4736h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final String f18338a;

    /* synthetic */ C4736h(String str, C4735g c4735g) {
        this.f18338a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    /* JADX INFO: renamed from: a */
    public final String mo21826a() {
        return this.f18338a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f18338a;
        if (str == null) {
            return standardIntegrityTokenRequest.mo21826a() == null;
        }
        return str.equals(standardIntegrityTokenRequest.mo21826a());
    }

    public final int hashCode() {
        String str = this.f18338a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f18338a + "}";
    }
}

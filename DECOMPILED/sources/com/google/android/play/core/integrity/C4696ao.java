package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ao */
/* JADX INFO: loaded from: classes2.dex */
final class C4696ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    private final String f18265a;

    /* JADX INFO: renamed from: b */
    private final Long f18266b;

    /* JADX INFO: renamed from: c */
    private final Object f18267c = null;

    /* synthetic */ C4696ao(String str, Long l7, Object obj, C4695an c4695an) {
        this.f18265a = str;
        this.f18266b = l7;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m21844a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f18266b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z7;
        Long l7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f18265a.equals(integrityTokenRequest.nonce()) || ((l7 = this.f18266b) != null ? !l7.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z7 = false;
            } else {
                z7 = true;
            }
        } else {
            z7 = false;
        }
        if (!(obj instanceof C4696ao) || !m21844a()) {
            return z7;
        }
        C4696ao c4696ao = (C4696ao) obj;
        if (!z7) {
            return false;
        }
        Object obj2 = c4696ao.f18267c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f18265a.hashCode() ^ 1000003;
        Long l7 = this.f18266b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l7 == null ? 0 : l7.hashCode());
        return m21844a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f18265a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f18265a + ", cloudProjectNumber=" + this.f18266b;
        if (m21844a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}

package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.c */
/* JADX INFO: loaded from: classes.dex */
final class C3540c extends RevokeAccessRequest.AbstractC3536a {

    /* JADX INFO: renamed from: a */
    private List f14449a;

    /* JADX INFO: renamed from: b */
    private Account f14450b;

    /* JADX INFO: renamed from: c */
    private String f14451c;

    C3540c(RevokeAccessRequest revokeAccessRequest) {
        this.f14449a = revokeAccessRequest.m17666U();
        this.f14450b = revokeAccessRequest.m17665T();
        this.f14451c = revokeAccessRequest.m17667V();
    }

    @Override // com.google.android.gms.auth.api.identity.RevokeAccessRequest.AbstractC3536a
    /* JADX INFO: renamed from: a */
    public final RevokeAccessRequest mo17669a() {
        if (this.f14449a != null && this.f14450b != null) {
            return new RevokeAccessRequest(this.f14449a, this.f14450b, this.f14451c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14449a == null) {
            sb.append(" scopes");
        }
        if (this.f14450b == null) {
            sb.append(" account");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.auth.api.identity.RevokeAccessRequest.AbstractC3536a
    /* JADX INFO: renamed from: b */
    public final RevokeAccessRequest.AbstractC3536a mo17670b(String str) {
        this.f14451c = str;
        return this;
    }
}

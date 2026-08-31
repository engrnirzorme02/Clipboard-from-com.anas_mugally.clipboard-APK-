package com.google.android.gms.auth.api.identity;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.b */
/* JADX INFO: loaded from: classes.dex */
final class C3539b extends ClearTokenRequest.AbstractC3535a {

    /* JADX INFO: renamed from: a */
    private String f14447a;

    /* JADX INFO: renamed from: b */
    private String f14448b;

    C3539b(ClearTokenRequest clearTokenRequest) {
        this.f14447a = clearTokenRequest.m17660T();
        this.f14448b = clearTokenRequest.m17661U();
    }

    @Override // com.google.android.gms.auth.api.identity.ClearTokenRequest.AbstractC3535a
    /* JADX INFO: renamed from: a */
    public final ClearTokenRequest mo17663a() {
        if (this.f14447a != null) {
            return new ClearTokenRequest(this.f14447a, this.f14448b);
        }
        throw new IllegalStateException("Missing required properties: token");
    }

    @Override // com.google.android.gms.auth.api.identity.ClearTokenRequest.AbstractC3535a
    /* JADX INFO: renamed from: b */
    public final ClearTokenRequest.AbstractC3535a mo17664b(String str) {
        this.f14448b = str;
        return this;
    }
}

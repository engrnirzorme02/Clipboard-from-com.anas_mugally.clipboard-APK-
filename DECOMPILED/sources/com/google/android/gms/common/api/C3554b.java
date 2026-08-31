package com.google.android.gms.common.api;

/* JADX INFO: renamed from: com.google.android.gms.common.api.b */
/* JADX INFO: loaded from: classes.dex */
public class C3554b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public C3554b(Status status) {
        super(status.m17744U() + ": " + (status.m17745V() != null ? status.m17745V() : ""));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.m17744U();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.m17745V();
    }
}

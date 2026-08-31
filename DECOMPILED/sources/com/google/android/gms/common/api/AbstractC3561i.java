package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.common.api.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3561i {

    /* JADX INFO: renamed from: com.google.android.gms.common.api.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo17779a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract InterfaceC3643m await(long j7, TimeUnit timeUnit);
}

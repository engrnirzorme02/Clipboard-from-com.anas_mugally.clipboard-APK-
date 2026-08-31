package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.C3642l;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3684b {
    /* JADX INFO: renamed from: a */
    public static C3554b m18000a(Status status) {
        return status.m17746W() ? new C3642l(status) : new C3554b(status);
    }
}

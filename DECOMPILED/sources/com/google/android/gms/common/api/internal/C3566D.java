package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.D */
/* JADX INFO: loaded from: classes.dex */
final class C3566D {

    /* JADX INFO: renamed from: a */
    private final C3590b f14568a;

    /* JADX INFO: renamed from: b */
    private final TaskCompletionSource f14569b = new TaskCompletionSource();

    public C3566D(C3590b c3590b) {
        this.f14568a = c3590b;
    }

    /* JADX INFO: renamed from: a */
    public final C3590b m17796a() {
        return this.f14568a;
    }

    /* JADX INFO: renamed from: b */
    public final TaskCompletionSource m17797b() {
        return this.f14569b;
    }
}

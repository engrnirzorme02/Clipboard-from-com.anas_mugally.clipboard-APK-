package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3684b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3634x {
    /* JADX INFO: renamed from: a */
    public static void m17953a(Status status, TaskCompletionSource taskCompletionSource) {
        m17954b(status, null, taskCompletionSource);
    }

    /* JADX INFO: renamed from: b */
    public static void m17954b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.m17747X()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC3684b.m18000a(status));
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17955c(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.m17747X() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(AbstractC3684b.m18000a(status));
    }
}

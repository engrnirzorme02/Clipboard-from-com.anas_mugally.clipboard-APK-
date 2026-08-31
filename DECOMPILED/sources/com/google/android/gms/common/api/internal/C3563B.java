package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.B */
/* JADX INFO: loaded from: classes.dex */
public final class C3563B {

    /* JADX INFO: renamed from: a */
    private final Map f14564a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private final Map f14565b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: h */
    private final void m17782h(boolean z7, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f14564a) {
            map = new HashMap(this.f14564a);
        }
        synchronized (this.f14565b) {
            map2 = new HashMap(this.f14565b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new C3554b(status));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final void m17783c(BasePendingResult basePendingResult, boolean z7) {
        this.f14564a.put(basePendingResult, Boolean.valueOf(z7));
        basePendingResult.addStatusListener(new C3638z(this, basePendingResult));
    }

    /* JADX INFO: renamed from: d */
    final void m17784d(TaskCompletionSource taskCompletionSource, boolean z7) {
        this.f14565b.put(taskCompletionSource, Boolean.valueOf(z7));
        taskCompletionSource.getTask().addOnCompleteListener(new C3562A(this, taskCompletionSource));
    }

    /* JADX INFO: renamed from: e */
    final void m17785e(int i7, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m17782h(true, new Status(20, sb.toString()));
    }

    /* JADX INFO: renamed from: f */
    public final void m17786f() {
        m17782h(false, C3600g.f14640A);
    }

    /* JADX INFO: renamed from: g */
    final boolean m17787g() {
        return (this.f14564a.isEmpty() && this.f14565b.isEmpty()) ? false : true;
    }
}

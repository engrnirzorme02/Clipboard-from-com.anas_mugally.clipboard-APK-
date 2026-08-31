package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3716r {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC3672P f14831a = new C3669M();

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        Object mo17733a(InterfaceC3643m interfaceC3643m);
    }

    /* JADX INFO: renamed from: a */
    public static Task m18060a(AbstractC3561i abstractC3561i, a aVar) {
        InterfaceC3672P interfaceC3672P = f14831a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractC3561i.addStatusListener(new C3670N(abstractC3561i, taskCompletionSource, aVar, interfaceC3672P));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: b */
    public static Task m18061b(AbstractC3561i abstractC3561i) {
        return m18060a(abstractC3561i, new C3671O());
    }
}

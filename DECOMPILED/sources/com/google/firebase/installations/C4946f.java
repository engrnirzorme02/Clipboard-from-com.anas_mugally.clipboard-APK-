package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p229d5.AbstractC5244d;

/* JADX INFO: renamed from: com.google.firebase.installations.f */
/* JADX INFO: loaded from: classes.dex */
class C4946f implements InterfaceC4948h {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f18770a;

    public C4946f(TaskCompletionSource taskCompletionSource) {
        this.f18770a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC4948h
    /* JADX INFO: renamed from: a */
    public boolean mo22234a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC4948h
    /* JADX INFO: renamed from: b */
    public boolean mo22235b(AbstractC5244d abstractC5244d) {
        if (!abstractC5244d.m24233l() && !abstractC5244d.m24232k() && !abstractC5244d.m24230i()) {
            return false;
        }
        this.f18770a.trySetResult(abstractC5244d.mo24201d());
        return true;
    }
}

package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p229d5.AbstractC5244d;

/* JADX INFO: renamed from: com.google.firebase.installations.e */
/* JADX INFO: loaded from: classes.dex */
class C4945e implements InterfaceC4948h {

    /* JADX INFO: renamed from: a */
    private final C4949i f18768a;

    /* JADX INFO: renamed from: b */
    private final TaskCompletionSource f18769b;

    public C4945e(C4949i c4949i, TaskCompletionSource taskCompletionSource) {
        this.f18768a = c4949i;
        this.f18769b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC4948h
    /* JADX INFO: renamed from: a */
    public boolean mo22234a(Exception exc) {
        this.f18769b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC4948h
    /* JADX INFO: renamed from: b */
    public boolean mo22235b(AbstractC5244d abstractC5244d) {
        if (!abstractC5244d.m24232k() || this.f18768a.m22244f(abstractC5244d)) {
            return false;
        }
        this.f18769b.setResult(AbstractC4947g.m22236a().mo22201b(abstractC5244d.mo24199b()).mo22203d(abstractC5244d.mo24200c()).mo22202c(abstractC5244d.mo24205h()).mo22200a());
        return true;
    }
}

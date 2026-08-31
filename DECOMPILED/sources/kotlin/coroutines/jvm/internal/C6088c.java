package kotlin.coroutines.jvm.internal;

import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6088c implements InterfaceC1875e {

    /* JADX INFO: renamed from: a */
    public static final C6088c f23850a = new C6088c();

    private C6088c() {
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p173W5.InterfaceC1875e
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

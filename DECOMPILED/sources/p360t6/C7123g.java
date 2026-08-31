package p360t6;

import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: t6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7123g extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final transient InterfaceC1879i f28412a;

    public C7123g(InterfaceC1879i interfaceC1879i) {
        this.f28412a = interfaceC1879i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f28412a.toString();
    }
}

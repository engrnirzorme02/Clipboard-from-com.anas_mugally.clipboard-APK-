package p352s6;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: s6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7044a extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient Object f28181a;

    public C7044a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f28181a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

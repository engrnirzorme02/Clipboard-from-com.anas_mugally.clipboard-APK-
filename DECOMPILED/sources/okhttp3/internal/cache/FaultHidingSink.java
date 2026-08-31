package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.AbstractC0653j;
import p072I6.C0648e;
import p072I6.InterfaceC0669z;
import p238e6.InterfaceC5367l;

/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends AbstractC0653j {

    /* JADX INFO: renamed from: b */
    private final InterfaceC5367l f25572b;

    /* JADX INFO: renamed from: c */
    private boolean f25573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(InterfaceC0669z delegate, InterfaceC5367l onException) {
        super(delegate);
        AbstractC6118n.m27187e(delegate, "delegate");
        AbstractC6118n.m27187e(onException, "onException");
        this.f25572b = onException;
    }

    @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e source, long j7) throws EOFException {
        AbstractC6118n.m27187e(source, "source");
        if (this.f25573c) {
            source.mo3052l(j7);
            return;
        }
        try {
            super.mo3003I(source, j7);
        } catch (IOException e7) {
            this.f25573c = true;
            this.f25572b.invoke(e7);
        }
    }

    @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25573c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e7) {
            this.f25573c = true;
            this.f25572b.invoke(e7);
        }
    }

    @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() {
        if (this.f25573c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e7) {
            this.f25573c = true;
            this.f25572b.invoke(e7);
        }
    }
}

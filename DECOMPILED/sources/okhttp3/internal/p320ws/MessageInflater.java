package okhttp3.internal.p320ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p072I6.C0657n;
import p072I6.InterfaceC0640B;

/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable {

    /* JADX INFO: renamed from: a */
    private final boolean f26057a;

    /* JADX INFO: renamed from: b */
    private final C0648e f26058b;

    /* JADX INFO: renamed from: c */
    private final Inflater f26059c;

    /* JADX INFO: renamed from: d */
    private final C0657n f26060d;

    public MessageInflater(boolean z7) {
        this.f26057a = z7;
        C0648e c0648e = new C0648e();
        this.f26058b = c0648e;
        Inflater inflater = new Inflater(true);
        this.f26059c = inflater;
        this.f26060d = new C0657n((InterfaceC0640B) c0648e, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26060d.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m29450d(C0648e buffer) throws IOException {
        AbstractC6118n.m27187e(buffer, "buffer");
        if (this.f26058b.m3046h1() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f26057a) {
            this.f26059c.reset();
        }
        this.f26058b.mo3029W(buffer);
        this.f26058b.mo3008A(65535);
        long bytesRead = this.f26059c.getBytesRead() + this.f26058b.m3046h1();
        do {
            this.f26060d.m3127d(buffer, Long.MAX_VALUE);
        } while (this.f26059c.getBytesRead() < bytesRead);
    }
}

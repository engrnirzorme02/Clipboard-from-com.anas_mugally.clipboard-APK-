package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;

/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {

    /* JADX INFO: renamed from: a */
    private final FileChannel f25574a;

    public FileOperator(FileChannel fileChannel) {
        AbstractC6118n.m27187e(fileChannel, "fileChannel");
        this.f25574a = fileChannel;
    }

    /* JADX INFO: renamed from: a */
    public final void m28866a(long j7, C0648e sink, long j8) throws IOException {
        AbstractC6118n.m27187e(sink, "sink");
        if (j8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j9 = j7;
        long j10 = j8;
        while (j10 > 0) {
            long jTransferTo = this.f25574a.transferTo(j9, j10, sink);
            j9 += jTransferTo;
            j10 -= jTransferTo;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m28867b(long j7, C0648e source, long j8) throws IOException {
        AbstractC6118n.m27187e(source, "source");
        if (j8 < 0 || j8 > source.m3046h1()) {
            throw new IndexOutOfBoundsException();
        }
        long j9 = j7;
        long j10 = j8;
        while (j10 > 0) {
            long jTransferFrom = this.f25574a.transferFrom(source, j9, j10);
            j9 += jTransferFrom;
            j10 -= jTransferFrom;
        }
    }
}

package p002A0;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0005c {
    /* JADX INFO: renamed from: a */
    public static final void m7a(ReadableByteChannel input, FileChannel output) throws IOException {
        AbstractC6118n.m27187e(input, "input");
        AbstractC6118n.m27187e(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}

package p220c6;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: c6.c */
/* JADX INFO: loaded from: classes.dex */
final class C3027c extends ByteArrayOutputStream {
    public C3027c(int i7) {
        super(i7);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m15000d() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        AbstractC6118n.m27186d(buf, "buf");
        return buf;
    }
}

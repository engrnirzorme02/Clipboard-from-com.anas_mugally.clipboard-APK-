package p220c6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: c6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3025a {
    /* JADX INFO: renamed from: a */
    public static final long m14996a(InputStream inputStream, OutputStream out, int i7) throws IOException {
        AbstractC6118n.m27187e(inputStream, "<this>");
        AbstractC6118n.m27187e(out, "out");
        byte[] bArr = new byte[i7];
        int i8 = inputStream.read(bArr);
        long j7 = 0;
        while (i8 >= 0) {
            out.write(bArr, 0, i8);
            j7 += (long) i8;
            i8 = inputStream.read(bArr);
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m14997b(InputStream inputStream, OutputStream outputStream, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return m14996a(inputStream, outputStream, i7);
    }

    /* JADX INFO: renamed from: c */
    public static final byte[] m14998c(InputStream inputStream) {
        AbstractC6118n.m27187e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m14997b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC6118n.m27186d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}

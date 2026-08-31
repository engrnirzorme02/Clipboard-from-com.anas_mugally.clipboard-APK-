package p220c6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p152T5.AbstractC1631j;
import p302m6.C6402d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: c6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3030f extends AbstractC3029e {
    /* JADX INFO: renamed from: a */
    public static byte[] m15001a(File file) throws IOException {
        AbstractC6118n.m27187e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArrD = new byte[i7];
            int i8 = i7;
            int i9 = 0;
            while (i8 > 0) {
                int i10 = fileInputStream.read(bArrD, i9, i8);
                if (i10 < 0) {
                    break;
                }
                i8 -= i10;
                i9 += i10;
            }
            if (i8 > 0) {
                bArrD = Arrays.copyOf(bArrD, i9);
                AbstractC6118n.m27186d(bArrD, "copyOf(...)");
            } else {
                int i11 = fileInputStream.read();
                if (i11 != -1) {
                    C3027c c3027c = new C3027c(8193);
                    c3027c.write(i11);
                    AbstractC3025a.m14997b(fileInputStream, c3027c, 0, 2, null);
                    int size = c3027c.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM15000d = c3027c.m15000d();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrD, size);
                    AbstractC6118n.m27186d(bArrCopyOf, "copyOf(...)");
                    bArrD = AbstractC1631j.m6691d(bArrM15000d, bArrCopyOf, i7, 0, c3027c.size());
                }
            }
            AbstractC3026b.m14999a(fileInputStream, null);
            return bArrD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m15002b(File file, Charset charset) throws IOException {
        AbstractC6118n.m27187e(file, "<this>");
        AbstractC6118n.m27187e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM15008c = AbstractC3033i.m15008c(inputStreamReader);
            AbstractC3026b.m14999a(inputStreamReader, null);
            return strM15008c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(inputStreamReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m15003c(File file, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = C6402d.f24428b;
        }
        return m15002b(file, charset);
    }

    /* JADX INFO: renamed from: d */
    public static void m15004d(File file, byte[] array) throws IOException {
        AbstractC6118n.m27187e(file, "<this>");
        AbstractC6118n.m27187e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            C1444v c1444v = C1444v.f4971a;
            AbstractC3026b.m14999a(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(fileOutputStream, th);
                throw th2;
            }
        }
    }
}

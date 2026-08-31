package p252g4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: g4.L */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5474L {
    /* JADX INFO: renamed from: a */
    private static void m24719a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i7 = inputStream.read(bArr);
                    if (i7 <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC5499i.m24789g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i7);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC5499i.m24789g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m24720b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5473K interfaceC5473K = (InterfaceC5473K) it.next();
            InputStream inputStreamMo24694b = null;
            try {
                inputStreamMo24694b = interfaceC5473K.mo24694b();
                if (inputStreamMo24694b != null) {
                    m24719a(inputStreamMo24694b, new File(file, interfaceC5473K.mo24693a()));
                }
            } catch (IOException unused) {
            } finally {
                AbstractC5499i.m24789g(null);
            }
        }
    }
}

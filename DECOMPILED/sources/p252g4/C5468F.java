package p252g4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p276j4.AbstractC5868F;

/* JADX INFO: renamed from: g4.F */
/* JADX INFO: loaded from: classes.dex */
class C5468F implements InterfaceC5473K {

    /* JADX INFO: renamed from: a */
    private final File f20793a;

    /* JADX INFO: renamed from: b */
    private final String f20794b;

    /* JADX INFO: renamed from: c */
    private final String f20795c;

    C5468F(String str, String str2, File file) {
        this.f20794b = str;
        this.f20795c = str2;
        this.f20793a = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    private byte[] m24692d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamMo24694b = mo24694b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamMo24694b == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamMo24694b != null) {
                            inputStreamMo24694b.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i7 = inputStreamMo24694b.read(bArr);
                            if (i7 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamMo24694b.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i7);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (inputStreamMo24694b != null) {
                    try {
                        inputStreamMo24694b.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (inputStreamMo24694b != null) {
                inputStreamMo24694b.close();
            }
            throw th5;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p252g4.InterfaceC5473K
    /* JADX INFO: renamed from: a */
    public String mo24693a() {
        return this.f20795c;
    }

    @Override // p252g4.InterfaceC5473K
    /* JADX INFO: renamed from: b */
    public InputStream mo24694b() {
        if (this.f20793a.exists() && this.f20793a.isFile()) {
            try {
                return new FileInputStream(this.f20793a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // p252g4.InterfaceC5473K
    /* JADX INFO: renamed from: c */
    public AbstractC5868F.d.b mo24695c() {
        byte[] bArrM24692d = m24692d();
        if (bArrM24692d != null) {
            return AbstractC5868F.d.b.m26378a().mo26382b(bArrM24692d).mo26383c(this.f20794b).mo26381a();
        }
        return null;
    }
}

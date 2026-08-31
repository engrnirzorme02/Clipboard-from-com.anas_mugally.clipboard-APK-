package p252g4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p276j4.AbstractC5868F;

/* JADX INFO: renamed from: g4.g */
/* JADX INFO: loaded from: classes.dex */
class C5497g implements InterfaceC5473K {

    /* JADX INFO: renamed from: a */
    private final byte[] f20842a;

    /* JADX INFO: renamed from: b */
    private final String f20843b;

    /* JADX INFO: renamed from: c */
    private final String f20844c;

    C5497g(String str, String str2, byte[] bArr) {
        this.f20843b = str;
        this.f20844c = str2;
        this.f20842a = bArr;
    }

    /* JADX INFO: renamed from: d */
    private byte[] m24773d() {
        if (m24774e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f20842a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m24774e() {
        byte[] bArr = this.f20842a;
        return bArr == null || bArr.length == 0;
    }

    @Override // p252g4.InterfaceC5473K
    /* JADX INFO: renamed from: a */
    public String mo24693a() {
        return this.f20844c;
    }

    @Override // p252g4.InterfaceC5473K
    /* JADX INFO: renamed from: b */
    public InputStream mo24694b() {
        if (m24774e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f20842a);
    }

    @Override // p252g4.InterfaceC5473K
    /* JADX INFO: renamed from: c */
    public AbstractC5868F.d.b mo24695c() {
        byte[] bArrM24773d = m24773d();
        if (bArrM24773d == null) {
            return null;
        }
        return AbstractC5868F.d.b.m26378a().mo26382b(bArrM24773d).mo26383c(this.f20843b).mo26381a();
    }
}

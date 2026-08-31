package p110N5;

import com.google.protobuf.AbstractC5110l;
import com.google.protobuf.InterfaceC5082U;
import com.google.protobuf.InterfaceC5097e0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p063H5.InterfaceC0522Q;
import p063H5.InterfaceC0571w;

/* JADX INFO: renamed from: N5.a */
/* JADX INFO: loaded from: classes.dex */
final class C0979a extends InputStream implements InterfaceC0571w, InterfaceC0522Q {

    /* JADX INFO: renamed from: a */
    private InterfaceC5082U f3740a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5097e0 f3741b;

    /* JADX INFO: renamed from: c */
    private ByteArrayInputStream f3742c;

    C0979a(InterfaceC5082U interfaceC5082U, InterfaceC5097e0 interfaceC5097e0) {
        this.f3740a = interfaceC5082U;
        this.f3741b = interfaceC5097e0;
    }

    @Override // java.io.InputStream
    public int available() {
        InterfaceC5082U interfaceC5082U = this.f3740a;
        if (interfaceC5082U != null) {
            return interfaceC5082U.mo22969b();
        }
        ByteArrayInputStream byteArrayInputStream = this.f3742c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // p063H5.InterfaceC0571w
    /* JADX INFO: renamed from: d */
    public int mo2532d(OutputStream outputStream) {
        InterfaceC5082U interfaceC5082U = this.f3740a;
        if (interfaceC5082U != null) {
            int iMo22969b = interfaceC5082U.mo22969b();
            this.f3740a.mo22971e(outputStream);
            this.f3740a = null;
            return iMo22969b;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3742c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iM4257a = (int) AbstractC0980b.m4257a(byteArrayInputStream, outputStream);
        this.f3742c = null;
        return iM4257a;
    }

    /* JADX INFO: renamed from: m */
    InterfaceC5082U m4255m() {
        InterfaceC5082U interfaceC5082U = this.f3740a;
        if (interfaceC5082U != null) {
            return interfaceC5082U;
        }
        throw new IllegalStateException("message not available");
    }

    /* JADX INFO: renamed from: n */
    InterfaceC5097e0 m4256n() {
        return this.f3741b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f3740a != null) {
            this.f3742c = new ByteArrayInputStream(this.f3740a.mo22973h());
            this.f3740a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3742c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        InterfaceC5082U interfaceC5082U = this.f3740a;
        if (interfaceC5082U != null) {
            int iMo22969b = interfaceC5082U.mo22969b();
            if (iMo22969b == 0) {
                this.f3740a = null;
                this.f3742c = null;
                return -1;
            }
            if (i8 >= iMo22969b) {
                AbstractC5110l abstractC5110lM23363c0 = AbstractC5110l.m23363c0(bArr, i7, iMo22969b);
                this.f3740a.mo22972f(abstractC5110lM23363c0);
                abstractC5110lM23363c0.mo23408X();
                abstractC5110lM23363c0.m23411d();
                this.f3740a = null;
                this.f3742c = null;
                return iMo22969b;
            }
            this.f3742c = new ByteArrayInputStream(this.f3740a.mo22973h());
            this.f3740a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3742c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i7, i8);
        }
        return -1;
    }
}

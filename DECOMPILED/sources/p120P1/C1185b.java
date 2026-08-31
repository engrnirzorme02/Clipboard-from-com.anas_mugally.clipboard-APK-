package p120P1;

import android.graphics.Bitmap;
import p011B1.InterfaceC0055a;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: P1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1185b implements InterfaceC0055a.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0406d f4227a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0404b f4228b;

    public C1185b(InterfaceC0406d interfaceC0406d, InterfaceC0404b interfaceC0404b) {
        this.f4227a = interfaceC0406d;
        this.f4228b = interfaceC0404b;
    }

    @Override // p011B1.InterfaceC0055a.a
    /* JADX INFO: renamed from: a */
    public Bitmap mo215a(int i7, int i8, Bitmap.Config config) {
        return this.f4227a.mo1747e(i7, i8, config);
    }

    @Override // p011B1.InterfaceC0055a.a
    /* JADX INFO: renamed from: b */
    public int[] mo216b(int i7) {
        InterfaceC0404b interfaceC0404b = this.f4228b;
        return interfaceC0404b == null ? new int[i7] : (int[]) interfaceC0404b.mo1739e(i7, int[].class);
    }

    @Override // p011B1.InterfaceC0055a.a
    /* JADX INFO: renamed from: c */
    public void mo217c(Bitmap bitmap) {
        this.f4227a.mo1745c(bitmap);
    }

    @Override // p011B1.InterfaceC0055a.a
    /* JADX INFO: renamed from: d */
    public void mo218d(byte[] bArr) {
        InterfaceC0404b interfaceC0404b = this.f4228b;
        if (interfaceC0404b == null) {
            return;
        }
        interfaceC0404b.mo1738d(bArr);
    }

    @Override // p011B1.InterfaceC0055a.a
    /* JADX INFO: renamed from: e */
    public byte[] mo219e(int i7) {
        InterfaceC0404b interfaceC0404b = this.f4228b;
        return interfaceC0404b == null ? new byte[i7] : (byte[]) interfaceC0404b.mo1739e(i7, byte[].class);
    }

    @Override // p011B1.InterfaceC0055a.a
    /* JADX INFO: renamed from: f */
    public void mo220f(int[] iArr) {
        InterfaceC0404b interfaceC0404b = this.f4228b;
        if (interfaceC0404b == null) {
            return;
        }
        interfaceC0404b.mo1738d(iArr);
    }
}

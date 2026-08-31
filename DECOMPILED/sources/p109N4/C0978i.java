package p109N4;

import java.io.IOException;
import p086K4.C0746b;
import p086K4.C0747c;
import p086K4.InterfaceC0751g;

/* JADX INFO: renamed from: N4.i */
/* JADX INFO: loaded from: classes.dex */
class C0978i implements InterfaceC0751g {

    /* JADX INFO: renamed from: a */
    private boolean f3736a = false;

    /* JADX INFO: renamed from: b */
    private boolean f3737b = false;

    /* JADX INFO: renamed from: c */
    private C0747c f3738c;

    /* JADX INFO: renamed from: d */
    private final C0975f f3739d;

    C0978i(C0975f c0975f) {
        this.f3739d = c0975f;
    }

    /* JADX INFO: renamed from: a */
    private void m4253a() {
        if (this.f3736a) {
            throw new C0746b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3736a = true;
    }

    /* JADX INFO: renamed from: b */
    void m4254b(C0747c c0747c, boolean z7) {
        this.f3736a = false;
        this.f3738c = c0747c;
        this.f3737b = z7;
    }

    @Override // p086K4.InterfaceC0751g
    /* JADX INFO: renamed from: e */
    public InterfaceC0751g mo3521e(String str) throws IOException {
        m4253a();
        this.f3739d.m4238i(this.f3738c, str, this.f3737b);
        return this;
    }

    @Override // p086K4.InterfaceC0751g
    /* JADX INFO: renamed from: f */
    public InterfaceC0751g mo3522f(boolean z7) {
        m4253a();
        this.f3739d.m4244o(this.f3738c, z7, this.f3737b);
        return this;
    }
}

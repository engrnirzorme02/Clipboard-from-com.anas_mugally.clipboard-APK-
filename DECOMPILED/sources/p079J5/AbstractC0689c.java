package p079J5;

import java.io.IOException;
import java.util.List;
import p072I6.C0648e;
import p095L5.C0853i;
import p095L5.EnumC0845a;
import p095L5.InterfaceC0847c;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0689c implements InterfaceC0847c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0847c f2677a;

    public AbstractC0689c(InterfaceC0847c interfaceC0847c) {
        this.f2677a = (InterfaceC0847c) AbstractC1209m.m5303o(interfaceC0847c, "delegate");
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: B0 */
    public void mo3216B0(C0853i c0853i) {
        this.f2677a.mo3216B0(c0853i);
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: E0 */
    public int mo3220E0() {
        return this.f2677a.mo3220E0();
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: F0 */
    public void mo3221F0(boolean z7, boolean z8, int i7, int i8, List list) {
        this.f2677a.mo3221F0(z7, z8, i7, i8, list);
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: H */
    public void mo3222H() {
        this.f2677a.mo3222H();
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: Z */
    public void mo3223Z(int i7, EnumC0845a enumC0845a, byte[] bArr) {
        this.f2677a.mo3223Z(i7, enumC0845a, bArr);
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: a */
    public void mo3224a(int i7, long j7) {
        this.f2677a.mo3224a(i7, j7);
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: b */
    public void mo3217b(boolean z7, int i7, int i8) {
        this.f2677a.mo3217b(z7, i7, i8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2677a.close();
    }

    @Override // p095L5.InterfaceC0847c
    public void flush() {
        this.f2677a.flush();
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: h0 */
    public void mo3225h0(C0853i c0853i) {
        this.f2677a.mo3225h0(c0853i);
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: j0 */
    public void mo3226j0(boolean z7, int i7, C0648e c0648e, int i8) {
        this.f2677a.mo3226j0(z7, i7, c0648e, i8);
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: k */
    public void mo3218k(int i7, EnumC0845a enumC0845a) {
        this.f2677a.mo3218k(i7, enumC0845a);
    }
}

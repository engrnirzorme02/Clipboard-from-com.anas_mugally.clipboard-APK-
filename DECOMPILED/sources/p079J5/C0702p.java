package p079J5;

import io.grpc.internal.InterfaceC5764V0;
import p072I6.C0648e;

/* JADX INFO: renamed from: J5.p */
/* JADX INFO: loaded from: classes.dex */
class C0702p implements InterfaceC5764V0 {

    /* JADX INFO: renamed from: a */
    private final C0648e f2857a;

    /* JADX INFO: renamed from: b */
    private int f2858b;

    /* JADX INFO: renamed from: c */
    private int f2859c;

    C0702p(C0648e c0648e, int i7) {
        this.f2857a = c0648e;
        this.f2858b = i7;
    }

    @Override // io.grpc.internal.InterfaceC5764V0
    /* JADX INFO: renamed from: a */
    public int mo3404a() {
        return this.f2858b;
    }

    @Override // io.grpc.internal.InterfaceC5764V0
    /* JADX INFO: renamed from: b */
    public void mo3405b(byte b7) {
        this.f2857a.mo3010F(b7);
        this.f2858b--;
        this.f2859c++;
    }

    /* JADX INFO: renamed from: c */
    C0648e m3406c() {
        return this.f2857a;
    }

    @Override // io.grpc.internal.InterfaceC5764V0
    /* JADX INFO: renamed from: e */
    public int mo3407e() {
        return this.f2859c;
    }

    @Override // io.grpc.internal.InterfaceC5764V0
    /* JADX INFO: renamed from: i */
    public void mo3408i(byte[] bArr, int i7, int i8) {
        this.f2857a.mo3047i(bArr, i7, i8);
        this.f2858b -= i8;
        this.f2859c += i8;
    }

    @Override // io.grpc.internal.InterfaceC5764V0
    public void release() {
    }
}

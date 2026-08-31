package p091L1;

import java.nio.ByteBuffer;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;

/* JADX INFO: renamed from: L1.i */
/* JADX INFO: loaded from: classes.dex */
public class C0816i implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final C0824q f3253a;

    public C0816i(C0824q c0824q) {
        this.f3253a = c0824q;
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(ByteBuffer byteBuffer, int i7, int i8, C0132h c0132h) {
        return this.f3253a.m3867g(byteBuffer, i7, i8, c0132h);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(ByteBuffer byteBuffer, C0132h c0132h) {
        return this.f3253a.m3870q(byteBuffer);
    }
}

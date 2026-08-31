package p376v6;

import p318o6.AbstractC6618K;
import p360t6.AbstractC7128l;

/* JADX INFO: renamed from: v6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7265c extends AbstractC7268f {

    /* JADX INFO: renamed from: t */
    public static final C7265c f29077t = new C7265c();

    private C7265c() {
        super(AbstractC7272j.f29089c, AbstractC7272j.f29090d, AbstractC7272j.f29091e, AbstractC7272j.f29087a);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        AbstractC7128l.m31467a(i7);
        return i7 >= AbstractC7272j.f29089c ? AbstractC7128l.m31468b(this, str) : super.mo28086S0(i7, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return "Dispatchers.Default";
    }
}

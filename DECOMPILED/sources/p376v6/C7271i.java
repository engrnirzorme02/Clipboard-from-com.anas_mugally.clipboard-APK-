package p376v6;

import p318o6.AbstractC6633S;

/* JADX INFO: renamed from: v6.i */
/* JADX INFO: loaded from: classes.dex */
final class C7271i extends AbstractRunnableC7270h {

    /* JADX INFO: renamed from: c */
    public final Runnable f29086c;

    public C7271i(Runnable runnable, long j7, boolean z7) {
        super(j7, z7);
        this.f29086c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29086c.run();
    }

    public String toString() {
        return "Task[" + AbstractC6633S.m28108a(this.f29086c) + '@' + AbstractC6633S.m28109b(this.f29086c) + ", " + this.f29084a + ", " + AbstractC7272j.m32241c(this.f29085b) + ']';
    }
}

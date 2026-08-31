package p051G1;

import java.io.File;

/* JADX INFO: renamed from: G1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473d implements InterfaceC0470a.a {

    /* JADX INFO: renamed from: a */
    private final long f1770a;

    /* JADX INFO: renamed from: b */
    private final a f1771b;

    /* JADX INFO: renamed from: G1.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        File mo2038a();
    }

    public AbstractC0473d(a aVar, long j7) {
        this.f1770a = j7;
        this.f1771b = aVar;
    }

    @Override // p051G1.InterfaceC0470a.a
    /* JADX INFO: renamed from: a */
    public InterfaceC0470a mo2033a() {
        File fileMo2038a = this.f1771b.mo2038a();
        if (fileMo2038a == null) {
            return null;
        }
        if (fileMo2038a.isDirectory() || fileMo2038a.mkdirs()) {
            return C0474e.m2039c(fileMo2038a, this.f1770a);
        }
        return null;
    }
}

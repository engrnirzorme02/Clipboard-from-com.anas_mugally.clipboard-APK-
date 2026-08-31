package p034E0;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0178i;

/* JADX INFO: renamed from: E0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0278g implements InterfaceC0178i {

    /* JADX INFO: renamed from: a */
    private final SQLiteProgram f1047a;

    public C0278g(SQLiteProgram delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f1047a = delegate;
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: D */
    public void mo907D(int i7, double d7) {
        this.f1047a.bindDouble(i7, d7);
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: R */
    public void mo908R(int i7, long j7) {
        this.f1047a.bindLong(i7, j7);
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: V */
    public void mo909V(int i7, byte[] value) {
        AbstractC6118n.m27187e(value, "value");
        this.f1047a.bindBlob(i7, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1047a.close();
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: m0 */
    public void mo910m0(int i7) {
        this.f1047a.bindNull(i7);
    }

    @Override // p026D0.InterfaceC0178i
    /* JADX INFO: renamed from: t */
    public void mo911t(int i7, String value) {
        AbstractC6118n.m27187e(value, "value");
        this.f1047a.bindString(i7, value);
    }
}

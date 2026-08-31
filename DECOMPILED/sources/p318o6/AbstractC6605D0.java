package p318o6;

import kotlin.jvm.internal.AbstractC6118n;
import p360t6.C7131o;

/* JADX INFO: renamed from: o6.D0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6605D0 extends C7131o implements InterfaceC6661e0, InterfaceC6693u0 {

    /* JADX INFO: renamed from: d */
    public C6607E0 f24875d;

    @Override // p318o6.InterfaceC6693u0
    /* JADX INFO: renamed from: a */
    public C6617J0 mo27972a() {
        return null;
    }

    @Override // p318o6.InterfaceC6693u0
    public boolean isActive() {
        return true;
    }

    @Override // p318o6.InterfaceC6661e0
    /* JADX INFO: renamed from: k */
    public void mo7954k() {
        m27973u().m28040v0(this);
    }

    @Override // p360t6.C7131o
    public String toString() {
        return AbstractC6633S.m28108a(this) + '@' + AbstractC6633S.m28109b(this) + "[job@" + AbstractC6633S.m28109b(m27973u()) + ']';
    }

    /* JADX INFO: renamed from: u */
    public final C6607E0 m27973u() {
        C6607E0 c6607e0 = this.f24875d;
        if (c6607e0 != null) {
            return c6607e0;
        }
        AbstractC6118n.m27197o("job");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public abstract boolean mo27974v();

    /* JADX INFO: renamed from: w */
    public abstract void mo27975w(Throwable th);

    /* JADX INFO: renamed from: x */
    public final void m27976x(C6607E0 c6607e0) {
        this.f24875d = c6607e0;
    }
}

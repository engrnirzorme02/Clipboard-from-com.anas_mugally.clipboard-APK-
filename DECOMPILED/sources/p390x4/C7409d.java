package p390x4;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p006A4.C0016a;
import p006A4.C0024i;
import p030D4.C0203g;
import p030D4.C0205i;
import p030D4.InterfaceC0210n;
import p374v4.C7236a;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: x4.d */
/* JADX INFO: loaded from: classes.dex */
public class C7409d implements InterfaceC7410e {

    /* JADX INFO: renamed from: a */
    private boolean f29660a = false;

    /* JADX INFO: renamed from: c */
    private void m32749c() {
        AbstractC7551l.m33234g(this.f29660a, "Transaction expected to already be in progress.");
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: a */
    public void mo32734a(long j7) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: b */
    public void mo32735b(C7245j c7245j, InterfaceC0210n interfaceC0210n, long j7) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: d */
    public void mo32736d(C7245j c7245j, C7236a c7236a, long j7) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: e */
    public List mo32737e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: f */
    public void mo32738f(C0024i c0024i, Set set) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: g */
    public void mo32739g(C0024i c0024i, InterfaceC0210n interfaceC0210n) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: h */
    public void mo32740h(C0024i c0024i, Set set, Set set2) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: i */
    public Object mo32741i(Callable callable) {
        AbstractC7551l.m33234g(!this.f29660a, "runInTransaction called when an existing transaction is already in progress.");
        this.f29660a = true;
        try {
            Object objCall = callable.call();
            this.f29660a = false;
            return objCall;
        } catch (Throwable th) {
            try {
                Log.e("NoopPersistenceManager", "Caught Throwable.", th);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                this.f29660a = false;
                throw th2;
            }
        }
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: j */
    public void mo32742j(C0024i c0024i) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: k */
    public C0016a mo32743k(C0024i c0024i) {
        return new C0016a(C0205i.m1062e(C0203g.m1050w(), c0024i.m136c()), false, false);
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: l */
    public void mo32744l(C0024i c0024i) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: m */
    public void mo32745m(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: n */
    public void mo32746n(C7245j c7245j, C7236a c7236a) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: o */
    public void mo32747o(C7245j c7245j, C7236a c7236a) {
        m32749c();
    }

    @Override // p390x4.InterfaceC7410e
    /* JADX INFO: renamed from: p */
    public void mo32748p(C0024i c0024i) {
        m32749c();
    }
}

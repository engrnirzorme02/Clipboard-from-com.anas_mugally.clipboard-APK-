package p023C5;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.util.ArrayList;
import java.util.List;
import p015B5.C0092b;
import p256h0.AbstractC5547r;

/* JADX INFO: renamed from: C5.f */
/* JADX INFO: loaded from: classes.dex */
public class C0151f extends AbstractC5547r {

    /* JADX INFO: renamed from: h */
    private List f754h;

    /* JADX INFO: renamed from: i */
    private AbstractC2599q f755i;

    public C0151f(AbstractC2599q abstractC2599q) {
        super(abstractC2599q);
        this.f754h = new ArrayList();
        this.f755i = abstractC2599q;
        this.f754h = new ArrayList();
    }

    @Override // p256h0.AbstractC5547r, androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: a */
    public void mo683a(ViewGroup viewGroup, int i7, Object obj) {
        if (((AbstractComponentCallbacksC2591i) obj) == null) {
            return;
        }
        super.mo683a(viewGroup, i7, obj);
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: c */
    public int mo684c() {
        return this.f754h.size();
    }

    @Override // androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: d */
    public int mo685d(Object obj) {
        if (obj instanceof AbstractComponentCallbacksC2591i) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) obj;
            this.f755i.m12391n().mo12020k(abstractComponentCallbacksC2591i).m12509f(abstractComponentCallbacksC2591i).mo12016g();
        }
        return super.mo685d(obj);
    }

    @Override // p256h0.AbstractC5547r, androidx.viewpager.widget.AbstractC2869a
    /* JADX INFO: renamed from: g */
    public Object mo686g(ViewGroup viewGroup, int i7) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iMo687q = mo687q(i7);
        if (abstractComponentCallbacksC2591iMo687q.m12169g0()) {
            return abstractComponentCallbacksC2591iMo687q;
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) super.mo686g(viewGroup, i7);
        InterfaceC0150e interfaceC0150e = (InterfaceC0150e) this.f754h.get(i7);
        if (interfaceC0150e instanceof InterfaceC0147b) {
            ((InterfaceC0147b) interfaceC0150e).mo634a(abstractComponentCallbacksC2591i);
            this.f754h.set(i7, interfaceC0150e);
            if ((abstractComponentCallbacksC2591i instanceof C0092b) && abstractComponentCallbacksC2591i.m12169g0()) {
                ((C0092b) abstractComponentCallbacksC2591i).m368R1();
            }
        }
        return abstractComponentCallbacksC2591i;
    }

    @Override // p256h0.AbstractC5547r
    /* JADX INFO: renamed from: q */
    public AbstractComponentCallbacksC2591i mo687q(int i7) {
        return ((InterfaceC0150e) this.f754h.get(i7)).mo641e();
    }

    /* JADX INFO: renamed from: t */
    public boolean m688t(InterfaceC0150e interfaceC0150e) {
        if (this.f754h.contains(interfaceC0150e)) {
            return false;
        }
        boolean zAdd = this.f754h.add(interfaceC0150e);
        if (zAdd) {
            m14323i();
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: u */
    public int m689u(int i7) {
        return ((InterfaceC0150e) this.f754h.get(i7)).mo639c();
    }

    /* JADX INFO: renamed from: v */
    public int m690v(int i7) {
        return ((InterfaceC0150e) this.f754h.get(i7)).mo640d();
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC0150e m691w(int i7) {
        return (InterfaceC0150e) this.f754h.get(i7);
    }

    /* JADX INFO: renamed from: x */
    public List m692x() {
        return this.f754h;
    }
}

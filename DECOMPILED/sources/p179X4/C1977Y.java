package p179X4;

import com.google.protobuf.AbstractC5104i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p158U4.C1698v;
import p165V4.AbstractC1780f;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2051s;
import p186Y4.C2037e;
import p351s5.AbstractC7031m;
import p351s5.C7041w;
import p351s5.C7042x;

/* JADX INFO: renamed from: X4.Y */
/* JADX INFO: loaded from: classes.dex */
public class C1977Y extends AbstractC1980c {

    /* JADX INFO: renamed from: v */
    public static final AbstractC5104i f6550v = AbstractC5104i.f19401b;

    /* JADX INFO: renamed from: s */
    private final C1964K f6551s;

    /* JADX INFO: renamed from: t */
    protected boolean f6552t;

    /* JADX INFO: renamed from: u */
    private AbstractC5104i f6553u;

    /* JADX INFO: renamed from: X4.Y$a */
    public interface a extends InterfaceC1970Q {
        /* JADX INFO: renamed from: c */
        void mo8221c();

        /* JADX INFO: renamed from: e */
        void mo8222e(C1698v c1698v, List list);
    }

    C1977Y(C1998u c1998u, C2037e c2037e, C1964K c1964k, a aVar) {
        super(c1998u, AbstractC7031m.m30773b(), c2037e, C2037e.d.WRITE_STREAM_CONNECTION_BACKOFF, C2037e.d.WRITE_STREAM_IDLE, C2037e.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f6552t = false;
        this.f6553u = f6550v;
        this.f6551s = c1964k;
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo8293q(C7042x c7042x) {
        this.f6553u = c7042x.m31114c0();
        this.f6572l.m8499e();
        C1698v c1698vM8174v = this.f6551s.m8174v(c7042x.m31113a0());
        int iM31116e0 = c7042x.m31116e0();
        ArrayList arrayList = new ArrayList(iM31116e0);
        for (int i7 = 0; i7 < iM31116e0; i7++) {
            arrayList.add(this.f6551s.m8170m(c7042x.m31115d0(i7), c1698vM8174v));
        }
        ((a) this.f6573m).mo8222e(c1698vM8174v, arrayList);
    }

    /* JADX INFO: renamed from: B */
    void m8300B(AbstractC5104i abstractC5104i) {
        this.f6553u = (AbstractC5104i) AbstractC2051s.m8520a(abstractC5104i);
    }

    /* JADX INFO: renamed from: C */
    void m8301C() {
        AbstractC2034b.m8460d(mo8290m(), "Writing handshake requires an opened stream", new Object[0]);
        AbstractC2034b.m8460d(!this.f6552t, "Handshake already completed", new Object[0]);
        m8321w((C7041w) C7041w.m31105g0().m31109y(this.f6551s.m8162a()).m23721o());
    }

    /* JADX INFO: renamed from: D */
    void m8302D(List list) {
        AbstractC2034b.m8460d(mo8290m(), "Writing mutations requires an opened stream", new Object[0]);
        AbstractC2034b.m8460d(this.f6552t, "Handshake must be complete before writing mutations", new Object[0]);
        C7041w.b bVarM31105g0 = C7041w.m31105g0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bVarM31105g0.m31108x(this.f6551s.m8156L((AbstractC1780f) it.next()));
        }
        bVarM31105g0.m31110z(this.f6553u);
        m8321w((C7041w) bVarM31105g0.m23721o());
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void mo8289l() {
        super.mo8289l();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo8290m() {
        return super.mo8290m();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo8291n() {
        return super.mo8291n();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: t */
    public void mo8294t() {
        this.f6552t = false;
        super.mo8294t();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo8295u() {
        super.mo8295u();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: v */
    protected void mo8303v() {
        if (this.f6552t) {
            m8302D(Collections.EMPTY_LIST);
        }
    }

    /* JADX INFO: renamed from: x */
    AbstractC5104i m8304x() {
        return this.f6553u;
    }

    /* JADX INFO: renamed from: y */
    boolean m8305y() {
        return this.f6552t;
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo8292p(C7042x c7042x) {
        this.f6553u = c7042x.m31114c0();
        this.f6552t = true;
        ((a) this.f6573m).mo8221c();
    }
}

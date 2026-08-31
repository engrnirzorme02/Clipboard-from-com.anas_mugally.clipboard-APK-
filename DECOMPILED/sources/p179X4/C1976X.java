package p179X4;

import com.google.protobuf.AbstractC5104i;
import java.util.Map;
import p151T4.C1477B1;
import p158U4.C1698v;
import p186Y4.AbstractC2034b;
import p186Y4.C2037e;
import p351s5.AbstractC7031m;
import p351s5.C7032n;
import p351s5.C7033o;

/* JADX INFO: renamed from: X4.X */
/* JADX INFO: loaded from: classes.dex */
public class C1976X extends AbstractC1980c {

    /* JADX INFO: renamed from: t */
    public static final AbstractC5104i f6548t = AbstractC5104i.f19401b;

    /* JADX INFO: renamed from: s */
    private final C1964K f6549s;

    /* JADX INFO: renamed from: X4.X$a */
    interface a extends InterfaceC1970Q {
        /* JADX INFO: renamed from: d */
        void mo8220d(C1698v c1698v, AbstractC1974V abstractC1974V);
    }

    C1976X(C1998u c1998u, C2037e c2037e, C1964K c1964k, a aVar) {
        super(c1998u, AbstractC7031m.m30772a(), c2037e, C2037e.d.LISTEN_STREAM_CONNECTION_BACKOFF, C2037e.d.LISTEN_STREAM_IDLE, C2037e.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f6549s = c1964k;
    }

    /* JADX INFO: renamed from: A */
    public void m8288A(C1477B1 c1477b1) {
        AbstractC2034b.m8460d(mo8290m(), "Watching queries requires an open stream", new Object[0]);
        C7032n.b bVarM30791y = C7032n.m30785h0().m30792z(this.f6549s.m8162a()).m30791y(this.f6549s.m8158R(c1477b1));
        Map mapM8155K = this.f6549s.m8155K(c1477b1);
        if (mapM8155K != null) {
            bVarM30791y.m30790x(mapM8155K);
        }
        m8321w((C7032n) bVarM30791y.m23721o());
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
    public /* bridge */ /* synthetic */ void mo8294t() {
        super.mo8294t();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo8295u() {
        super.mo8295u();
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo8292p(C7033o c7033o) {
        mo8293q(c7033o);
    }

    @Override // p179X4.AbstractC1980c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo8293q(C7033o c7033o) {
        this.f6572l.m8499e();
        AbstractC1974V abstractC1974VM8176x = this.f6549s.m8176x(c7033o);
        ((a) this.f6573m).mo8220d(this.f6549s.m8175w(c7033o), abstractC1974VM8176x);
    }

    /* JADX INFO: renamed from: z */
    public void m8298z(int i7) {
        AbstractC2034b.m8460d(mo8290m(), "Unwatching targets requires an open stream", new Object[0]);
        m8321w((C7032n) C7032n.m30785h0().m30792z(this.f6549s.m8162a()).m30789A(i7).m23721o());
    }
}

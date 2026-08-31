package p168W0;

import androidx.work.C2896b;
import p026D0.InterfaceC0180k;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.AbstractC7468w;

/* JADX INFO: renamed from: W0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1813o implements InterfaceC1812n {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f5883a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f5884b;

    /* JADX INFO: renamed from: c */
    private final AbstractC7468w f5885c;

    /* JADX INFO: renamed from: d */
    private final AbstractC7468w f5886d;

    /* JADX INFO: renamed from: W0.o$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C1811m c1811m) throws Throwable {
            String str = c1811m.f5881a;
            if (str == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, str);
            }
            byte[] bArrM14501k = C2896b.m14501k(c1811m.f5882b);
            if (bArrM14501k == null) {
                interfaceC0180k.mo910m0(2);
            } else {
                interfaceC0180k.mo909V(2, bArrM14501k);
            }
        }
    }

    /* JADX INFO: renamed from: W0.o$b */
    class b extends AbstractC7468w {
        b(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: W0.o$c */
    class c extends AbstractC7468w {
        c(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C1813o(AbstractC7462q abstractC7462q) {
        this.f5883a = abstractC7462q;
        this.f5884b = new a(abstractC7462q);
        this.f5885c = new b(abstractC7462q);
        this.f5886d = new c(abstractC7462q);
    }

    @Override // p168W0.InterfaceC1812n
    /* JADX INFO: renamed from: a */
    public void mo7528a(String str) {
        this.f5883a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5885c.m33083b();
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo911t(1, str);
        }
        this.f5883a.m33029e();
        try {
            interfaceC0180kM33083b.mo913y();
            this.f5883a.m33042z();
        } finally {
            this.f5883a.m33031i();
            this.f5885c.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1812n
    /* JADX INFO: renamed from: b */
    public void mo7529b() {
        this.f5883a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5886d.m33083b();
        this.f5883a.m33029e();
        try {
            interfaceC0180kM33083b.mo913y();
            this.f5883a.m33042z();
        } finally {
            this.f5883a.m33031i();
            this.f5886d.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1812n
    /* JADX INFO: renamed from: c */
    public void mo7530c(C1811m c1811m) {
        this.f5883a.m33028d();
        this.f5883a.m33029e();
        try {
            this.f5884b.m33016k(c1811m);
            this.f5883a.m33042z();
        } finally {
            this.f5883a.m33031i();
        }
    }
}

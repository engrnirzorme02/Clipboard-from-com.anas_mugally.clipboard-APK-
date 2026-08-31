package p374v4;

import java.util.Map;
import p030D4.C0198b;
import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: v4.t */
/* JADX INFO: loaded from: classes.dex */
class C7255t {

    /* JADX INFO: renamed from: a */
    private InterfaceC0210n f28969a = null;

    /* JADX INFO: renamed from: b */
    private Map f28970b = null;

    /* JADX INFO: renamed from: v4.t$a */
    class a implements b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7245j f28971a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ c f28972b;

        a(C7245j c7245j, c cVar) {
            this.f28971a = c7245j;
            this.f28972b = cVar;
        }

        @Override // p374v4.C7255t.b
        /* JADX INFO: renamed from: a */
        public void mo32105a(C0198b c0198b, C7255t c7255t) {
            c7255t.m32104b(this.f28971a.m31999p(c0198b), this.f28972b);
        }
    }

    /* JADX INFO: renamed from: v4.t$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo32105a(C0198b c0198b, C7255t c7255t);
    }

    /* JADX INFO: renamed from: v4.t$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo32057a(C7245j c7245j, InterfaceC0210n interfaceC0210n);
    }

    /* JADX INFO: renamed from: a */
    public void m32103a(b bVar) {
        Map map = this.f28970b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                bVar.mo32105a((C0198b) entry.getKey(), (C7255t) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m32104b(C7245j c7245j, c cVar) {
        InterfaceC0210n interfaceC0210n = this.f28969a;
        if (interfaceC0210n != null) {
            cVar.mo32057a(c7245j, interfaceC0210n);
        } else {
            m32103a(new a(c7245j, cVar));
        }
    }
}

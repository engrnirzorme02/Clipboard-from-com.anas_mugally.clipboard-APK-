package p216c2;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p198a2.C2187c;
import p198a2.InterfaceC2194j;
import p198a2.InterfaceC2195k;
import p266i2.InterfaceC5689e;
import p274j2.C5855r;
import p274j2.C5859v;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: c2.u */
/* JADX INFO: loaded from: classes.dex */
public class C3005u implements InterfaceC3004t {

    /* JADX INFO: renamed from: e */
    private static volatile AbstractC3006v f12421e;

    /* JADX INFO: renamed from: a */
    private final InterfaceC6328a f12422a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6328a f12423b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5689e f12424c;

    /* JADX INFO: renamed from: d */
    private final C5855r f12425d;

    C3005u(InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, InterfaceC5689e interfaceC5689e, C5855r c5855r, C5859v c5859v) {
        this.f12422a = interfaceC6328a;
        this.f12423b = interfaceC6328a2;
        this.f12424c = interfaceC5689e;
        this.f12425d = c5855r;
        c5859v.m26272c();
    }

    /* JADX INFO: renamed from: b */
    private AbstractC2993i m14970b(AbstractC2999o abstractC2999o) {
        AbstractC2993i.a aVarMo14909g = AbstractC2993i.m14946a().mo14911i(this.f12422a.mo27283a()).mo14917o(this.f12423b.mo27283a()).mo14916n(abstractC2999o.mo14922g()).mo14910h(new C2992h(abstractC2999o.mo14918b(), abstractC2999o.m14963d())).mo14909g(abstractC2999o.mo14919c().mo8919a());
        if (abstractC2999o.mo14919c().mo8923e() != null && abstractC2999o.mo14919c().mo8923e().mo8924a() != null) {
            aVarMo14909g.mo14914l(abstractC2999o.mo14919c().mo8923e().mo8924a());
        }
        abstractC2999o.mo14919c().mo8920b();
        return aVarMo14909g.mo14906d();
    }

    /* JADX INFO: renamed from: c */
    public static C3005u m14971c() {
        AbstractC3006v abstractC3006v = f12421e;
        if (abstractC3006v != null) {
            return abstractC3006v.mo14942m();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: d */
    private static Set m14972d(InterfaceC2990f interfaceC2990f) {
        return interfaceC2990f instanceof InterfaceC2991g ? Collections.unmodifiableSet(((InterfaceC2991g) interfaceC2990f).mo14943a()) : Collections.singleton(C2187c.m8925b("proto"));
    }

    /* JADX INFO: renamed from: f */
    public static void m14973f(Context context) {
        if (f12421e == null) {
            synchronized (C3005u.class) {
                try {
                    if (f12421e == null) {
                        f12421e = AbstractC2989e.m14936a().mo14938b(context).mo14937a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p216c2.InterfaceC3004t
    /* JADX INFO: renamed from: a */
    public void mo14969a(AbstractC2999o abstractC2999o, InterfaceC2195k interfaceC2195k) {
        this.f12424c.mo25238a(abstractC2999o.mo14921f().m14966f(abstractC2999o.mo14919c().mo8922d()), m14970b(abstractC2999o), interfaceC2195k);
    }

    /* JADX INFO: renamed from: e */
    public C5855r m14974e() {
        return this.f12425d;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC2194j m14975g(InterfaceC2990f interfaceC2990f) {
        return new C3001q(m14972d(interfaceC2990f), AbstractC3000p.m14964a().mo14933b(interfaceC2990f.getName()).mo14934c(interfaceC2990f.getExtras()).mo14932a(), this);
    }
}

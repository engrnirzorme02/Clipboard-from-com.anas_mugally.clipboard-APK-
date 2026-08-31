package p285k5;

import java.util.Iterator;
import java.util.Set;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;

/* JADX INFO: renamed from: k5.c */
/* JADX INFO: loaded from: classes.dex */
public class C6068c implements InterfaceC6074i {

    /* JADX INFO: renamed from: a */
    private final String f23838a;

    /* JADX INFO: renamed from: b */
    private final C6069d f23839b;

    C6068c(Set set, C6069d c6069d) {
        this.f23838a = m27105d(set);
        this.f23839b = c6069d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6074i m27103b(InterfaceC2211d interfaceC2211d) {
        return new C6068c(interfaceC2211d.m8989e(AbstractC6071f.class), C6069d.m27107a());
    }

    /* JADX INFO: renamed from: c */
    public static C2210c m27104c() {
        return C2210c.m8965e(InterfaceC6074i.class).m8983b(C2224q.m9036o(AbstractC6071f.class)).m8987f(new InterfaceC2214g() { // from class: k5.b
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return C6068c.m27103b(interfaceC2211d);
            }
        }).m8985d();
    }

    /* JADX INFO: renamed from: d */
    private static String m27105d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC6071f abstractC6071f = (AbstractC6071f) it.next();
            sb.append(abstractC6071f.mo27101b());
            sb.append('/');
            sb.append(abstractC6071f.mo27102c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p285k5.InterfaceC6074i
    /* JADX INFO: renamed from: a */
    public String mo27106a() {
        if (this.f23839b.m27108b().isEmpty()) {
            return this.f23838a;
        }
        return this.f23838a + ' ' + m27105d(this.f23839b.m27108b());
    }
}

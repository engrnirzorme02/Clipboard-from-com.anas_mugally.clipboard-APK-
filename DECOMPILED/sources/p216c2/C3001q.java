package p216c2;

import java.util.Set;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;
import p198a2.InterfaceC2193i;
import p198a2.InterfaceC2194j;

/* JADX INFO: renamed from: c2.q */
/* JADX INFO: loaded from: classes.dex */
final class C3001q implements InterfaceC2194j {

    /* JADX INFO: renamed from: a */
    private final Set f12413a;

    /* JADX INFO: renamed from: b */
    private final AbstractC3000p f12414b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC3004t f12415c;

    C3001q(Set set, AbstractC3000p abstractC3000p, InterfaceC3004t interfaceC3004t) {
        this.f12413a = set;
        this.f12414b = abstractC3000p;
        this.f12415c = interfaceC3004t;
    }

    @Override // p198a2.InterfaceC2194j
    /* JADX INFO: renamed from: a */
    public InterfaceC2193i mo8933a(String str, Class cls, C2187c c2187c, InterfaceC2192h interfaceC2192h) {
        if (this.f12413a.contains(c2187c)) {
            return new C3003s(this.f12414b, str, c2187c, interfaceC2192h, this.f12415c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2187c, this.f12413a));
    }
}

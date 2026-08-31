package p336q6;

import kotlin.jvm.internal.AbstractC6100C;
import p145S5.AbstractC1423a;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5367l;
import p360t6.AbstractC7139w;
import p360t6.C7116P;

/* JADX INFO: renamed from: q6.s */
/* JADX INFO: loaded from: classes.dex */
public class C6863s extends C6849e {

    /* JADX INFO: renamed from: x */
    private final int f27490x;

    /* JADX INFO: renamed from: y */
    private final EnumC6845a f27491y;

    public C6863s(int i7, EnumC6845a enumC6845a, InterfaceC5367l interfaceC5367l) {
        super(i7, interfaceC5367l);
        this.f27490x = i7;
        this.f27491y = enumC6845a;
        if (enumC6845a == EnumC6845a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC6100C.m27139b(C6849e.class).mo27115b() + " instead").toString());
        }
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i7 + " was specified").toString());
    }

    /* JADX INFO: renamed from: c1 */
    static /* synthetic */ Object m30065c1(C6863s c6863s, Object obj, InterfaceC1875e interfaceC1875e) throws Throwable {
        C7116P c7116pM31517c;
        Object objM30067e1 = c6863s.m30067e1(obj, true);
        if (!(objM30067e1 instanceof C6855k.a)) {
            return C1444v.f4971a;
        }
        C6855k.m30035e(objM30067e1);
        InterfaceC5367l interfaceC5367l = c6863s.f27451b;
        if (interfaceC5367l == null || (c7116pM31517c = AbstractC7139w.m31517c(interfaceC5367l, obj, null, 2, null)) == null) {
            throw c6863s.m29973a0();
        }
        AbstractC1423a.m6060a(c7116pM31517c, c6863s.m29973a0());
        throw c7116pM31517c;
    }

    /* JADX INFO: renamed from: d1 */
    private final Object m30066d1(Object obj, boolean z7) {
        InterfaceC5367l interfaceC5367l;
        C7116P c7116pM31517c;
        Object objMo29982k = super.mo29982k(obj);
        if (C6855k.m30039i(objMo29982k) || C6855k.m30038h(objMo29982k)) {
            return objMo29982k;
        }
        if (!z7 || (interfaceC5367l = this.f27451b) == null || (c7116pM31517c = AbstractC7139w.m31517c(interfaceC5367l, obj, null, 2, null)) == null) {
            return C6855k.f27480b.m30044c(C1444v.f4971a);
        }
        throw c7116pM31517c;
    }

    /* JADX INFO: renamed from: e1 */
    private final Object m30067e1(Object obj, boolean z7) {
        return this.f27491y == EnumC6845a.DROP_LATEST ? m30066d1(obj, z7) : m29970S0(obj);
    }

    @Override // p336q6.C6849e, p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: i */
    public Object mo29980i(Object obj, InterfaceC1875e interfaceC1875e) {
        return m30065c1(this, obj, interfaceC1875e);
    }

    @Override // p336q6.C6849e, p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: k */
    public Object mo29982k(Object obj) {
        return m30067e1(obj, false);
    }

    @Override // p336q6.C6849e
    /* JADX INFO: renamed from: p0 */
    protected boolean mo29985p0() {
        return this.f27491y == EnumC6845a.DROP_OLDEST;
    }
}

package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0093a;
import p016B6.AbstractC0094b;
import p016B6.AbstractC0095c;
import p016B6.AbstractC0098f;
import p016B6.AbstractC0099g;
import p016B6.InterfaceC0096d;
import p040E6.AbstractC0393b;
import p056G6.AbstractC0488b;

/* JADX INFO: renamed from: F6.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0439E {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0096d m1882a(InterfaceC0096d interfaceC0096d, AbstractC0488b module) {
        InterfaceC0096d interfaceC0096dM1882a;
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        AbstractC6118n.m27187e(module, "module");
        if (!AbstractC6118n.m27183a(interfaceC0096d.mo374e(), AbstractC0098f.a.f525a)) {
            return interfaceC0096d.isInline() ? m1882a(interfaceC0096d.mo378i(0), module) : interfaceC0096d;
        }
        InterfaceC0096d interfaceC0096dM370b = AbstractC0093a.m370b(module, interfaceC0096d);
        return (interfaceC0096dM370b == null || (interfaceC0096dM1882a = m1882a(interfaceC0096dM370b, module)) == null) ? interfaceC0096d : interfaceC0096dM1882a;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC0438D m1883b(AbstractC0393b abstractC0393b, InterfaceC0096d desc) {
        AbstractC6118n.m27187e(abstractC0393b, "<this>");
        AbstractC6118n.m27187e(desc, "desc");
        AbstractC0098f abstractC0098fMo374e = desc.mo374e();
        if (abstractC0098fMo374e instanceof AbstractC0094b) {
            return EnumC0438D.POLY_OBJ;
        }
        if (AbstractC6118n.m27183a(abstractC0098fMo374e, AbstractC0099g.b.f528a)) {
            return EnumC0438D.LIST;
        }
        if (!AbstractC6118n.m27183a(abstractC0098fMo374e, AbstractC0099g.c.f529a)) {
            return EnumC0438D.OBJ;
        }
        InterfaceC0096d interfaceC0096dM1882a = m1882a(desc.mo378i(0), abstractC0393b.m1674d());
        AbstractC0098f abstractC0098fMo374e2 = interfaceC0096dM1882a.mo374e();
        if ((abstractC0098fMo374e2 instanceof AbstractC0095c) || AbstractC6118n.m27183a(abstractC0098fMo374e2, AbstractC0098f.b.f526a)) {
            return EnumC0438D.MAP;
        }
        if (abstractC0393b.m1673c().m1678c()) {
            return EnumC0438D.LIST;
        }
        throw AbstractC0456q.m1963b(interfaceC0096dM1882a);
    }
}

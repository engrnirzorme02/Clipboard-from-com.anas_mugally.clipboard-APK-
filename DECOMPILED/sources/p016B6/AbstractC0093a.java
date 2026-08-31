package p016B6;

import kotlin.jvm.internal.AbstractC6118n;
import p032D6.C0243x;
import p056G6.AbstractC0488b;
import p286k6.InterfaceC6077c;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: B6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6077c m369a(InterfaceC0096d interfaceC0096d) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        if (interfaceC0096d instanceof C0243x) {
            return m369a(((C0243x) interfaceC0096d).m1169k());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0096d m370b(AbstractC0488b abstractC0488b, InterfaceC0096d descriptor) {
        InterfaceC7616b interfaceC7616bM2088b;
        AbstractC6118n.m27187e(abstractC0488b, "<this>");
        AbstractC6118n.m27187e(descriptor, "descriptor");
        InterfaceC6077c interfaceC6077cM369a = m369a(descriptor);
        if (interfaceC6077cM369a == null || (interfaceC7616bM2088b = AbstractC0488b.m2088b(abstractC0488b, interfaceC6077cM369a, null, 2, null)) == null) {
            return null;
        }
        return interfaceC7616bM2088b.mo1120a();
    }
}

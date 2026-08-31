package p032D6;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0097e;
import p016B6.AbstractC0098f;
import p016B6.InterfaceC0096d;

/* JADX INFO: renamed from: D6.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0240u {
    /* JADX INFO: renamed from: a */
    public static final int m1166a(InterfaceC0096d interfaceC0096d, InterfaceC0096d[] typeParams) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        AbstractC6118n.m27187e(typeParams, "typeParams");
        int iHashCode = (interfaceC0096d.mo371a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableM383a = AbstractC0097e.m383a(interfaceC0096d);
        Iterator it = iterableM383a.iterator();
        int iHashCode2 = 1;
        int i7 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i8 = i7 * 31;
            String strMo371a = ((InterfaceC0096d) it.next()).mo371a();
            if (strMo371a != null) {
                iHashCode3 = strMo371a.hashCode();
            }
            i7 = i8 + iHashCode3;
        }
        Iterator it2 = iterableM383a.iterator();
        while (it2.hasNext()) {
            int i9 = iHashCode2 * 31;
            AbstractC0098f abstractC0098fMo374e = ((InterfaceC0096d) it2.next()).mo374e();
            iHashCode2 = i9 + (abstractC0098fMo374e != null ? abstractC0098fMo374e.hashCode() : 0);
        }
        return (((iHashCode * 31) + i7) * 31) + iHashCode2;
    }
}

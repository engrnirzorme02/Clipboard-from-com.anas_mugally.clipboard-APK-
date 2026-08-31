package p032D6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;

/* JADX INFO: renamed from: D6.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233n {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0096d[] f957a = new InterfaceC0096d[0];

    /* JADX INFO: renamed from: a */
    public static final Set m1150a(InterfaceC0096d interfaceC0096d) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        if (interfaceC0096d instanceof InterfaceC0222c) {
            return ((InterfaceC0222c) interfaceC0096d).mo1124b();
        }
        HashSet hashSet = new HashSet(interfaceC0096d.mo375f());
        int iMo375f = interfaceC0096d.mo375f();
        for (int i7 = 0; i7 < iMo375f; i7++) {
            hashSet.add(interfaceC0096d.mo376g(i7));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0096d[] m1151b(List list) {
        InterfaceC0096d[] interfaceC0096dArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC0096dArr = (InterfaceC0096d[]) list.toArray(new InterfaceC0096d[0])) == null) ? f957a : interfaceC0096dArr;
    }
}

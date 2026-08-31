package p032D6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p408z6.C7617c;

/* JADX INFO: renamed from: D6.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0234o {
    /* JADX INFO: renamed from: a */
    public static final void m1152a(int i7, int i8, InterfaceC0096d descriptor) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i9 = (~i7) & i8;
        for (int i10 = 0; i10 < 32; i10++) {
            if ((i9 & 1) != 0) {
                arrayList.add(descriptor.mo376g(i10));
            }
            i9 >>>= 1;
        }
        throw new C7617c(arrayList, descriptor.mo371a());
    }
}
